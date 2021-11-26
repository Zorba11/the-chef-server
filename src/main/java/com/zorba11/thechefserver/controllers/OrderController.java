package com.zorba11.thechefserver.controllers;

import com.zorba11.thechefserver.models.MenuItem;
import com.zorba11.thechefserver.models.Order;
import com.zorba11.thechefserver.services.ChefService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/order")
@CrossOrigin(origins = "http://localhost:3000")
public class OrderController {

    @Autowired
    private ChefService chefService;

    @PostMapping
    public Order orderTheItem(@RequestBody Order order) {
        return chefService.gatherIngredients(order);
    }

}
