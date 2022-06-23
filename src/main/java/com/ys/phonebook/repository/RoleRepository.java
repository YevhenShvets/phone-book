package com.ys.phonebook.repository;

/*
 * @author yevhenshvets
 * @project phone-book
 * @class RoleRepository
 * @version 1.0.0
 * @since 17.06.2022, 14:45
 * Software Engineering Department
 *
 * Copyright (c) 1993-1996 Sun Microsystems, Inc. All Rights Reserved.
 */

import com.ys.phonebook.models.ERole;
import com.ys.phonebook.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
