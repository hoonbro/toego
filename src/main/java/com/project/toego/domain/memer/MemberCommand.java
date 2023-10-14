package com.project.toego.domain.memer;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;
import org.springframework.stereotype.Service;

public class MemberCommand {

    @Getter
    @Builder
    @ToString
    public static class RegisterMember{
        private String email;

        private String password;

        private String nickName;

        private String job;

        public Member toEntity(){
            return Member.builder()
                    .email(email)
                    .password(password)
                    .nickName(nickName)
                    .job(job)
                    .build();
        }
    }
}
