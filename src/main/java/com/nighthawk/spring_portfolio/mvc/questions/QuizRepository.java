package com.nighthawk.spring_portfolio.mvc.questions;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;


public interface QuizRepository extends JpaRepository<Quiz, Long> {
    void save(String Question);
    List<Quiz> findAllByOrderByQuestionAsc();
    List<Quiz> findByQuestionIgnoreCase(String name);
}


