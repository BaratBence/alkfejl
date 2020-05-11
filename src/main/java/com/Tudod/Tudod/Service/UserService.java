package com.Tudod.Tudod.Service;

import com.Tudod.Tudod.DataModel.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
