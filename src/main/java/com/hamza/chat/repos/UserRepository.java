package com.hamza.chat.repos;
import org.springframework.data.jpa.repository.JpaRepository;
import com.hamza.chat.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
User findByUsername (String username);
}