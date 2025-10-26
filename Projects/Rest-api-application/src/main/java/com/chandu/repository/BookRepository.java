package com.chandu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chandu.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}
