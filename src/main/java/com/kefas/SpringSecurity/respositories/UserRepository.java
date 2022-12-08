package com.kefas.SpringSecurity.respositories;

import com.kefas.SpringSecurity.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
   Optional<User> findByUuid(String uuid);
   Optional<User> findByEmailAddress(String email);

   boolean existsByEmailAddress(String email);
}
