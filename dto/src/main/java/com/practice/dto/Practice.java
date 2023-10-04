package com.practice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "practice")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Practice {
    @Id
    private ObjectId id;
    private String name;
    private String password;
    private Integer age;
    private String fatherName;

}
