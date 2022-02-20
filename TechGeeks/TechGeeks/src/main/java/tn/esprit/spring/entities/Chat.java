package tn.esprit.spring.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Entity
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PUBLIC)
public class Chat implements Serializable{

	public Chat() {
		// TODO Auto-generated constructor stub
	}
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int idChat;
	
	private String text;
	
	@OneToMany(mappedBy="chat")
	private Set<User> receivers;
	
	@ManyToOne 
	private User sender;

}