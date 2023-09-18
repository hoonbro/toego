package com.project.toego.domain.memer;

import com.project.toego.interfaces.member.MemberDto;

public interface MemberService {
    MemberDto.Response registerMember(MemberDto.RegisterMember request);
}
