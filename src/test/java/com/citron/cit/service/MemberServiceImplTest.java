package com.citron.cit.service;

import com.citron.cit.service.dto.MemberServiceDTO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class MemberServiceImplTest {

    final MemberService memberService = new MemberService() {
        @Override
        public void create(MemberServiceDTO dto) {
            // 테스트를 위한 더미 구현
        }
    };

    // MemberServiceImplTest(MemberService memberService) {
    //     this.memberService = memberService;
    // }

    @Test
    void 회원등록() {

        //memberService.get(MemberServiceDTO.builder().age(12).name("홍길동").build());

    }

}