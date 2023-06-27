package com.rodion.springboot.usercommandapiproject.command;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Data
@AllArgsConstructor
public class RemoveUserCommand {
 
    @TargetAggregateIdentifier
    private String id;
}
