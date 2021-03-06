package com.lkymin.admin.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
//선언된 모든 필드의 get 메소드를 생성해 준다.

@RequiredArgsConstructor
//선언된 모든 final 필드가 포함된 생성자를 생성해 준다.
//final이 없는 필드는 생성자에 포함되지 않습니다.
public class HelloResponseDto {

    //gradle 5부터는 어노테이션을 구별해서 추가해줘야함 (build.gradle 참조)
    private final String name;
    private final  int amount;
}

