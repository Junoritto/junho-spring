package com.citron.cit.controller;

import static org.junit.jupiter.api.Assertions.*;

import ch.qos.logback.core.joran.util.beans.BeanDescriptionFactory;
import com.citron.cit.service.MemberService;
import com.citron.cit.service.dto.MemberServiceDTO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MemberServiceTest {

    MemberService memberService = new MemberService() {
        @Override
        public void create(MemberServiceDTO dto) {
            // 더미 메서드 구현 (아무 작업도 하지 않음)
        }
    };

    @BeforeEach
    void setUp() {

    }

    @Test
    void 회원가입() {

        memberService.create(MemberServiceDTO.builder().name("홍길동").build());

    }
}