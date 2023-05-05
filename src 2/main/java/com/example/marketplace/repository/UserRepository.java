package com.example.marketplace.repository;

import com.example.marketplace.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User,String> {
    User findByUsername(String username);
    User findByUserid(int id);

//    User findAll, findUserbytype, findby Name and type,

    List<User> findAllByUsername(String Username);

    List<User>  findAllByUsertype(String usertype);

    List<User>  findAllByUsertypeAndUsername(String usertype,String username);


}
