package com.ticket_reserve_system.java.study.common.user.dto;

import com.querydsl.core.annotations.QueryProjection;
import com.ticket_reserve_system.java.study.common.user.entity.Gender;
import lombok.Builder;

@Builder
public record FindUserListComResDto(Long id, String name, String email, Gender gender) {
    @QueryProjection
    public FindUserListComResDto{}
}
