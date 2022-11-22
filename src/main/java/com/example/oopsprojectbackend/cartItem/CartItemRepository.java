package com.example.oopsprojectbackend.cartItem;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CartItemRepository extends JpaRepository<CartItem, Long> {

    @Query("SELECT c FROM CartItem c WHERE c.id = ?1")
    Optional<CartItem> findCartItembyId(Long id);

    @Query("SELECT c FROM CartItem c WHERE c.uid = ?1")
    Optional<CartItem[]> findCartItemsbyUid(Long uid);
}
