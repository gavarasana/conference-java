package com.pluralsight.repository;

import com.pluralsight.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class HibernateSpeakerRepository implements SpeakerRepository {

    public List<Speaker> FindAll() {

        List<Speaker> speakers = new ArrayList<>();

        Speaker speaker = new Speaker();
        speaker.setFirstName("Ravi");
        speaker.setLastName("Gavarasana");

        speakers.add(speaker);

        return speakers;
    }


}
