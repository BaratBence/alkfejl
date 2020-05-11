package com.Tudod.Tudod.Repositories;

import com.Tudod.Tudod.DataModel.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
