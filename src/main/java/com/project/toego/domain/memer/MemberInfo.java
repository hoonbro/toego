package com.project.toego.domain.memer;

import lombok.Getter;

@Getter
public class MemberInfo {
    private final long id;
    private final String email;
    private final String password;
    private final String memberToken;
    private final String nickName;
    private final String profile;
    private final String job;

    public MemberInfo(Member member) {
        this.id = member.getId();
        this.email = member.getEmail();
        this.password = member.getPassword();
        this.memberToken = member.getMemberToken();
        this.nickName = member.getNickName();
        this.profile = member.getProfile();
        this.job = member.getJob();
    }
}
