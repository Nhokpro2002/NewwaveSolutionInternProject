package test.spring.exercise.exercise1.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "SpringExercise.Exercise1.service")
public class AppConfig {
}
