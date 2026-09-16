package com.example.springstudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // Spring Boot 애플리케이션의 시작점이라는 표시 Spring이 이 클래스를 기준으로 설정을 읽고, 필요한 객체들을 준비하고, 웹 서버 실행까지 이어감.
public class SpringstudyApplication {

    // SpringApplication.run(SpringstudyApplication.class, args); <<- 이 한 줄이 실제로 Spring Boot 애플리케이션을 실행시킴.
    // public static void main(String[] args) <<- 그냥 평범한 Java 프로그램의 시작점, 그 안에서 Spring Boot 실행 메서드를 호출하는 구조라고 보면됨.

    //    Java main() 시작
    //          ↓
    //    SpringApplication.run(...)
    //          ↓
    //    Spring Boot 초기화
    //          ↓
    //    내장 웹 서버 시작
    //          ↓
    //    요청 받을 준비 완료


    // 실행 후 확인할 핵심 문구는 대략 " Tomcat started on port 8080 " 이런거 그리고 " Started SpringstudyApplication " 와 비슷한 메세지가 나오면 성공임.
    public static void main(String[] args) {
        SpringApplication.run(SpringstudyApplication.class, args);
    }

}
