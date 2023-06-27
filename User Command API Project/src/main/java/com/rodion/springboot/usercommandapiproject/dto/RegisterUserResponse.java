package com.rodion.springboot.usercommandapiproject.dto;

import com.rodion.springboot.usercoreproject.dto.BaseResponse;

public class RegisterUserResponse extends BaseResponse {
    private String id;

    public RegisterUserResponse(String id, String message) {
        super(message);
        this.id = id;
    }
}