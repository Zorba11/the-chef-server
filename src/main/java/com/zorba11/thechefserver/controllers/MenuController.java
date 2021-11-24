package com.zorba11.thechefserver.controllers;

import com.zorba11.thechefserver.models.MenuItem;
import com.zorba11.thechefserver.services.MenuItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/menuitem")
public class MenuController {

    @Autowired
    private MenuItemService menuItemService;

    @GetMapping
    public Optional<List<MenuItem>> fetchAllMenuItems() {
        return menuItemService.fetchAllMenuItems();
    }

    @PostMapping
    public MenuItem addMenuItem(@RequestBody MenuItem menuItem) {
        return menuItemService.addMenuItem(menuItem);
    }
}
