package lk.quadrate;

import lk.quadrate.model.ApplicationUser;
import lk.quadrate.repository.ApplicationUserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(ApplicationUserRepository applicationUserRepository){
        return args -> {
            List<ApplicationUser> users = List.of(
                    ApplicationUser.builder()
                            .userName("user1")
                            .firstName("Jhone")
                            .lastName("Smith")
                            .email("jhone@gmail.com").build(),
                    ApplicationUser.builder()
                            .userName("user2")
                            .firstName("Anna")
                            .lastName("Smith")
                            .email("anna@gmail.com").build(),
                    ApplicationUser.builder()
                            .userName("user3")
                            .firstName("Kate")
                            .lastName("White")
                            .email("kate@gmail.com").build()
            );
            applicationUserRepository.saveAll(users);
        };
    }

}
