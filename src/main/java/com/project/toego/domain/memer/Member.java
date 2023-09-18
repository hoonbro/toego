package com.project.toego.domain.memer;

import com.project.toego.domain.BaseTimeEntity;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
@Entity
@NoArgsConstructor
@Table(name = "members")
public class Member extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String email;
    private String password;
    private String nickName;
    private String profile;
    private String job;

    @Builder
    public Member(String email, String password, String nickName, String job) {
        this.email = email;
        this.password = password;
        this.nickName = nickName;
        this.job = job;
    }
}
