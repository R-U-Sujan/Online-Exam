/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Model.update_question;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class update_questionTest {
    
    public update_questionTest() {
    }
    
    update_question a;
    @Before
    public void setUp() {
        a= new update_question();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void uQuestionTest() {
        assertSame("updated", a.uQuestion("5", "New question", "add", "sub", "mul", "div", "add"));
    }
    
}
