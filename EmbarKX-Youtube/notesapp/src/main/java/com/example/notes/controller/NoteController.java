package com.example.notes.controller;

import java.time.Instant;
import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import com.example.notes.model.Note;
import com.example.notes.repository.NoteRepository;
import com.example.notes.repository.UserRepository;

@RestController
@RequestMapping("/api/notes")
public class NoteController {

    private final NoteRepository noteRepo;
    private final UserRepository userRepo;

    public NoteController(NoteRepository noteRepo, UserRepository userRepo) {
        this.noteRepo = noteRepo;
        this.userRepo = userRepo;
    }

    // 🟢 Create note
    @PostMapping
    public ResponseEntity<?> create(@RequestBody Map<String, String> b, Authentication auth) {
        var user = userRepo.findByUsername(auth.getName()).orElseThrow();
        Note note = new Note();
        note.setTitle(b.get("title"));
        note.setContent(b.get("content"));
        note.setOwner(user);
        note.setCreatedAt(Instant.now());
        note.setUpdatedAt(Instant.now());
        noteRepo.save(note);
        return ResponseEntity.ok(Map.of("id", note.getId()));
    }

    // 🟢 Get all notes for logged-in user
    @GetMapping
    public List<Map<String, Object>> myNotes(Authentication auth) {
        var user = userRepo.findByUsername(auth.getName()).orElseThrow();
        return noteRepo.findByOwner(user).stream().map(n -> {
            Map<String, Object> map = new java.util.HashMap<>();
            map.put("id", n.getId());
            map.put("title", n.getTitle());
            map.put("content", n.getContent());
            return map;
        }).toList();
    }



    // 🟡 Update a note (only by its owner)
    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody Map<String, String> b, Authentication auth) {
        var user = userRepo.findByUsername(auth.getName()).orElseThrow();
        var note = noteRepo.findById(id).orElseThrow();
        if (!note.getOwner().getId().equals(user.getId()))
            return ResponseEntity.status(403).body("Forbidden");
        note.setTitle(b.get("title"));
        note.setContent(b.get("content"));
        note.setUpdatedAt(Instant.now());
        noteRepo.save(note);
        return ResponseEntity.ok("updated");
    }

    // 🔴 Delete a note (only by its owner)
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id, Authentication auth) {
        var user = userRepo.findByUsername(auth.getName()).orElseThrow();
        var note = noteRepo.findById(id).orElseThrow();
        if (!note.getOwner().getId().equals(user.getId()))
            return ResponseEntity.status(403).body("Forbidden");
        noteRepo.delete(note);
        return ResponseEntity.ok("deleted");
    }
}
