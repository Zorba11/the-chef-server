package com.zorba11.thechefserver.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.concurrent.TimeUnit;

@Data
@Document
public class Chef {

    @Id
    private String id;
    private List<Order> ordersToPrepare;
    private Boolean isPreparing;

    public void startGathering(Order order) {
        try {

//            kafka send message that its gathering
            TimeUnit.SECONDS.sleep(5);

            order.setHasIngredientsGathered(true);

            System.out.println("gathered order.." + order);
//            kafka message saying gathering done
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }
    }

//    executed based on kafka message
    public void startCooking() {
        try {
//            kafka send message that its gathering
            TimeUnit.SECONDS.sleep(5000);
//            kafka message saying gathering done
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }
    }
}
