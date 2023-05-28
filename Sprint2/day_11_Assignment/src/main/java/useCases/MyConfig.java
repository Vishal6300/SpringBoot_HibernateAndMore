package useCases;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import model.Student;

@Configuration
@PropertySource("classpath:dbdetails.properties")
public class MyConfig {

    @Autowired
    private Environment env;

    @Bean
    public List<String> cities() {
        String[] citiesArray = env.getProperty("cities").split(", ");
        return Arrays.asList(citiesArray);
    }

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public Student student1() {
        return new Student(1, "John", 20);
    }

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public Student student2() {
        return new Student(2, "Jane", 21);
    }

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public Student student3() {
        return new Student(3, "Bob", 22);
    }

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public Student student4() {
        return new Student(4, "Alice", 23);
    }

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public Student student5() {
        return new Student(5, "Tom", 24);
    }
}
