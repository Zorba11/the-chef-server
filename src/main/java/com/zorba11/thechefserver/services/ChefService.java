package com.zorba11.thechefserver.services;

import com.zorba11.thechefserver.models.Chef;
import com.zorba11.thechefserver.models.MenuItem;
import com.zorba11.thechefserver.models.Order;
import com.zorba11.thechefserver.repositories.OrdersRepository;
import com.zorba11.thechefserver.services.kafkaservices.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Service
public class ChefService {

    @Autowired
    private OrdersRepository ordersRepository;

    @Autowired
    Producer producer;

    private Chef chef = new Chef();


    public Order gatherIngredients(Order order) {
        order.setOrderedRecievedAt(LocalDateTime.now());
        chef.startGathering(order);
        ordersRepository.save(order);

        producer.sendMessage("chef started gathering");

        return order;
    }
}
