package com.example.finalB1.finalB1.repository;

import com.example.finalB1.finalB1.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Optional;

@Repository
@Transactional
public interface IUserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUser(String usurious);
}
