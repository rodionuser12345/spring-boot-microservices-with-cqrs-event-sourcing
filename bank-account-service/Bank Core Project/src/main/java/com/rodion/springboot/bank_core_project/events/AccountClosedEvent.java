package com.rodion.springboot.bank_core_project.events;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AccountClosedEvent {
    private String id;
}
