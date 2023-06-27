package com.rodion.springboot.userqueryapiproject.handler;

import com.rodion.springboot.usercoreproject.event.UserRegisteredEvent;
import com.rodion.springboot.usercoreproject.event.UserRemovedEvent;
import com.rodion.springboot.usercoreproject.event.UserUpdatedEvent;

public interface UserEventHandler {
    void on(UserRegisteredEvent event);

    void on(UserUpdatedEvent event);

    void on(UserRemovedEvent event);
}
