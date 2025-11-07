package com.secure.SpringSecurity.service;

import com.secure.SpringSecurity.model.User;
import com.secure.SpringSecurity.repository.UserRepo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class UserServiceTest {

    @Mock
    private UserRepo userRepo;

    @Mock
    private BCryptPasswordEncoder passwordEncoder;

    @InjectMocks
    private UserService userService;

    @Test
    void register_encodesPasswordAndSavesUser() {
        // arrange
        User input = new User();
        input.setUsername("john");
        input.setPassword("plainPassword");

        String encoded = "encodedPassword";
        when(passwordEncoder.encode("plainPassword")).thenReturn(encoded);

        User saved = new User();
        saved.setUsername("john");
        saved.setPassword(encoded);
        when(userRepo.save(any(User.class))).thenReturn(saved);

        // act
        User result = userService.register(input);

        // assert
        ArgumentCaptor<User> captor = ArgumentCaptor.forClass(User.class);
        verify(passwordEncoder).encode("plainPassword");
        verify(userRepo).save(captor.capture());

        User passedToSave = captor.getValue();
        assertEquals("john", passedToSave.getUsername());
        assertEquals(encoded, passedToSave.getPassword());

        assertNotNull(result);
        assertEquals("john", result.getUsername());
        assertEquals(encoded, result.getPassword());
    }

    @Test
    void findByUsername_delegatesToRepo() {
        // arrange
        User found = new User();
        found.setUsername("alice");
        found.setPassword("ignored");
        when(userRepo.findByUsername("alice")).thenReturn(found);

        // act
        User result = userService.findByUsername("alice");

        // assert
        verify(userRepo).findByUsername("alice");
        assertSame(found, result);
    }
}
