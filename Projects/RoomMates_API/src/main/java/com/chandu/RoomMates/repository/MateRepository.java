package com.chandu.RoomMates.repository;

import com.chandu.RoomMates.entity.Mates;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MateRepository extends JpaRepository<Mates, Long> {
    Optional<Mates> findByName(String name);
}
