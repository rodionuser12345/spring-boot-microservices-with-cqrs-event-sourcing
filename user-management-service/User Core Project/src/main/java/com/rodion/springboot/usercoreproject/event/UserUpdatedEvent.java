package com.rodion.springboot.usercoreproject.event;

import com.rodion.springboot.usercoreproject.model.User;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserUpdatedEvent {
    private String id;
    private User user;
}
