package com.example.demo.controller;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

import com.example.demo.entity.JournalEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
@RequestMapping("/journal")
public class JavaControllerFile {
    private Map<Long, JournalEntity> journalEntries = new HashMap<>();

    @GetMapping()    
    public List<JournalEntity> getAll() {
return new ArrayList<>(journalEntries.values());
    }

 @PostMapping()
    public boolean addEntry(@RequestBody JournalEntity entry) {
        journalEntries.put(entry.getId(), entry);
        return true;
    }

    @GetMapping("/id/{myid}")
    public JournalEntity getJournalEntry(@PathVariable Long myid) {
        return journalEntries.get(myid);
    }
    
    @DeleteMapping("/id/{myid}")
    public boolean deleteJournalEntry(@PathVariable Long myid) {
        journalEntries.remove(myid);
        return true;
    }
    @PutMapping("/id/{myid}")
    public JournalEntity putJournalEntry(@PathVariable Long myid, @RequestBody JournalEntity entity) {
        return journalEntries.put(myid, entity);
    }
}
