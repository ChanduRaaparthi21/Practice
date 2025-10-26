package com.chandu.RoomMates.service;

import com.chandu.RoomMates.entity.Mates;
import com.chandu.RoomMates.repository.MateRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MateService {

    @Autowired
    private MateRepository mateRepository;

    public List<Mates> getAllMates() {
        return mateRepository.findAll();
    }

    public Optional<Mates> getMateById(Long id) {
        return mateRepository.findById(id);
    }

    public Optional<Mates> getMateByName(String name) {
        return mateRepository.findByName(name);
    }

    @Transactional
    public Mates addMate(Mates mate) {
        return mateRepository.save(mate);
    }
    @Transactional
    public List<Mates> addMates(List<Mates> mates) {
        return mateRepository.saveAll(mates);
    }


    public Mates updateMate(Long id, Mates updatedMate) {
        return mateRepository.findById(id)
                .map(existingMate -> {
                    existingMate.setName(updatedMate.getName());
                    existingMate.setAge(updatedMate.getAge());
                    return mateRepository.save(existingMate);
                }).orElseThrow(() -> new RuntimeException("Mate not found with id: " + id));
    }

    public void deleteMate(Long id) {
        mateRepository.deleteById(id);
    }



}
