package com.zorba11.thechefserver.services;

import com.zorba11.thechefserver.models.MenuItem;
import com.zorba11.thechefserver.repositories.MenuItemsRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class MenuItemService {

    @Autowired
    private MenuItemsRepository menuItemsRepository;

    public Optional<List<MenuItem>> fetchAllMenuItems() {
        Optional<List<MenuItem>> items = Optional.ofNullable(menuItemsRepository.findAll());
        return items;
    }

    public MenuItem addMenuItem(MenuItem menuItem) {
        System.out.println("menuitem.." + menuItem);
        return menuItemsRepository.save(menuItem);
    }
}
