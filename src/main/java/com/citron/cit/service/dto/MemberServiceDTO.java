package com.citron.cit.service.dto;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

public class MemberServiceDTO {

    String userId;
    String Name;
    Integer age;

    @Builder
    public MemberServiceDTO(String userId, String name, Integer age) {
        this.userId = userId;
        Name = name;
        this.age = age;
    }

    public MemberServiceDTO(Integer age) {
        this.age = age;
    }
}
