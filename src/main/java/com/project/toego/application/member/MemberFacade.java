package com.project.toego.application.member;

import com.project.toego.domain.memer.MemberService;
import com.project.toego.interfaces.member.MemberDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class MemberFacade {

    private final MemberService memberService;

    public MemberDto.Response registerMember(MemberDto.RegisterMember request){
        var response = memberService.registerMember(request);
        return response;
    }
}
