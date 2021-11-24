package com.zorba11.thechefserver.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document
public class User {

    @Id
    private String id;
    private String fullName;
    @Indexed(unique = true)
    private String email;
    private List<Order> orderedItems;
}
