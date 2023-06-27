package com.rodion.springboot.usercommandapiproject.command;

import com.rodion.springboot.usercoreproject.model.User;
import lombok.Builder;
import lombok.Data;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Data
@Builder
public class UpdateUserCommand {

    @TargetAggregateIdentifier
    private String id;
    
    @NotNull(message = "no user details were supplied")
    @Valid
    private User user;
}