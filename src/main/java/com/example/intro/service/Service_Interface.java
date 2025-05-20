package com.example.intro.service;

import com.example.intro.dto.dto;
import com.example.intro.Model.Model;

import java.util.List;

public interface Service_Interface {
    Model addAddress(dto dto);
    List<Model> getAll();
    Model getById(int id);
    Model update(int id, dto dto);
    void delete(int id);
}
