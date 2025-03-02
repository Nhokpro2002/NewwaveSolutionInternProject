package SpringExercise.Exercise1.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.newwave.webbackendlaboratory") // ✅ Quét toàn bộ package này
public class AppConfig {
}
