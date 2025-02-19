package com.ticket_reserve_system.java.study.common.user.repository;

import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQueryFactory;
import com.ticket_reserve_system.java.study.common.user.dto.FindUserListComReqDto;
import com.ticket_reserve_system.java.study.common.user.dto.FindUserListComResDto;
import com.ticket_reserve_system.java.study.common.user.dto.QFindUserListComResDto;
import com.ticket_reserve_system.java.study.common.user.entity.Gender;
import lombok.RequiredArgsConstructor;

import java.util.List;

import static com.ticket_reserve_system.java.study.common.user.entity.QUser.user;

@RequiredArgsConstructor
public class UserRepositoryCustomImpl implements UserRepositoryCustom {

    private final JPAQueryFactory queryFactory;

    @Override
    public List<FindUserListComResDto> findUserList(FindUserListComReqDto comDto) {
        return queryFactory.select(
                new QFindUserListComResDto(
                        user.id,
                        user.name,
                        user.email,
                        user.gender)
                )
        .from(user)
                .where(
                        genderEq(comDto.gender()),
                        nameLike(comDto.name())
                )
        .fetch();
    }

    private BooleanExpression genderEq(Gender gender) {
        return gender != null ? user.gender.eq(gender) : null;
    }

    private BooleanExpression nameLike(String name) {
        return (name != null && !name.isEmpty()) ? user.name.like("%" + name + "%") : null;
    }
}
