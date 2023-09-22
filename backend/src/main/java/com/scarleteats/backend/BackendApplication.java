package com.scarleteats.backend;

import com.scarleteats.backend.model.entity.User;
import com.scarleteats.backend.model.entity.Role;
import com.scarleteats.backend.repository.RoleRepository;
import com.scarleteats.backend.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class BackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

	@Bean
	CommandLineRunner run(RoleRepository roleRepository, UserRepository userRepository, PasswordEncoder passwordEncoder) {
		return args -> {
			if(roleRepository.findRoleByAuthority("ADMIN").isPresent()) {
				return;
			}

			Role adminRole = roleRepository.save(new Role(1, "ADMIN"));
			roleRepository.save(new Role(2, "USER"));

			Set<Role> roles = new HashSet<>();
			roles.add(adminRole);

			User admin = new User(1, "admin", passwordEncoder.encode("password"), roles);
			userRepository.save(admin);
		};
	}

}
