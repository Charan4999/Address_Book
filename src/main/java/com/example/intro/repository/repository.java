package com.example.intro.repository;

import com.example.intro.Model.Model;
import org.springframework.data.jpa.repository.JpaRepository;

public interface repository extends JpaRepository<Model, Integer> {
}
