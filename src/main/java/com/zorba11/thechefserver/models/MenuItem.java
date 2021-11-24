package com.zorba11.thechefserver.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.annotation.processing.Generated;
import java.time.LocalDateTime;

@Data
@Document
public class MenuItem {

    @Id
    private String id;
    private String foodName;
    private LocalDateTime orderedTime;
    private LocalDateTime orderPreparedTime;
    private LocalDateTime orderCancelledTime;
    private Boolean itemReady;
}
