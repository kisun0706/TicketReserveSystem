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
@RequestMapping("/api/users")
public class UserController {
    private final UserService userService;

    @PostMapping
    public ResponseEntity<UserResDto> createUser(@Valid @RequestBody UserReqDto request){
        UserResDto user = userService.createUser(request);
        return ResponseEntity.ok(user);
    }

    @GetMapping("/{email}")
    public ResponseEntity<UserResDto> getUserByEmail(@PathVariable("email") String email){
        UserResDto user = userService.getUserByEmail(email);
        return ResponseEntity.ok(user);
    }
}
