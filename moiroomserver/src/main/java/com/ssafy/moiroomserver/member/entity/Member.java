package com.ssafy.moiroomserver.member.entity;

import com.ssafy.moiroomserver.global.entity.BaseEntity;
import jakarta.persistence.*;

@Entity
public class Member extends BaseEntity {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long memberId;
}