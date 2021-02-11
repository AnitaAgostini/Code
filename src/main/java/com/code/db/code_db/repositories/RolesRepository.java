package com.code.db.code_db.repositories;

import com.code.db.code_db.entity.Roles;
import com.code.db.code_db.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface RolesRepository extends CrudRepository<Roles, Long> {
    Roles findByRoleAndUser(String role, User user);
    List<Roles> findByUser(User user);
}