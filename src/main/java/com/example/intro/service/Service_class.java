package com.example.intro.service;

import com.example.intro.dto.dto;
import com.example.intro.Model.Model;
import com.example.intro.repository.repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Service_class implements Service_Interface {

    @Autowired
    private repository repository;

    @Override
    public Model addAddress(dto dto) {
        Model ab = new Model();
        ab.setName(dto.getName());
        ab.setAddress(dto.getAddress());
        return repository.save(ab);
    }

    @Override
    public List<Model> getAll() {
        return repository.findAll();
    }

    @Override
    public Model getById(int id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public Model update(int id, dto dto) {
        Model ab = getById(id);
        ab.setName(dto.getName());
        ab.setAddress(dto.getAddress());
        return repository.save(ab);
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }
}
