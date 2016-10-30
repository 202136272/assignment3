package za.ac.cput.university.Impl;

import za.ac.cput.university.ThirdYear;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by student on 2015/02/20.
 */
public class ThirdYearImpl implements ThirdYear {

    private Map<String, String> studentList;
    private String stdDetail = "";          // return Token for Student Detail

    public ThirdYearImpl()
    {
        createStudentList();

    }

    public void createStudentList()
    {
        studentList = new HashMap<String, String>();

        // create student list
        studentList.put("211113409", "Phelang#Qhu#NDIT");
        studentList.put("211209129", "Panda#Zakes#NDIT");

    }
    @Override
    public String welcome(String studentNo) {

        if(studentList.containsKey(studentNo))
        {
            stdDetail = (String)studentList.get(studentNo);
            return stdDetail;
        }
        else
        {
            return "Consult";
        }
    }
}
