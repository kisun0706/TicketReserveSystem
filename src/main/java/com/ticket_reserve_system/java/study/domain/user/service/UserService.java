package com.ticket_reserve_system.java.study.domain.user.service;

import com.ticket_reserve_system.java.study.common.user.dto.FindUserComResDto;
import com.ticket_reserve_system.java.study.common.user.dto.FindUserListComResDto;
import com.ticket_reserve_system.java.study.common.user.entity.User;
import com.ticket_reserve_system.java.study.common.user.service.CommonUserService;
import com.ticket_reserve_system.java.study.domain.user.dto.AddUserApiReqDto;
import com.ticket_reserve_system.java.study.domain.user.dto.FindUserApiResDto;
import com.ticket_reserve_system.java.study.domain.user.dto.FindUserListApiReqDto;
import com.ticket_reserve_system.java.study.domain.user.dto.FindUserListApiResDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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

    @Transactional(readOnly = true)
    public List<FindUserListApiResDto> getUserList(FindUserListApiReqDto regDto){
        List<FindUserListComResDto> result = userService.getUserList(regDto.toComDto());
        return result.stream().map(FindUserListApiResDto::from).toList();
    }

}
