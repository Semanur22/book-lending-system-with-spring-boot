package com.bookmanagement.booklendingsystem.Services;

import com.bookmanagement.booklendingsystem.entities.Survey;
import com.bookmanagement.booklendingsystem.repositories.SurveyRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class SurveyService {
    public SurveyService(SurveyRepository surveyRepository) {
        this.surveyRepository = surveyRepository;
    }

    SurveyRepository surveyRepository;

    public Survey save(Survey survey){
        return surveyRepository.save(survey);
    }

    public List<Survey> getResult() {
       return surveyRepository.findAll();
    }



/*
    public int textBookCount(){
        int count =0;
        List<Survey> surveys=surveyRepository.findAll();
        for (int i = 0; i < surveys.size();i++)
        {
           if( surveys.get(i).getTextBook()==1){
               count++;
           }
        }
        return count;
    }
    public int readingCount(){
        int count =0;
        List<Survey> surveys=surveyRepository.findAll();
        for (int i = 0; i < surveys.size();i++)
        {
            if( surveys.get(i).getReadingBook()==1){
                count++;
            }
        }
        return count;
    }
    public int encyclopediaCount(){
        int count =0;
        List<Survey> surveys=surveyRepository.findAll();
        for (int i = 0; i < surveys.size();i++)
        {
            if( surveys.get(i).getEncyclopedia()==1){
                count++;
            }
        }
        return count;
    }

    */

    public List surveyResult(){
        int textBookCounter=0,readinBookCounter=0,scientificBookCounter=0,encyclopediaCounter=0;
        List<Survey> surveys=surveyRepository.findAll();
        ArrayList<Integer> counts = new ArrayList<>();
        for (int i = 0; i < surveys.size();i++)
        {
            if( surveys.get(i).getScientificBook()==1){
                scientificBookCounter++;
            }
            if( surveys.get(i).getTextBook()==1) {
                textBookCounter++;
            }if( surveys.get(i).getEncyclopedia()==1) {
                encyclopediaCounter++;
            }if( surveys.get(i).getReadingBook()==1){
                readinBookCounter++;
            }
        }
        counts.add(scientificBookCounter);
        counts.add(textBookCounter);
        counts.add(readinBookCounter);
        counts.add(encyclopediaCounter);

        return counts;
    }


    //hangi kitap secilmisse degeri 1 yapildi
    /*
    public Survey surveyForm(String id, Survey survey){

        if("1".equals(id)){
            survey.setTextBook(1);

        }else if(id.equals(2)){
            survey.setReadingBook(1);

        }else if(id.equals(3)){
            survey.setEncyclopedia(1);

        }else if(id.equals(4)){
            survey.setScientificBook(1);

        }
       return surveyRepository.save(survey);
    }
*/
}
