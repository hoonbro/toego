package com.project.toego.domain.memer;

import com.project.toego.interfaces.member.MemberDto;

public interface MemberService {
    MemberInfo registerMember(MemberCommand.RegisterMember command);

    MemberInfo getMemberInfo(String memberToken);
}
