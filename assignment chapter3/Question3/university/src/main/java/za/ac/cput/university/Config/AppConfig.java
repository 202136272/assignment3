package za.ac.cput.university.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import za.ac.cput.university.Impl.ModularStudentImpl;
import za.ac.cput.university.Student;

/**
 * Created by student on 2015/02/20.
 */
@Configuration
public class AppConfig {
    @Bean(name = "std")
    public Student getStudent(){
        return new ModularStudentImpl();
    }

}
