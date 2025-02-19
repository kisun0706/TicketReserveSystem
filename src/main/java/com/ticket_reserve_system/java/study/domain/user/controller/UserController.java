package com.ticket_reserve_system.java.study.domain.user.controller;

import com.ticket_reserve_system.java.study.domain.user.dto.AddUserApiReqDto;
import com.ticket_reserve_system.java.study.domain.user.dto.FindUserApiResDto;
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
    public ResponseEntity<FindUserApiResDto> createUser(@Valid @RequestBody AddUserApiReqDto request){
        return ResponseEntity.ok(userService.createUserApi(request));
    }

    @GetMapping("/{email}")
    public ResponseEntity<FindUserApiResDto> getUserByEmail(@PathVariable("email") String email){
        return ResponseEntity.ok(userService.getUserByEmailApi(email));
    }
}
