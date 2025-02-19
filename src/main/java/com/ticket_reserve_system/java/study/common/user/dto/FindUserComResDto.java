package com.ticket_reserve_system.java.study.common.user.dto;

import com.ticket_reserve_system.java.study.common.user.entity.User;
import lombok.Builder;

public record FindUserComResDto(Long id, String name, String email) {
    @Builder
    public FindUserComResDto(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public static FindUserComResDto from(User user) {
        return FindUserComResDto.builder()
                .id(user.getId())
                .name(user.getName())
                .email(user.getEmail())
                .build();
    }
}
