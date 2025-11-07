package com.secure.SpringSecurity.service;

import com.secure.SpringSecurity.model.User;
import com.secure.SpringSecurity.model.UserData;
import com.secure.SpringSecurity.repository.UserDataRepo;
import com.secure.SpringSecurity.repository.UserRepo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

class UserDataServiceTest {

    @Mock
    private UserRepo userRepo;

    @Mock
    private UserDataRepo dataRepo;

    @InjectMocks
    private UserDataService userDataService;

    private User user;
    private UserData userData;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);

        user = new User();
        user.setId(1);
        user.setUsername("john");

        userData = new UserData();
        userData.setId(101);
        userData.setTitle("Sample Title");
        userData.setContent("Sample Content");
    }

    // -------------------------------
    // ✅ addData() Tests
    // -------------------------------

    @Test
    void testAddData_Success() {
        when(userRepo.findByUsername("john")).thenReturn(user);
        when(dataRepo.save(any(UserData.class))).thenAnswer(i -> i.getArgument(0));

        UserData result = userDataService.addData("john", userData);

        assertNotNull(result);
        assertEquals(user, result.getUser());
        verify(userRepo, times(1)).findByUsername("john");
        verify(dataRepo, times(1)).save(userData);
    }

    @Test
    void testAddData_WhenUserNotFound_ShouldThrowException() {
        when(userRepo.findByUsername("unknown")).thenReturn(null);

        assertThrows(IllegalArgumentException.class, () -> {
            userDataService.addData("unknown", userData);
        });

        verify(userRepo, times(1)).findByUsername("unknown");
        verify(dataRepo, never()).save(any());
    }


    @Test
    void testAddData_WhenDataIsNull_ShouldThrowException() {
        when(userRepo.findByUsername("john")).thenReturn(user);

        assertThrows(NullPointerException.class, () -> {
            userDataService.addData("john", null);
        });

        verify(dataRepo, never()).save(any());
    }

    // -------------------------------
    // ✅ getMyData() Tests
    // -------------------------------

    @Test
    void testGetMyData_Success() {
        List<UserData> userDataList = Arrays.asList(userData);

        when(userRepo.findByUsername("john")).thenReturn(user);
        when(dataRepo.findByUser(user)).thenReturn(userDataList);

        List<UserData> result = userDataService.getMyData("john");

        assertEquals(1, result.size());
        assertEquals("Sample Title", result.get(0).getTitle());
        verify(userRepo, times(1)).findByUsername("john");
        verify(dataRepo, times(1)).findByUser(user);
    }

    @Test
    void testGetMyData_UserNotFound_ShouldReturnEmptyList() {
        when(userRepo.findByUsername("unknown")).thenReturn(null);
        when(dataRepo.findByUser(null)).thenReturn(Collections.emptyList());

        List<UserData> result = userDataService.getMyData("unknown");

        assertTrue(result.isEmpty());
        verify(userRepo, times(1)).findByUsername("unknown");
        verify(dataRepo, times(1)).findByUser(null);
    }

    @Test
    void testGetMyData_UserHasNoData_ShouldReturnEmptyList() {
        when(userRepo.findByUsername("john")).thenReturn(user);
        when(dataRepo.findByUser(user)).thenReturn(Collections.emptyList());

        List<UserData> result = userDataService.getMyData("john");

        assertTrue(result.isEmpty());
        verify(dataRepo, times(1)).findByUser(user);
    }

    // -------------------------------
    // ✅ getAllData() Tests
    // -------------------------------

    @Test
    void testGetAllData_Success() {
        Pageable pageable = PageRequest.of(0, 5);
        Page<UserData> page = new PageImpl<>(List.of(userData));

        when(dataRepo.findAll(pageable)).thenReturn(page);

        Page<UserData> result = userDataService.getAllData(pageable);

        assertNotNull(result);
        assertEquals(1, result.getTotalElements());
        verify(dataRepo, times(1)).findAll(pageable);
    }

    @Test
    void testGetAllData_EmptyPage() {
        Pageable pageable = PageRequest.of(1, 10);
        Page<UserData> emptyPage = new PageImpl<>(Collections.emptyList());

        when(dataRepo.findAll(pageable)).thenReturn(emptyPage);

        Page<UserData> result = userDataService.getAllData(pageable);

        assertTrue(result.isEmpty());
        verify(dataRepo, times(1)).findAll(pageable);
    }

    @Test
    void testGetAllData_NullPageable_ShouldThrowException() {
        assertThrows(IllegalArgumentException.class, () -> {
            userDataService.getAllData(null);
        });
    }
}
