package com.ticket_reserve_system.java.study.common.user.service;

import com.ticket_reserve_system.java.study.common.user.dto.AddUserComReqDto;
import com.ticket_reserve_system.java.study.common.user.dto.FindUserComResDto;
import com.ticket_reserve_system.java.study.common.user.dto.FindUserListComReqDto;
import com.ticket_reserve_system.java.study.common.user.dto.FindUserListComResDto;
import com.ticket_reserve_system.java.study.common.user.entity.User;
import com.ticket_reserve_system.java.study.common.user.repository.UserRepository;
import com.ticket_reserve_system.java.study.domain.user.dto.FindUserApiResDto;
import com.ticket_reserve_system.java.study.global.exception.DuplicateUserException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CommonUserService {
    private final UserRepository userRepository;

    public User createUser(AddUserComReqDto req){
        if (userRepository.findByEmail(req.email()).isPresent()){
            throw new DuplicateUserException("이미 가입된 이메일입니다.");
        }

        return userRepository.save(req.toEntity());
    }

    @Transactional(readOnly = true)
    public FindUserApiResDto getUserByEmail(String email){
        User user = userRepository.findByEmail(email).orElseThrow(()->new IllegalArgumentException("사용자를 찾을 수 없습니다."));
        return FindUserApiResDto.from(user);
    }

    @Transactional(readOnly = true)
    public List<FindUserListComResDto> getUserList(FindUserListComReqDto comDto){
        return userRepository.findUserList(comDto);
    }
}
