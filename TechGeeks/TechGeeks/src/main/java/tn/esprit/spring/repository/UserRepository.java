package tn.esprit.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entities.User;
@Repository
public interface UserRepository extends CrudRepository<User,Integer> {
	public User findByEmail(String email);
	public User findByUserName(String userName);
	
	
}
