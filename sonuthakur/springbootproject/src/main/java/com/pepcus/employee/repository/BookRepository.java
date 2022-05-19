package com.pepcus.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pepcus.employee.modal.Book;

public interface BookRepository  extends JpaRepository<Book, Integer>{

}
