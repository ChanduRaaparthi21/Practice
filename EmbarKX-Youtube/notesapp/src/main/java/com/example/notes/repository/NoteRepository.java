package com.example.notes.repository;
import com.example.notes.model.Note;
import com.example.notes.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface NoteRepository extends JpaRepository<Note,Long>{
  List<Note> findByOwner(User owner);
}
