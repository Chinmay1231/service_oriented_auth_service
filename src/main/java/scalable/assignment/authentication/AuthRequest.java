/*
 * AuthRquest.java -- Defines AuthRequest class 
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

import lombok.Data;

/**
 * The <code>AuthRequest</code> is plain java object used to hold username and 
 * password 
 * @author Yogesh Kshatriya
 */
@Data
public class AuthRequest {
    private String username;
    private String password;
    
    //No constructor or setter/getter method required to be added
    //Thanks to lombok library, it will dynamically add them.
}
