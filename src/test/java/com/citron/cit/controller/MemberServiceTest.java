package com.citron.cit.controller;

import static org.junit.jupiter.api.Assertions.*;

import ch.qos.logback.core.joran.util.beans.BeanDescriptionFactory;
import com.citron.cit.service.MemberService;
import com.citron.cit.service.dto.MemberServiceDTO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MemberServiceTest {

    final MemberService memberService = null;
    final MemberServiceDTO memberServiceDTO = null;

    @BeforeEach
    void setUp() {

    }

    @Test
    void 회원가입() {

        assert memberService != null;
        memberService.create(MemberServiceDTO.builder().name("홍길동").build());

    }
}