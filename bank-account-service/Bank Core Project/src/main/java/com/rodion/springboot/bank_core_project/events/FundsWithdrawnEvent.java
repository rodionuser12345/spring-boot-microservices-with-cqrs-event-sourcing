package com.rodion.springboot.bank_core_project.events;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FundsWithdrawnEvent {
    private String id;
    private double amount;
    private double balance;
}
