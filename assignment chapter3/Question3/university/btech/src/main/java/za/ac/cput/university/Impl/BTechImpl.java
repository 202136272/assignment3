package za.ac.cput.university.Impl;

import za.ac.cput.university.BTech;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by student on 2015/02/20.
 */
public class BTechImpl implements BTech {

    private Map<String, String> btechStdList;   // BTech Student List
    private String stdDetail = "";


    public BTechImpl(){
        createStudentList();
    }
    public void createStudentList() {

        btechStdList = new HashMap<String, String>();

        btechStdList.put("209334983", "Mike#Donalds#BTECH");
        btechStdList.put("207899332", "Thabo#Mandila#BTECH");
    }

    @Override
    public String welcome(String studentNo) {

        if(btechStdList.containsKey(studentNo)) {
            stdDetail = (String)btechStdList.get(studentNo);
            return stdDetail;
        }
        else {
            return "Consult";
        }
    }
}
