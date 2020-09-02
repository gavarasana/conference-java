package com.pluralsight.repository;

import com.pluralsight.model.Speaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

//@Repository("speakerRepository")
//@Profile("Development")
public class DevelopmentSpeakerRepository implements SpeakerRepository {


    @Autowired
    private Calendar calendar;

    public List<Speaker> FindAll() {

        List<Speaker> speakers = new ArrayList<>();

        Speaker speaker = new Speaker();
        speaker.setFirstName("Ravi");
        speaker.setLastName("Gavarasana");
        speaker.setConferenceDate(calendar.getTime());
        speaker.setTicketNumber(1234.43);
        speakers.add(speaker);

        return speakers;
    }


}
