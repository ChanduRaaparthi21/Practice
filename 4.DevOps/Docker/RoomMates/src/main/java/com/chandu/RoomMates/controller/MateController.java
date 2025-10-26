package com.chandu.RoomMates.controller;

import com.chandu.RoomMates.entity.Mates;
import com.chandu.RoomMates.service.MateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/mates")
public class MateController {

    @Autowired
    private MateService mateService;

    @GetMapping
    public ResponseEntity<List<Mates>> getAllMates() {
        return ResponseEntity.ok(mateService.getAllMates());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Mates> getMateById(@PathVariable Long id) {
        return mateService.getMateById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/name/{name}")
    public ResponseEntity<Mates> getMateByName(@PathVariable String name) {
        return mateService.getMateByName(name)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("add")
    public Mates addMate(@RequestBody Mates mate) {
        return mateService.addMate(mate);
    }
    @PostMapping("addAll")
    public ResponseEntity<List<Mates>> addMates(@RequestBody List<Mates> mates) {
        return ResponseEntity.ok(mateService.addMates(mates));
    }


    @PutMapping("/{id}")
    public ResponseEntity<Mates> updateMate(@PathVariable Long id, @RequestBody Mates updatedMate) {
        try {
            return ResponseEntity.ok(mateService.updateMate(id, updatedMate));
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMate(@PathVariable Long id) {
        mateService.deleteMate(id);
        return ResponseEntity.noContent().build();
    }




}
