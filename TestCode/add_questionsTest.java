/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Model.add_questions;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class add_questionsTest {
    
    public add_questionsTest() {
    }
    add_questions a;
    @Before
    public void setUp() {
        a=new add_questions();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void aQuestionTest() {
        assertSame("added", a.aQuestion("New question", "add", "sub", "mul", "div", "add"));
    }  
    
}
