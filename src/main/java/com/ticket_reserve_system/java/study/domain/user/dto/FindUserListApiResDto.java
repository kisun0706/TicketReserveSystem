package com.ticket_reserve_system.java.study.domain.user.dto;

import com.ticket_reserve_system.java.study.common.user.dto.FindUserListComResDto;
import com.ticket_reserve_system.java.study.common.user.entity.Gender;
import com.ticket_reserve_system.java.study.common.user.entity.User;
import lombok.Builder;

import java.io.Serializable;

public record FindUserListApiResDto(Long id, String name, String email, Gender gender) implements Serializable {

    @Builder
    public FindUserListApiResDto {
    }

    public static FindUserListApiResDto from(FindUserListComResDto resDto) {
        return FindUserListApiResDto.builder()
                .id(resDto.id())
                .name(resDto.name())
                .email(resDto.email())
                .gender(resDto.gender())
                .build();
    }
}
