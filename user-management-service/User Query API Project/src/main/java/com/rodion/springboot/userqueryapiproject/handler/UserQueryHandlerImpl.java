package com.rodion.springboot.userqueryapiproject.handler;

import com.rodion.springboot.userqueryapiproject.dto.UserLookupResponse;
import com.rodion.springboot.userqueryapiproject.query.FindAllUsersQuery;
import com.rodion.springboot.userqueryapiproject.query.FindUserByIdQuery;
import com.rodion.springboot.userqueryapiproject.query.SearchUsersQuery;
import com.rodion.springboot.userqueryapiproject.repository.UserRepository;
import org.axonframework.queryhandling.QueryHandler;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserQueryHandlerImpl implements UserQueryHandler {

    private final UserRepository userRepository;

    public UserQueryHandlerImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @QueryHandler
    @Override
    public UserLookupResponse getUserById(FindUserByIdQuery query) {
        var user = userRepository.findById(query.getId());
        return new UserLookupResponse(user.orElse(null));
    }

    @QueryHandler
    @Override
    public UserLookupResponse searchUsers(SearchUsersQuery query) {
        var users = new ArrayList<>(userRepository.findByFilterRegex(query.getFilter()));
        return new UserLookupResponse(users);
    }

    @QueryHandler
    @Override
    public UserLookupResponse getAllUsers(FindAllUsersQuery query) {
        var users = new ArrayList<>(userRepository.findAll());
        return new UserLookupResponse(users);
    }
}
