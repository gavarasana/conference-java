import com.pluralsight.repository.HibernateSpeakerRepository;
import com.pluralsight.repository.SpeakerRepository;
import com.pluralsight.service.SpeakerService;
import com.pluralsight.service.SpeakerServiceImpl;
import com.pluralsight.util.CalendarFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.Calendar;

@Configuration
@ComponentScan({"com.pluralsight"})
public class AppConfig {

    @Bean(name = "calendarFactory")
    public CalendarFactory getCalendarFactory(){
        CalendarFactory factory = new CalendarFactory();
        factory.addDays(2);
        return factory;
    }

    @Bean(name = "calendar")
    public Calendar getCalendar() throws Exception {
        return getCalendarFactory().getObject();
    }

//    @Bean(name = "SpeakerService")
//    @Scope(BeanDefinition.SCOPE_SINGLETON)
//    //@Scope(BeanDefinition.SCOPE_PROTOTYPE)
//    public SpeakerService getSpeakerService(){
//
//        return new SpeakerServiceImpl();
//        //service.setRepository(getSpeakerRepository());
//        //return new SpeakerServiceImpl(getSpeakerRepository());
//    }
//
//    @Bean(name="speakerRepository")
//    public SpeakerRepository getSpeakerRepository(){
//        return new HibernateSpeakerRepository();
//    }

}
