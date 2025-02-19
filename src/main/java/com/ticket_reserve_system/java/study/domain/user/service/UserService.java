package com.ticket_reserve_system.java.study.domain.user.service;

import com.ticket_reserve_system.java.study.common.user.entity.User;
import com.ticket_reserve_system.java.study.common.user.service.CommonUserService;
import com.ticket_reserve_system.java.study.domain.user.dto.AddUserApiReqDto;
import com.ticket_reserve_system.java.study.domain.user.dto.FindUserApiResDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UserService {
    private final CommonUserService userService;

    public FindUserApiResDto createUserApi(AddUserApiReqDto req){
        User user = userService.createUser(req.toComDto());
        return FindUserApiResDto.from(user);
    }

    @Transactional(readOnly = true)
    public FindUserApiResDto getUserByEmailApi(String email){
        return userService.getUserByEmail(email);
    }

}
