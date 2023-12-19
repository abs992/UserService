package com.user.user.app;

import com.user.user.app.models.User;
import org.springframework.data.repository.CrudRepository;
public interface UserRepository extends CrudRepository<User,Integer> {
}
