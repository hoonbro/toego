package com.project.toego.interfaces.member;

import com.project.toego.application.member.MemberFacade;
import com.project.toego.domain.memer.MemberCommand;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/members")
public class MemberApiController {
    private final MemberFacade memberFacade;

    @PostMapping("/register")
    public ResponseEntity<?> registerMember(@Validated @RequestBody MemberDto.RegisterMemberRequest request){
        var command = request.toCommand();
        var memberInfo = memberFacade.registerMember(command);
        var response = new MemberDto.Response(memberInfo);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
}
