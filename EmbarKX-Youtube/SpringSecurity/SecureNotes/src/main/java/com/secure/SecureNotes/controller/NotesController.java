package com.secure.SecureNotes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.AuthenticatedPrincipal;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.secure.SecureNotes.model.Notes;
import com.secure.SecureNotes.repository.NoteRepository;
import com.secure.SecureNotes.service.NoteService;

import lombok.Delegate;

@RestController
@RequestMapping("/api/notes")
public class NotesController {

   

	
	@Autowired
	private NoteService noteService;


    
	
	@PostMapping
	public Notes createNote(@RequestBody String content,
			@AuthenticationPrincipal UserDetails userDetails) {
		
		String username = userDetails.getUsername();
		System.out.println("USER DETAILS : " + username);
		return noteService.createNoteForUser(username, content);
		
	}
	
	@GetMapping
	public List<Notes> getuserNotes(@AuthenticationPrincipal UserDetails userDetails){
		
		String username = userDetails.getUsername();
		System.out.println("USER DETAILS : "+ username);
		return noteService.getNotesForUser(username);
		
	}
	
	@PutMapping("/{noteId}")
	public Notes UpdateNotes(@PathVariable Long noteId,
			@RequestBody String content,
			@AuthenticationPrincipal UserDetails userDetails) {
		
		String username = userDetails.getUsername();
		return noteService.updateNotForUser(noteId, content, username);
		
	}
	
	
	@DeleteMapping("/{noteId}")
	public void  deleteNote(@PathVariable Long noteId,
			@AuthenticationPrincipal UserDetails userDetails) {
		String username = userDetails.getUsername();
		noteService.deleteNotForUser(noteId, username);
		
	}
	
	
	
}
