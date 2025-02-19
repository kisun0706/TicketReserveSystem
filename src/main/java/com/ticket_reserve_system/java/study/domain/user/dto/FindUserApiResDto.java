package com.ticket_reserve_system.java.study.domain.user.dto;

import com.ticket_reserve_system.java.study.common.user.entity.Gender;
import com.ticket_reserve_system.java.study.common.user.entity.User;
import lombok.Builder;

import java.io.Serializable;

@Builder
public record FindUserApiResDto(Long id, String name, String email, Gender gender) implements Serializable {
    public static FindUserApiResDto from(User user) {
        return FindUserApiResDto.builder()
                .id(user.getId())
                .name(user.getName())
                .email(user.getEmail())
                .gender(user.getGender())
                .build();
    }
}
