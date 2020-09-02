import com.pluralsight.model.Speaker;
import com.pluralsight.service.SpeakerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args){

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        SpeakerService speakerService = context.getBean("speakerService", SpeakerService.class);

        System.out.println(speakerService);

        Speaker firstSpeaker = speakerService.findAll().get(0);
        System.out.println(firstSpeaker.getFirstName() + " " + firstSpeaker.getConferenceDate() + " " + firstSpeaker.getTicketNumber());

        SpeakerService speakerServiceSecond = context.getBean("speakerService", SpeakerService.class);

        System.out.println(speakerServiceSecond);

    }
}
