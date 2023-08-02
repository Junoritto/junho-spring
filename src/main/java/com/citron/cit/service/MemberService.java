package com.citron.cit.service;

import com.citron.cit.service.dto.MemberServiceDTO;
import lombok.Builder;
import org.springframework.stereotype.Service;


public interface MemberService {

    public void create(MemberServiceDTO memberServiceDTO);

}
