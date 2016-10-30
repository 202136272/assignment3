package za.ac.cput.sportfield;

import org.junit.*;
import za.ac.cput.sportfield.Impl.SportFieldSizeImpl;

/**
 * Created by Bonga on 2016/03/12.
 */
public class TestSporFieldSize {
    private SportFieldSize sport;

    @Before
    public void setUp() throws Exception {
        sport = new SportFieldSizeImpl();

    }

    @Test
    public void crickerField() throws Exception {



        Assert.assertEquals(2827.43, sport.cricketField(30), 0.01);

    }

    @Test
    public void soccerField() throws Exception {

        Assert.assertEquals(240000, sport.soccerField(600, 400), 0.01);

    }

}
