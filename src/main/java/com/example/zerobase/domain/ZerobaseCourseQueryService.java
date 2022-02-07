package com.example.zerobase.domain;

import com.example.zerobase.type.ZerobaseCourseStatus;
import com.example.zerobase.web.exception.ExceptionCode;
import com.example.zerobase.web.exception.InvalidStatusException;
import com.example.zerobase.web.exception.NotFoundCourseException;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ZerobaseCourseQueryService {
	private final ZerobaseCourseRepository zerobaseCourseRepository;

	public ZerobaseCourse getOrThrow(Long id) {
		return zerobaseCourseRepository.findById(id)
			.filter(it -> !it.isHidden())
			.orElseThrow(() -> new NotFoundCourseException(ExceptionCode.NOT_FOUND_COURSE));
	}

	public List<ZerobaseCourse> getZerobaseCourseList(ZerobaseCourseStatus status) {

		checkStatus(status);

		return zerobaseCourseRepository.findAll()
			.stream()
			.filter(it -> !it.isHidden())
			.filter(it -> it.isSameStatus(status))
			.collect(Collectors.toList());
	}

	private void checkStatus(ZerobaseCourseStatus status) {
		if (status.isUnknown()) {
			throw new InvalidStatusException(ExceptionCode.INVALID_COURSE_STATUS);
		}

		if (status.isClose()) {
			throw new NotFoundCourseException(ExceptionCode.ALREADY_CLOSED);
		}
	}
}
