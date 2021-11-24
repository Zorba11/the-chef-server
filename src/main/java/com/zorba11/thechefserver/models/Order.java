package com.zorba11.thechefserver.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document
public class Order {

    @Id
    private String id;
    private List<MenuItem> itemsToPrepare;
    private Boolean isOrderPrepared;
    private Boolean isOrderCancelled;
}
