package com.ticket_reserve_system.java.study.domain.user.dto;

import com.ticket_reserve_system.java.study.domain.user.entity.User;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class UserResDto {
    private Long id;
    private String name;
    private String email;

    public static UserResDto toDto(User user){
        return UserResDto.builder()
                .id(user.getId())
                .name(user.getName())
                .email(user.getEmail())
                .build();
    }
}
