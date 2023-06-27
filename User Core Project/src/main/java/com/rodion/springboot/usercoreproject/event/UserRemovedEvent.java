package com.rodion.springboot.usercoreproject.event;

import lombok.Data;

@Data
public class UserRemovedEvent {
    private String id;
}