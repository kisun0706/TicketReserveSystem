package com.ticket_reserve_system.java.study.domain.user.controller;

import com.ticket_reserve_system.java.study.domain.user.dto.UserReqDto;
import com.ticket_reserve_system.java.study.domain.user.dto.UserResDto;
import com.ticket_reserve_system.java.study.domain.user.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping("/api/users")
    public ResponseEntity<UserResDto> createUser(@Valid @RequestBody UserReqDto request){
        UserResDto user = userService.createUser(request);
        return ResponseEntity.ok(user);
    }

    @GetMapping("/api/users/{email}")
    public ResponseEntity<UserResDto> getUserByEmail(@PathVariable String email){
        UserResDto user = userService.getUserByEmail(email);
        return ResponseEntity.ok(user);
    }
}
