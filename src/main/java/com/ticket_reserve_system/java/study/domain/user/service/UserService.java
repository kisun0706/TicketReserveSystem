package com.ticket_reserve_system.java.study.domain.user.service;

import com.ticket_reserve_system.java.study.domain.user.dto.UserReqDto;
import com.ticket_reserve_system.java.study.domain.user.dto.UserResDto;
import com.ticket_reserve_system.java.study.domain.user.entity.User;
import com.ticket_reserve_system.java.study.domain.user.repository.UserRepository;
import com.ticket_reserve_system.java.study.global.exception.DuplicateUserException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public UserResDto createUser(UserReqDto req){
        if (userRepository.findByEmail(req.getEmail()).isPresent()){
            throw new DuplicateUserException("이미 가입된 이메일입니다.");
        }

        User user = User.builder()
                .email(req.getEmail())
                .name(req.getName())
                .build();
        userRepository.save(user);

        return UserResDto.toDto(user);
    }

    @Transactional(readOnly = true)
    public UserResDto getUserByEmail(String email){
        User user = userRepository.findByEmail(email).orElseThrow(()->new IllegalArgumentException("사용자를 찾을 수 없습니다."));
        return UserResDto.toDto(user);
    }

}
