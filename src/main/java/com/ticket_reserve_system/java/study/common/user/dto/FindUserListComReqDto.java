package com.ticket_reserve_system.java.study.common.user.dto;

import com.ticket_reserve_system.java.study.common.user.entity.Gender;
import lombok.Builder;

@Builder
public record FindUserListComReqDto(String name, Gender gender) {
}
