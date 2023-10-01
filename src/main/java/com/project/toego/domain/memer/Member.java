package com.project.toego.domain.memer;

import com.project.toego.common.exception.InvalidParamException;
import com.project.toego.common.util.TokenGenerator;
import com.project.toego.domain.BaseTimeEntity;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

@Slf4j
@Getter
@Entity
@NoArgsConstructor
@Table(name = "members")
public class Member extends BaseTimeEntity {
    private static final String PREFIX_PARTNER = "mem_";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String email;
    private String password;

    private String memberToken;
    private String nickName;
    private String profile;
    private String job;

    @Builder
    public Member(String email, String password, String nickName, String job) {
        if (StringUtils.isEmpty(email)) throw new InvalidParamException("empty email");
        if (StringUtils.isEmpty(password)) throw new InvalidParamException("empty password");
        if (StringUtils.isEmpty(nickName)) throw new InvalidParamException("empty nickname");
        if (StringUtils.isEmpty(job)) throw new InvalidParamException("empty job");

        this.email = email;
        this.password = password;
        this.nickName = nickName;
        this.job = job;
        this.memberToken = TokenGenerator.randomCharacterWithPrefix(PREFIX_PARTNER);
    }
}
