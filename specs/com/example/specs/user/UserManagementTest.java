package com.example.specs.user;

import org.concordion.integration.junit3.ConcordionTestCase;

import com.example.Greeter;
import com.example.User;
import com.example.UserManagement;

public class UserManagementTest extends ConcordionTestCase {
    public boolean registUser(String name, String age) {
    	User testUser = new User(name, Integer.parseInt(age));
    	return new UserManagement().registUser(testUser);
    }
}
