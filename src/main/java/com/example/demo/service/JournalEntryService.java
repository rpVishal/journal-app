package com.example.demo.service;

import com.example.demo.entity.JournalEntity;
import com.example.demo.repository.JournalEntryRepo;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component 
public class JournalEntryService {

    @Autowired 
    private  JournalEntryRepo journalEntryRepo;

public void saveEntry(JournalEntity journalEntity) {
        journalEntryRepo.save(journalEntity);
    }

public List<JournalEntity> getAllEntries() {
return journalEntryRepo.findAll();
    }  

    public Optional<JournalEntity> getEntryById(ObjectId id) {
        return journalEntryRepo.findById(id);
    }

    public void deleteEntryById(ObjectId id) {
        journalEntryRepo.deleteById(id);
    }
}
