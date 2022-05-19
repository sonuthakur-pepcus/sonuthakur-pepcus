package com.pepcus.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pepcus.employee.modal.Shelves;
import com.pepcus.employee.service.ShelvesService;

@RestController
@RequestMapping(value="/shelves")
public class ShelvesController {
@Autowired
ShelvesService  shelvesService;
@PostMapping("/")
public Shelves addShelves(@RequestBody Shelves shelves) {
  Shelves shelvesResponse = shelvesService.addShelves(shelves);
  return shelvesResponse;
}
}
