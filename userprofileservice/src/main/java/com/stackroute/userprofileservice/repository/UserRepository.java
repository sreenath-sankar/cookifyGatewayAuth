package com.stackroute.userprofileservice.repository;

import com.stackroute.userprofileservice.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User,String> {
}
