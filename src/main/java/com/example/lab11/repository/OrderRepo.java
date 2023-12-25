package com.example.lab11.repository;

import com.example.lab11.entity.OrderEntity;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepo extends CrudRepository<OrderEntity, Long> {

}
