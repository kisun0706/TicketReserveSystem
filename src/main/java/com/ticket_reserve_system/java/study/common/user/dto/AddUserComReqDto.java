package com.ticket_reserve_system.java.study.common.user.dto;

import com.ticket_reserve_system.java.study.common.user.entity.User;
import lombok.Builder;

import java.io.Serializable;

@Builder
public record AddUserComReqDto(Long id, String name, String email) implements Serializable {
    public User toEntity(){
        return User.builder()
                .id(id)
                .name(name)
                .email(email)
                .build();
    }
}
