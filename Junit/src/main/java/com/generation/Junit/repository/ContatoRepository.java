package com.generation.Junit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.Junit.model.ContatoModel;

public interface ContatoRepository extends JpaRepository<ContatoModel, Long> {

}