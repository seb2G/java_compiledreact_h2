package com.sgrela.java_compiledreact_h2.service;

import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;

import com.sgrela.java_compiledreact_h2.entity.Users;
import com.sgrela.java_compiledreact_h2.repository.UsersRepository;

@Component
public class UsersService {
	
	private UsersRepository usersRepository;

    public UsersService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public List<Users> getUsers() {
        return usersRepository.findAll();
    }
    
    public Users saveUser(Users users) {
    	users.setId(new Random().nextInt());
    	return usersRepository.save(users);
    }

}
