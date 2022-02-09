## 9주차 과제
### Goal
1. Java8 문법 활용하기(Optional, Stream)
   - test code 통과
2. Enum 적용하기
   - status
3. 캡슐화 지키기
   - 캡슐화를 통해 만들어지는 메서드의 이름 가독성 높게 작성
4. 네이밍 잘 짓기
   - 캡슐화를 통해 만들어지는 메서드의 이름 가독성 높게 작성

### Report
- [Notion](https://trusted-jump-805.notion.site/zero-base-backend-9-_-9f5193c4ccce496397a9432c3efafee7)


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
