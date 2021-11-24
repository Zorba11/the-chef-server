package com.zorba11.thechefserver.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document
public class Chef {

    @Id
    private String id;
    private List<Order> ordersToPrepare;
    private Boolean isPreparing;
}
