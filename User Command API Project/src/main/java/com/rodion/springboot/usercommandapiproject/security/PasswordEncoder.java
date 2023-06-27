package com.rodion.springboot.usercommandapiproject.security;

public interface PasswordEncoder {
    String hashPassword(String password);
}
