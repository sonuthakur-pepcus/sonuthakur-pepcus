package com.pepcus.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pepcus.employee.repository.BookRepository;

@Service
public class BookService {
@Autowired
BookRepository bookRepository;


}
