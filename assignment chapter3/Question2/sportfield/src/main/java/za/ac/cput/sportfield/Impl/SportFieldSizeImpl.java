package za.ac.cput.sportfield.Impl;

import za.ac.cput.sportfield.SportFieldSize;

/**
 * Created by qhuphe01 on 2015/09/10.
 */
public class SportFieldSizeImpl implements SportFieldSize {

    public double cricketField(double radius) {

        return Math.PI * Math.pow(radius, 2);

    }

    public double soccerField (double length, double width){
        return length * width;
    }
}
