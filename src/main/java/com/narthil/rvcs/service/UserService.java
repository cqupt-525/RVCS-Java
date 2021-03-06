package com.narthil.rvcs.service;
import com.narthil.rvcs.pojo.UserInfo;

import java.util.Map;

import com.narthil.rvcs.dto.ResultInfo;

/**
 * UserService
 */
public interface UserService {

    ResultInfo<Map<String,Object>> login(String username, String password);
    ResultInfo<Object> register(UserInfo user);
    String refreshToken(String oldToken);
    ResultInfo<Map<String,Object>> getInfoByUsername(String username);
    ResultInfo<Map<String,Object>> updateUserInfo(UserInfo user);

    
}