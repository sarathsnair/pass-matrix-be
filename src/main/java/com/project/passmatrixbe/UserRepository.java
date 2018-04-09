package com.project.passmatrixbe;

import org.springframework.data.repository.CrudRepository;
import com.project.passmatrixbe.User;

import java.sql.Blob;

public interface UserRepository extends CrudRepository<User, Long> {
    User findUserByUsername(String username);
    User findUserByUsernameAndImagedataAndCellid(String username, String imagedata, Integer cellid);
}