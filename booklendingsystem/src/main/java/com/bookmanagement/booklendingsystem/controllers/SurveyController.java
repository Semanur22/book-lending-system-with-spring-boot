package com.bookmanagement.booklendingsystem.controllers;

import com.bookmanagement.booklendingsystem.Services.SurveyService;
import com.bookmanagement.booklendingsystem.entities.Survey;
import com.bookmanagement.booklendingsystem.repositories.SurveyRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController()
@RequestMapping("/api/survey")
public class SurveyController {
    public SurveyService surveyService;


    public SurveyController(SurveyService surveyService) {
        this.surveyService = surveyService;

    }

    @PostMapping("/encyclopedia")
    public Survey selectEncyclopedia(Survey survey){
        survey.setEncyclopedia(1);
        return surveyService.save(survey);
    }
    @PostMapping("/textBook")
    public Survey selectTextBook(Survey survey){
        survey.setTextBook(1);
        return surveyService.save(survey);
    }
    @PostMapping("/readingBook")
    public Survey selectReadingBook(Survey survey){
        survey.setReadingBook(1);
        return surveyService.save(survey);
    }
    @PostMapping("/scientificBook")
    public Survey selectScientificBook(Survey survey){
        survey.setScientificBook(1);
        return surveyService.save(survey);
    }
    /*
    @PostMapping("/deneme")
    public Survey deneme(@RequestBody int deneme, Survey survey){
        if(deneme==5){
            survey.setEncyclopedia(1);
            return surveyService.save(survey);
        }
        else{
            return null;
        }
    }
*/

/*
    @GetMapping("/textBookCount")
    public int textBookCount(){
        return surveyService.textBookCount();
    }
    @GetMapping("/readingBookCount")
    public int readingBookCount(){
        return surveyService.readingCount();
    }

    @GetMapping("/scientificBookCount")
    public int scientificBookCount(){
        return surveyService.scientificBookCount();

    @GetMapping("/encyclopediaCount")
    public int count(){
        return surveyService.encyclopediaCount();
    }
*/
    @GetMapping("/counter")
    public List<Integer> getResult(){
        return surveyService.surveyResult();
    }
}
