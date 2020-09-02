package com.pluralsight.service;

import com.pluralsight.model.Speaker;
import com.pluralsight.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service("speakerService")
public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository;

    public SpeakerServiceImpl(){
        System.out.println("SpeakerServiceImpl - No args constructor");
    }

    public SpeakerServiceImpl(SpeakerRepository speakerRepository){
        System.out.println("SpeakerServiceImpl - with speakerRepository arg constructor");
        repository = speakerRepository;
    }

    @PostConstruct
    private void Initialize(){
        System.out.println("Invoked after constructor by spring DI");
    }

    @Autowired
    public void setRepository(SpeakerRepository repository) {
        System.out.println("Setting the repository");
        this.repository = repository;
    }

    public List<Speaker> findAll(){
        return  repository.FindAll();
    }
}
