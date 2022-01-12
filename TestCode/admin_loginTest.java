/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Controller.admin_login;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class admin_loginTest {
    
    public admin_loginTest() {
    }
    admin_login a;
    @Before
    public void setUp() {
        a= new admin_login();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void checkUserNameTest() {
        assertSame(true, a.checkUser("sujan", "1234"));
    }
    
    
}
