package com.project.toego.domain.memer;

import com.project.toego.interfaces.member.MemberDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService{

    private final MemberStore memberStore;

    @Override
    public MemberDto.Response registerMember(MemberDto.RegisterMember request) {
        var requestMember = request.toEntity();
        Member member = memberStore.store(requestMember);
        return new MemberDto.Response(member);
    }
}
