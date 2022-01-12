/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Model.quiz_page;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class quiz_pageTest {
    
    public quiz_pageTest() {
    }
    
    quiz_page a;
    @Before
    public void setUp() {
        a= new quiz_page();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testqIDCheck() {
        assertSame(true, a.qID("5"));
    }

    @Test
    public void testQuestionAnswer() {
        assertSame(false, a.qAnswer("answer"));
    }
   
}
