package za.ac.cput.university.Impl;

import za.ac.cput.university.BTech;
import za.ac.cput.university.MTech;
import za.ac.cput.university.Student;
import za.ac.cput.university.ThirdYear;

/**
 * Created by student on 2015/02/20.
 */
public class ModularStudentImpl implements Student {

    private ThirdYear thirdyearmodule = new ThirdYearImpl();
    private BTech btechmodule = new BTechImpl();
    private MTech mtechmodule = new MTechImpl();

    @Override
    public String thirdYear(String stdNo) {
        return thirdyearmodule.welcome(stdNo);
    }

    @Override
    public String btech(String stdNo) {
        return btechmodule.welcome(stdNo);
    }


    @Override
    public String mtech(String stdNo) {
        return mtechmodule.welcome(stdNo);
    }
}
