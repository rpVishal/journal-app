package com.example.demo.repository;

import com.example.demo.entity.JournalEntity;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JournalEntryRepo extends MongoRepository<JournalEntity, ObjectId> {

}
