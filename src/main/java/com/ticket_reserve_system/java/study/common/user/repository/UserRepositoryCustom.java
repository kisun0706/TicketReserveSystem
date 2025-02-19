package com.ticket_reserve_system.java.study.common.user.repository;

import com.ticket_reserve_system.java.study.common.user.dto.FindUserListComReqDto;
import com.ticket_reserve_system.java.study.common.user.dto.FindUserListComResDto;

import java.util.List;

public interface UserRepositoryCustom {
    List<FindUserListComResDto> findUserList(FindUserListComReqDto comDto);
}
