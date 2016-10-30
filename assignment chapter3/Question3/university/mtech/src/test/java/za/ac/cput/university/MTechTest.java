package za.ac.cput.university;


import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import  org.junit.After;
import za.ac.cput.university.Impl.MTechImpl;

/**
 * Created by Bonga on 2016/03/12.
 */
public class MTechTest {

    private MTech mtech;

    @Before
    public void setUp() throws Exception{
        mtech = new MTechImpl();
    }
    @Test
    public void testMtech() throws Exception{
        Assert.assertEquals("MTech Student" ,"Jim#Can#MTECH", mtech.welcome("230239498"));
    }

    @After
    public void after() throws Exception{

    }


}
