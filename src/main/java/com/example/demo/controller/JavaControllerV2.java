package com.example.demo.controller;

import java.time.LocalDateTime;
import java.util.List;


import com.example.demo.entity.JournalEntity;
import com.example.demo.service.JournalEntryService;

import org.springframework.web.bind.annotation.RestController;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
@RequestMapping("/journal")
public class JavaControllerV2  {

    @Autowired 
    private JournalEntryService journalEntryService;

    @GetMapping()    
    public List<JournalEntity> getAll() {
    return journalEntryService.getAllEntries();
    }

 @PostMapping()
    public JournalEntity addEntry(@RequestBody JournalEntity entry) {
        entry.setDate(LocalDateTime.now());
        journalEntryService.saveEntry(entry);
        return entry;
    }
    
    @GetMapping("/id/{myid}")
    public JournalEntity getJournalEntry(@PathVariable ObjectId myid) {
        return journalEntryService.getEntryById(myid).orElse(null);
    }
    
    @DeleteMapping("/id/{myid}")
    public boolean deleteJournalEntry(@PathVariable ObjectId myid) {       
        journalEntryService.deleteEntryById(myid); 
        return true;
    }
    @PutMapping("/id/{myid}")
    public JournalEntity putJournalEntry(@PathVariable ObjectId myid, @RequestBody JournalEntity entity) {
        return null;
    }
}