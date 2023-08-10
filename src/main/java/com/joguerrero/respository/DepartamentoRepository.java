package com.joguerrero.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joguerrero.model.Departamento;

public interface DepartamentoRepository extends JpaRepository<Departamento, Integer> {

}
