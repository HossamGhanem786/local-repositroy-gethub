package com.hossamghanem.bookshoping;

import com.hossamghanem.bookshoping.config.SecurityUtility;
import com.hossamghanem.bookshoping.domain.Role;
import com.hossamghanem.bookshoping.domain.User;
import com.hossamghanem.bookshoping.domain.UserRole;
import com.hossamghanem.bookshoping.service.impl.UserServiceImpl;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookshopingApplication implements CommandLineRunner {

    @Autowired
    private UserServiceImpl userService;

    public static void main(String[] args) {
        SpringApplication.run(BookshopingApplication.class, args);
    }

    @Override
	public void run(String... args) throws Exception {
		User user1= new User();
		user1.setFirstName("Hossam");
		user1.setLastName("Mohamed");
		user1.setUsername("HossamGhanem");
		user1.setEmail("hossamghanem@gmail.com");
		user1.setPassword(SecurityUtility.passwordEncoder().encode("p"));
		Set<UserRole> userRoles= new HashSet<>();
		Role role1= new Role();
		role1.setName("RLUE_USER");
		role1.setId(1);
		userRoles.add(new UserRole(user1, role1));
		userService.createUser(user1,userRoles);
		
		userRoles.clear();
		
		
		User user2= new User();
		user2.setFirstName("Abdo");
		user2.setLastName("Ghanem");
		user2.setUsername("AbdoGhanem");
		user2.setEmail("abdoghanem@gmail.com");
		user2.setPassword(SecurityUtility.passwordEncoder().encode("p2"));
		
		Role role2= new Role();
		role2.setName("RLUE_ADMIN");
		role2.setId(0);
		userRoles.add(new UserRole(user2, role2));
		userService.createUser(user2,userRoles);
		
		
             userRoles.clear();
		
		
		User user3 = new User();
		user3.setFirstName("Ahmed");
		user3.setLastName("Ghanem");
		user3.setUsername("AhmedGhanem");
		user3.setEmail("Ahmedghanem@gmail.com");
		user3.setPassword(SecurityUtility.passwordEncoder().encode("p3"));

		Role role3 = new Role();
		role3.setName("RLUE_ADMIN");
		role3.setId(2);
		userRoles.add(new UserRole(user3, role3));
		userService.createUser(user3, userRoles);

	}
}
