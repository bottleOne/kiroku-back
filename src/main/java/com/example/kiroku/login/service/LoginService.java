package com.example.kiroku.login.service;

import com.example.kiroku.login.dto.KakaoDto;
import com.example.kiroku.login.dto.LoginDto;
import com.example.kiroku.user.domain.User;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public interface LoginService {
    void loginUser(String username, String password, HttpServletResponse response);
    String getSocialLoginUrl();
    KakaoDto.KakaoUserInfoResponse getAccess(String code);
    void logout(HttpServletRequest request, HttpServletResponse response);
}
