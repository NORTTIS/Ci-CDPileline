package base_project.project_demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
class ProjectDemoApplicationTests {

    @Test
    void contextLoads() {
        System.out.println("Active Profile: " + System.getProperty("spring.profiles.active"));
    }

}
