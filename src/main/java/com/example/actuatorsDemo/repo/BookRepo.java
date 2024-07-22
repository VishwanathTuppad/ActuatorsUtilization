package com.example.actuatorsDemo.repo;

import com.example.actuatorsDemo.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book, Long> {
}

