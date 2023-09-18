package com.project.toego.infrastructure.member;

import com.project.toego.common.exception.InvalidParamException;
import com.project.toego.domain.memer.Member;
import com.project.toego.domain.memer.MemberStore;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.apache.commons.lang3.StringUtils;

@Slf4j
@Component
@RequiredArgsConstructor
public class MemberStoreImpl implements MemberStore {

    private final MemberRepository memberRepository;

    @Override
    public Member store(Member member) {
        validCheck(member);

        return memberRepository.save(member);
    }

    private void validCheck(Member member) {
        if(StringUtils.isEmpty(member.getEmail())) throw new InvalidParamException("Member.email");
        if(StringUtils.isEmpty(member.getPassword())) throw new InvalidParamException("Member.Password");
        if(StringUtils.isEmpty(member.getNickName())) throw new InvalidParamException("Member.NickName");
        if(StringUtils.isEmpty(member.getJob())) throw new InvalidParamException("Member.job");
    }
}
