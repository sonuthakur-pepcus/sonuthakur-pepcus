package com.pepcus.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pepcus.employee.modal.Book;
import com.pepcus.employee.service.BookService;

@RestController
@RequestMapping(value="/Books")
public class BookController {
@Autowired
BookService bookService;

}
