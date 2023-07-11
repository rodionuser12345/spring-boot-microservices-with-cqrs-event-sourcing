package com.rodion.springboot.userqueryapiproject.handler;

import com.rodion.springboot.userqueryapiproject.dto.UserLookupResponse;
import com.rodion.springboot.userqueryapiproject.query.FindAllUsersQuery;
import com.rodion.springboot.userqueryapiproject.query.FindUserByIdQuery;
import com.rodion.springboot.userqueryapiproject.query.SearchUsersQuery;

public interface UserQueryHandler {
    UserLookupResponse getUserById(FindUserByIdQuery query);

    UserLookupResponse searchUsers(SearchUsersQuery query);

    UserLookupResponse getAllUsers(FindAllUsersQuery query);
}
