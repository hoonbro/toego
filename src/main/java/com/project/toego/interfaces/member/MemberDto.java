package com.project.toego.interfaces.member;

import com.project.toego.domain.memer.Member;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.ToString;

public class MemberDto {
    @Getter
    @ToString
    public static class RegisterMember{
        @Email(message = "email 형식에 맞아야합니다.")
        @NotNull(message = "email 은 필수값입니다.")
        private String email;

        @NotBlank(message = "password 은 필수값입니다.")
        private String password;

        @NotBlank(message = "nickName 은 필수값입니다.")
        private String nickName;

        @NotBlank(message = "job 은 필수값입니다.")
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

    @Getter
    @ToString
    public static class Response{
        private String email;

        private String password;

        private String nickName;

        private String job;

        public Response(Member member){
            this.email = member.getEmail();
            this.password = member.getPassword();
            this.nickName = member.getNickName();
            this.job = member.getJob();
        }
    }
}
