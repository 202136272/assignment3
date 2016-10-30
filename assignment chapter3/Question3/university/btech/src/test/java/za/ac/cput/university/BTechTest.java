package za.ac.cput.university;

import junit.framework.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import za.ac.cput.university.Impl.BTechImpl;

/**
 * Created by Bonga on 2016/03/12.
 */
public class BTechTest {

    private BTech btech;

    @Test
    public void testStudent() throws Exception {
        Assert.assertEquals("Mike#Donalds#BTECH", btech.welcome("209334983"));
    }

    @Before
    public void setUp() throws Exception {
        btech = new BTechImpl();
    }

    @After
    public void after() throws Exception {

    }
}
