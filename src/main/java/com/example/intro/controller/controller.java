package com.example.intro.controller;

import com.example.intro.dto.dto;
import com.example.intro.Model.Model;
import com.example.intro.service.Service_Interface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/addressbook")
public class controller {

    @Autowired
    private Service_Interface service;

    @PostMapping
    public ResponseEntity<Model> add(@RequestBody dto dto) {
        return ResponseEntity.ok(service.addAddress(dto));
    }

    @GetMapping
    public ResponseEntity<List<Model>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Model> getById(@PathVariable int id) {
        return ResponseEntity.ok(service.getById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Model> update(@PathVariable int id, @RequestBody dto dto) {
        return ResponseEntity.ok(service.update(id, dto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable int id) {
        service.delete(id);
        return ResponseEntity.ok("Deleted ID: " + id);
    }
}
