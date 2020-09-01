import com.pluralsight.service.SpeakerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args){

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        SpeakerService speakerService = context.getBean("speakerService", SpeakerService.class);


        System.out.println(speakerService);

        System.out.println(speakerService.findAll().get(0).getFirstName());

        SpeakerService speakerServiceSecond = context.getBean("speakerService", SpeakerService.class);

        System.out.println(speakerServiceSecond);

    }
}
