package com.practice.dto;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PracticeRepository extends MongoRepository<Practice, ObjectId> {

}
