/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Model.students_result;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class students_resultTest {
    
    public students_resultTest() {
    }
    students_result a;
    @Before
    public void setUp() {
        a=new students_result();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testCheckID() {
        assertEquals(8, a.checkResultID("18201081"));
    }
    
}
