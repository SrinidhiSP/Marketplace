package com.example.marketplace;

import com.example.marketplace.model.Product;
import com.example.marketplace.model.Project;
import com.example.marketplace.model.ProjectProduct;
import com.example.marketplace.model.User;
import com.example.marketplace.repository.ProjectRepository;
import com.example.marketplace.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class MarketplaceApplication {
	private static final Logger log = LoggerFactory.getLogger(MarketplaceApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(MarketplaceApplication.class);
	}

//	@Bean
//	public CommandLineRunner demo(UserRepository repository) {
//		return (args) -> {
//			repository.save(new User("Robert","Admin","abcd"));
//			repository.save(new User("Tom","User","1234"));
//			repository.save(new User("Jerry","User","5678"));
//			repository.save(new User("Robert","User","910JQ"));
//			log.info("success");
//
////			 fetch all user in the table
//			log.info("");
//			log.info("User found with findAll():");
//			log.info("-------------------------------");
//			for (User user : repository.findAll()) {
//				log.info(user.toString());
//			}
//			log.info("");
//
//			// fetch an individual user by Username, This method only can return unique result otherwise will post error
//			User user = repository.findByUsername("Tom");
//			log.info("User found with findByUsername():");
//			log.info("--------------------------------");
//			log.info(user.toString());
//			log.info("");
//
//			// fetch all user by Username
//			List<User> user_list = repository.findAllByUsername("Robert");
//			log.info("User found with findAllByUsername():");
//			log.info("--------------------------------");
//			user_list.forEach((a)->{log.info(a.toString());});
//			log.info("");
//
//
//			// fetch all users by type
//			List<User> user_list1 = repository.findAllByUsertype("User");
//			log.info("User found with findAllByUser_type():");
//			log.info("--------------------------------");
//			user_list1.forEach((a)->{log.info(a.toString());});
//			log.info("");
//
//			// fetch all users by type and useranme
//			List<User> user_list2 = repository.findAllByUsertypeAndUsername("User","Robert");
//			log.info("User found with findAllByUsertypeAndUsername():");
//			log.info("--------------------------------");
//			user_list2.forEach((a)->{log.info(a.toString());});
//			log.info("");
//
//
//
//
//		};
//	}


	@Bean
	public CommandLineRunner demo2(ProjectRepository projectrepository,UserRepository userrepository) {
		return (args) -> {

//			projectrepository.save(new Project(6,"Company Project A",new User("Robert","Admin","abcd")));
//			projectrepository.save(new Project(1,"Company Project A",userrepository.findByUserid(1)));
//			projectrepository.save(new Project(2,"Company Project B",userrepository.findByUserid(2)));
//			projectrepository.save(new Project(3,"Company Project C",userrepository.findByUserid(3)));
//			projectrepository.save(new Project(4,"Company Project C",userrepository.findByUserid(1)));
//			log.info(" success");

//			//			 fetch all user in the table
			log.info("");
			log.info("Project found with findAll():");
			log.info("-------------------------------");
			for (Project prject : projectrepository.findAll()) {
				log.info(prject.toString());
			}
			log.info("");


			//			 fetch all project in the table by project name
			log.info("");
			log.info("Project found with findByprojectnameLike():");
			log.info("-------------------------------");
			for (Project prject : projectrepository.findByprojectnameLike("%Project C%")) {
				log.info(prject.toString());
			}
			log.info("");


			////			 fetch all prodcut in the table by User_id
			log.info("");
			log.info("Project found with findByUserID():");
			log.info("-------------------------------");
			for (Project project : projectrepository.findByUser(userrepository.findByUserid(1))) {
				log.info(project.toString());
			}
			log.info("");



		};
	}

}
