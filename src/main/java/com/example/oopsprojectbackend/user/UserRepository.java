package com.example.oopsprojectbackend.user;

import com.example.oopsprojectbackend.cartItem.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query("SELECT u FROM User u WHERE u.id = ?1")
    Optional<User> findUserById(Long id);

    @Query("SELECT u FROM User u WHERE u.email = ?1")
    Optional<User> findUserByEmail(String email);

    @Query("SELECT u FROM User u WHERE u.email = ?1 AND u.password = ?2")
    Optional<User> checkIfExists(String email , String password);

    @Query("SELECT u FROM User u WHERE u.id = ?1 AND u.password = ?2")
    Optional<User> checkIfExistsUid(Long uid , String password);

}
