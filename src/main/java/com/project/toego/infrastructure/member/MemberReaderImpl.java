package com.project.toego.infrastructure.member;

import com.project.toego.common.error.ErrorCode;
import com.project.toego.common.exception.BaseException;
import com.project.toego.domain.memer.Member;
import com.project.toego.domain.memer.MemberReader;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class MemberReaderImpl implements MemberReader {
    private final MemberRepository memberRepository;

    @Override
    public Member getMember(String email) {
        return memberRepository.findByEmail(email)
                .orElseThrow(() -> new BaseException(ErrorCode.ENTITY_NOT_FOUND));
    }
}
