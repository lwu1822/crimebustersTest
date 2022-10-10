package com.nighthawk.spring_portfolio.mvc.questions;

import javax.persistence.*;


public class Quiz {
    private Long id; 
    private String question; 
    private String answer; 
    private int choiceA;
    private int choiceB; 

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuestion() {
        return question; 
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer; 
    }

    public int getChoiceA() {
        return choiceA;
    }

    public void setChoiceA(int choiceA) {
        this.choiceA = choiceA; 
    }

    public int getChoiceB() {
        return choiceA;
    }

    public void setChoiceB(int choiceB) {
        this.choiceB = choiceB; 
    }
}
