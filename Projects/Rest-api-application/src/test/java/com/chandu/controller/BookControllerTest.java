package com.chandu.controller;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.chandu.entity.Book;
import com.chandu.repository.BookRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

;

@RunWith(MockitoJUnitRunner.class)
public class BookControllerTest {

	private MockMvc mockMvc;
	
	ObjectMapper objectMapper = new ObjectMapper();
	ObjectWriter objectWriter = objectMapper.writer();
	
	
    @InjectMocks
    private BookController bookController;

    @Mock
    private BookRepository bookRepository;

    public BookControllerTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetAllBookRecords() {
        // Arrange
        Book book1 = new Book(1L, "Book 1", "Summary 1", 4);
        Book book2 = new Book(2L, "Book 2", "Summary 2", 4);
        when(bookRepository.findAll()).thenReturn(Arrays.asList(book1, book2));

        // Act
        var result = bookController.getAllBookRecords();

        // Assert
        assertNotNull(result);
        assertEquals(2, result.size());
        verify(bookRepository, times(1)).findAll();
    }

    @Test
    public void testGetBookById_Success() {
        // Arrange
        Book book = new Book(1L, "Book 1", "Summary 1", 4);
        when(bookRepository.findById(1L)).thenReturn(Optional.of(book));

        // Act
        var result = bookController.getBookById(1L);

        // Assert
        assertNotNull(result);
        assertEquals("Book 1", result.getName());
        verify(bookRepository, times(1)).findById(1L);
    }

    @Test
    public void testGetBookById_NotFound() {
        // Arrange
        when(bookRepository.findById(1L)).thenReturn(Optional.empty());

        // Act & Assert
        assertThrows(Exception.class, () -> bookController.getBookById(1L));
        verify(bookRepository, times(1)).findById(1L);
    }

    @Test
    public void testCreateRecord() {
        // Arrange
        Book book = new Book(1L, "Book 1", "Summary 1", 4);
        when(bookRepository.save(book)).thenReturn(book);

        // Act
        var result = bookController.createRecord(book);

        // Assert
        assertNotNull(result);
        assertEquals("Book 1", result.getName());
        verify(bookRepository, times(1)).save(book);
    }

    @Test
    public void testUpdateBookRecord_Success() throws Exception {
        // Arrange
        Book book = new Book(1L, "Book 1", "Summary 1", 4);
        Book updatedBook = new Book(1L, "Updated Book", "Updated Summary", 5);

        when(bookRepository.findById(1L)).thenReturn(Optional.of(book));
        when(bookRepository.save(any(Book.class))).thenAnswer(invocation -> invocation.getArgument(0));

        // Act
        Book result = bookController.updateBookRecord(updatedBook);

        // Assert
        assertNotNull(result);
        assertEquals("Updated Book", result.getName());
        verify(bookRepository, times(1)).findById(1L);
        verify(bookRepository, times(1)).save(any(Book.class));
    }


    @Test
    public void testUpdateBookRecord_NotFound() {
        // Arrange
        Book book = new Book(1L, "Book 1", "Summary 1", 4);
        when(bookRepository.findById(1L)).thenReturn(Optional.empty());

        // Act & Assert
        assertThrows(Exception.class, () -> bookController.updateBookRecord(book));
        verify(bookRepository, times(1)).findById(1L);
    }
}
