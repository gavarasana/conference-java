package com.pluralsight.repository;

import com.pluralsight.model.Speaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Repository("speakerRepository")
public class HibernateSpeakerRepository implements SpeakerRepository {

    @Value("#{ T(java.lang.Math).random() * 1000 }")
    private double randomNumber;

    @Autowired
    private Calendar calendar;

    public List<Speaker> FindAll() {

        List<Speaker> speakers = new ArrayList<>();

        Speaker speaker = new Speaker();
        speaker.setFirstName("Ravi");
        speaker.setLastName("Gavarasana");
        speaker.setConferenceDate(calendar.getTime());
        speaker.setTicketNumber(randomNumber);
        speakers.add(speaker);

        return speakers;
    }


}
