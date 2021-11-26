package com.zorba11.thechefserver.repositories;

import com.zorba11.thechefserver.models.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrdersRepository extends MongoRepository<Order, String> {
}
