package com.rodion.springboot.userqueryapiproject.query;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SearchUsersQuery implements UserQuery {
    private String filter;
}
