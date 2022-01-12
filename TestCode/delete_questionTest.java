/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Model.delete_question;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class delete_questionTest {
    
    public delete_questionTest() {
    }
    delete_question a;
    @Before
    public void setUp() {
        a=new delete_question();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void dQuestion() {
        assertSame("Successfully deleted", a.dQuestion("5"));
    }
    
}
