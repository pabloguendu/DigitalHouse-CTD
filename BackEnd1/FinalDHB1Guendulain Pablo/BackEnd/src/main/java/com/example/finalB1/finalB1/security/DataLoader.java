package com.example.finalB1.finalB1.security;
import com.example.finalB1.finalB1.entity.EnumRole;
import com.example.finalB1.finalB1.entity.User;
import com.example.finalB1.finalB1.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@ComponentScan
public class DataLoader implements ApplicationRunner {
    @Autowired
    private IUserRepository userRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        try {
            BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
            String contrasenia = passwordEncoder.encode("password");
            String contrasenia2 = passwordEncoder.encode("password2");
            userRepository.save(new User("testadmin", contrasenia, EnumRole.ADMIN));
            userRepository.save(new User("testuser", contrasenia2, EnumRole.USER));
        }catch (Exception e){

        }


    }
}
