package com.pluralsight.service;

import com.pluralsight.model.Speaker;
import com.pluralsight.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private final SpeakerRepository repository;

//    public void setRepository(SpeakerRepository repository) {
//        this.repository = repository;
//    }

    public SpeakerServiceImpl(SpeakerRepository speakerRepository){
        repository = speakerRepository;
    }

    public List<Speaker> findAll(){
        return  repository.FindAll();
    }
}
