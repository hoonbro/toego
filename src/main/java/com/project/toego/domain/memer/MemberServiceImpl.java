package com.project.toego.domain.memer;

import com.project.toego.interfaces.member.MemberDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService{

    private final MemberStore memberStore;

    private final MemberReader memberReader;

    @Override
    @Transactional
    public MemberInfo registerMember(MemberCommand.RegisterMember command) {
        var requestMember = command.toEntity();
        Member member = memberStore.store(requestMember);
        return new MemberInfo(member);
    }

    @Override
    @Transactional(readOnly = true)
    public MemberInfo getMemberInfo(String memberToken) {
        Member member = memberReader.getMember(memberToken);
        return new MemberInfo(member);
    }
}
