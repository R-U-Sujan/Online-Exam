/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Controller.student_login;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class student_loginTest {
    
    public student_loginTest() {
    }
    student_login a;
    @Before
    public void setUp() {
        a=new student_login();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testCheckID() {
        assertEquals(8, a.checkID("18201081"));
    }

    @Test
    public void checkPhn(){
        assertEquals(11, a.checkPhn("01234567891"));
    }
}
