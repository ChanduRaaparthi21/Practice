package com.secure.SecureNotes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.secure.SecureNotes.model.Notes;
import com.secure.SecureNotes.repository.NoteRepository;



@Service
public class NoteServiceImpl implements NoteService {

	
	@Autowired
	private NoteRepository noteRepository;
	
	
	@Override
	public Notes createNoteForUser(String unsername, String content) {
	Notes notes = new Notes();
	notes.setContent(content);
	notes.setOwnerUsername(unsername);
	Notes saveNote = noteRepository.save(notes);
	
	return saveNote;
	}

	@Override
	public Notes updateNotForUser(Long noteId, String content, String username) {
		
		Notes notes = noteRepository.findById(noteId).orElseThrow(()-> new RuntimeException("Note Not found"));
		notes.setContent(content);
		Notes updatedNotes = noteRepository.save(notes);
		return updatedNotes;
	}

	@Override
	public void deleteNotForUser(Long noteId, String username) {
		noteRepository.deleteById(noteId);
		
	}

	@Override
	public List<Notes> getNotesForUser(String username) {
		List<Notes> personalNotes = noteRepository.findByOwnerUsername(username);
		return personalNotes;
	}

}
