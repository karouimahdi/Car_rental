package com.epam.carrental;

import com.epam.carrental.domain.User;
import com.epam.carrental.domain.UserRole;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        User user = new User(1, "mahdi", "kar@gmail.com", "Ar", "fsdf",false, UserRole.ADMIN);
        System.out.println("user:"+ user);  
    }
}
