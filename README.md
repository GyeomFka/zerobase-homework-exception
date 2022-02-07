## 10주차 과제
### Goal
1. RuntimeException 바꾸기 [V]
2. ExceptionCode 활용하기 [V]
3. GlobalExceptionHandler 작성하기 [V]

### Exception Code
    NOT_FOUND_COURSE(HttpStatus.valueOf(500),"강의를 찾을 수 없습니다."),
    INVALID_COURSE_STATUS(HttpStatus.valueOf(400),"유효하지 않은 상태코드 입니다."),
    ALREADY_CLOSED(HttpStatus.valueOf(400),"종료된 강의는 조회할 수 없습니다."),

### Kind of Exception Class
- InvalidStatusException
- NotFoundCourseException

### Report
- [Notion](https://trusted-jump-805.notion.site/zero-base-backend-10-_-5b82189f9db34377a51a4923174ddf28)
