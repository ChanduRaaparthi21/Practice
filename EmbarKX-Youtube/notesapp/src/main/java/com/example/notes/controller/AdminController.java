package com.example.notes.controller;

import java.time.Instant;
import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.notes.model.Note;
import com.example.notes.repository.NoteRepository;

@RestController
@RequestMapping("/api/admin")
public class AdminController {

    private final NoteRepository noteRepo;

    public AdminController(NoteRepository noteRepo) {
        this.noteRepo = noteRepo;
    }

    @GetMapping("/notes")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public List<Map<String, Object>> allNotes() {
        return noteRepo.findAll().stream().map(n -> {
            Map<String, Object> map = new java.util.HashMap<>();
            map.put("id", n.getId());
            map.put("title", n.getTitle());
            map.put("content", n.getContent());
            map.put("ownerId", n.getOwner() != null ? n.getOwner().getId() : null);
            return map;
        }).toList();
    }

    @PutMapping("/notes/{id}")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public ResponseEntity<?> adminUpdate(@PathVariable Long id, @RequestBody Map<String, String> body) {
        Note note = noteRepo.findById(id).orElseThrow(() -> new RuntimeException("Note not found"));
        note.setTitle(body.get("title"));
        note.setContent(body.get("content"));
        note.setUpdatedAt(Instant.now());
        noteRepo.save(note);
        return ResponseEntity.ok("updated");
    }

    @DeleteMapping("/notes/{id}")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public ResponseEntity<?> adminDelete(@PathVariable Long id) {
        if (!noteRepo.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        noteRepo.deleteById(id);
        return ResponseEntity.ok("deleted");
    }
}
