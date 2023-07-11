package com.rodion.springboot.userqueryapiproject.dto;

import com.rodion.springboot.usercoreproject.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserLookupResponse {
    private List<User> users;
    private String errorMessage;

    public UserLookupResponse(User user) {
        this.users = new ArrayList<>();
        this.users.add(user);
    }

    public UserLookupResponse(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public UserLookupResponse(List<User> users) {
        this.users = users;
    }
}
