package com.example.medicineservice.controller;

import com.example.medicineservice.common.utils.IPUtils;
import com.example.medicineservice.data.entity.UserInfo;
import com.example.medicineservice.domain.dto.UserInfoCreateRequest;
import com.example.medicineservice.domain.dto.UserInfoRequest;
import com.example.medicineservice.domain.dto.UserUpdateRequest;
import com.example.medicineservice.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;


@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping( IPUtils.defaultUrl)
public class UserResource extends  BaseResource {
    private final UserService userService;

    @PostMapping("/")
    public UserInfo getUserInfo(@RequestBody UserInfoRequest userInfoRequest) {
        return userService.getUserInfo(userInfoRequest.getEmail());
    }

    @PostMapping("/create")
    public UserInfo createUserInfo(@RequestBody UserInfoCreateRequest userInfoCreateRequest) {
        return userService.createUserInfo(userInfoCreateRequest);
    }

    @PostMapping("/update")
    public UserInfo updateUserInfo(@RequestBody UserUpdateRequest userUpdateRequest) {
        return userService.updateUserInfo(userUpdateRequest);
    }
}
