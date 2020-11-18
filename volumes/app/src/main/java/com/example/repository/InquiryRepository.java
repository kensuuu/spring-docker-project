package com.example.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.InputForm;

@Repository
public interface InquiryRepository extends JpaRepository<InputForm, String>{

	Optional<InputForm> findById(String id);
	List<InputForm> findAll();
}
