package com.mazidul.quiz.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // Lombok annotation to automatically generate getters, setters, toString, equals, and hashCode methods
@AllArgsConstructor // Lombok annotation to generate a constructor with all fields
@NoArgsConstructor // Lombok annotation to generate a no-argument constructor
public class QuizDto {

     private String category; // The category of the quiz (e.g., General Knowledge, Science)
     private Integer numQ; // The number of questions in the quiz
     private String title; // The title of the quiz

     // Getters and Setters (These are automatically generated by Lombok due to the @Data annotation, but you can keep them if needed)

     public String getCategory() {
          return category;
     }

     public void setCategory(String category) {
          this.category = category;
     }

     public Integer getNumQ() {
          return numQ;
     }

     public void setNumQ(Integer numQ) {
          this.numQ = numQ;
     }

     public String getTitle() {
          return title;
     }

     public void setTitle(String title) {
          this.title = title;
     }
}
