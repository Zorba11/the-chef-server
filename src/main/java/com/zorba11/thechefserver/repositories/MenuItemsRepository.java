package com.zorba11.thechefserver.repositories;

import com.zorba11.thechefserver.models.MenuItem;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

public interface MenuItemsRepository extends MongoRepository<MenuItem, String> {
}
