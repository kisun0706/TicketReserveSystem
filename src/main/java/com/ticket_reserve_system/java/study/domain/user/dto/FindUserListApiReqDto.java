package com.ticket_reserve_system.java.study.domain.user.dto;

import com.ticket_reserve_system.java.study.common.user.dto.FindUserListComReqDto;
import com.ticket_reserve_system.java.study.common.user.entity.Gender;

import java.io.Serializable;

public record FindUserListApiReqDto(String name, Gender gender) implements Serializable {
    public FindUserListComReqDto toComDto(){
        return FindUserListComReqDto.builder()
                .name(name)
                .gender(gender)
                .build();
    }
}
