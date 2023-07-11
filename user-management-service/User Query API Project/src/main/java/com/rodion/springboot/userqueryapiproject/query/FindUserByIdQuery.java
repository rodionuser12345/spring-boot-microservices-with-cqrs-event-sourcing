package com.rodion.springboot.userqueryapiproject.query;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FindUserByIdQuery implements UserQuery {
    private String id;
}
