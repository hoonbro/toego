package com.project.toego.application.member;

import com.project.toego.domain.memer.MemberCommand;
import com.project.toego.domain.memer.MemberInfo;
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

    public MemberInfo registerMember(MemberCommand.RegisterMember command){
        var response = memberService.registerMember(command);
        return response;
    }
}
