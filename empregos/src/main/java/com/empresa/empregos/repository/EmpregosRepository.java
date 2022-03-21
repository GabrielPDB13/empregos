package com.empresa.empregos.repository;

import org.springframework.data.repository.CrudRepository;

import com.empresa.empregos.model.Empregos;

public interface EmpregosRepository extends CrudRepository < Empregos , Long>{

}
