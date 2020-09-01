package com.pluralsight.repository;

import com.pluralsight.model.Speaker;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("speakerRepository")
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
