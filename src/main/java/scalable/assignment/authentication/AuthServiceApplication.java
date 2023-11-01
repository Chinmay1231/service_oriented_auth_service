/*
 * AuthServiceApplication.java -- Defines AuthServiceApplication class 
 * This code is implemented as part of assignment given to group #3 for  
 * course Scalable Service of MTECH Program Software Engineering
 * Assignment Group #3
 * Student Name : Yogesh Kshatriya
 * Student Id   : 2022MT93005
 * Course       : Scalable Services
 * Program      : MTECH Software Engineering
 * Student Email: 2022MT93005@wilp.bits-pilani.ac.in
 */

package scalable.assignment.authentication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The <code>AuthServiceApplication</code> launches authentication service 
 * It has main method which serves as entry point
 * 
 * @author Yogesh Kshatriya
 */
@SpringBootApplication
public class AuthServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthServiceApplication.class, args);
	}

}