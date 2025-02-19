package com.ticket_reserve_system.java.study.domain.user.dto;

import com.ticket_reserve_system.java.study.common.user.dto.AddUserComReqDto;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

import java.io.Serializable;
public record AddUserApiReqDto(
        Long id,

        @NotBlank(message = "이름은 필수 입력 값입니다.")
        String name,

        @Email(message = "유효한 이메일 형식이 아닙니다.")
        @NotBlank(message = "이메일은 필수 입력 값입니다.")
        String email
) implements Serializable {
    public AddUserComReqDto toComDto(){
        return AddUserComReqDto.builder()
                .id(id)
                .name(name)
                .email(email)
                .build();
    }
}
