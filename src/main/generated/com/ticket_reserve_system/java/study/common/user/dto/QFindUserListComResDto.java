package com.ticket_reserve_system.java.study.common.user.dto;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.processing.Generated;

/**
 * com.ticket_reserve_system.java.study.common.user.dto.QFindUserListComResDto is a Querydsl Projection type for FindUserListComResDto
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QFindUserListComResDto extends ConstructorExpression<FindUserListComResDto> {

    private static final long serialVersionUID = -1055743404L;

    public QFindUserListComResDto(com.querydsl.core.types.Expression<Long> id, com.querydsl.core.types.Expression<String> name, com.querydsl.core.types.Expression<String> email, com.querydsl.core.types.Expression<com.ticket_reserve_system.java.study.common.user.entity.Gender> gender) {
        super(FindUserListComResDto.class, new Class<?>[]{long.class, String.class, String.class, com.ticket_reserve_system.java.study.common.user.entity.Gender.class}, id, name, email, gender);
    }

}

