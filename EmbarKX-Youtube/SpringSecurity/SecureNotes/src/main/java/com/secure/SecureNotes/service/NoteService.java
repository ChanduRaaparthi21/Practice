package com.secure.SecureNotes.service;

import java.util.List;

import com.secure.SecureNotes.model.Notes;

public interface NoteService {

	Notes createNoteForUser(String unsername, String content);
	
	Notes updateNotForUser(Long noteId,String content, String username);
	
	void deleteNotForUser(Long noteId, String username);
	
	List<Notes> getNotesForUser(String username);
	
}
