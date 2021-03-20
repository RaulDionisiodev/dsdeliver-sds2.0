package com.rauldionisio.dsdeliver.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rauldionisio.dsdeliver.entites.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
