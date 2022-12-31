package com.bookmanagement.booklendingsystem.repositories;

import com.bookmanagement.booklendingsystem.entities.Survey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SurveyRepository extends JpaRepository<Survey, Long> {


}