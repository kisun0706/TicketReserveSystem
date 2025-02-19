package com.ticket_reserve_system.java.study.common.user.dto;

import com.ticket_reserve_system.java.study.common.user.entity.Gender;
import com.ticket_reserve_system.java.study.common.user.entity.User;
import lombok.Builder;

import java.time.LocalDateTime;

public record FindUserComResDto(Long id, String name, String email, Gender gender) {
    @Builder
    public FindUserComResDto(Long id, String name, String email, Gender gender) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public static FindUserComResDto from(User user) {
        return FindUserComResDto.builder()
                .id(user.getId())
                .name(user.getName())
                .email(user.getEmail())
                .gender(user.getGender())
                .build();
    }
}
