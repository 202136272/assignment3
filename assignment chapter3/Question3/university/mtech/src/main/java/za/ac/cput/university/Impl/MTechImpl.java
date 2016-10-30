package za.ac.cput.university.Impl;

import za.ac.cput.university.MTech;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by student on 2015/02/20.
 */
public class MTechImpl implements MTech {

    private Map<String, String> mtech;
    private String stdDetail = "";      // return Tokens string

    public MTechImpl()
    {
        createStudentDetail();
    }

    public void createStudentDetail()
    {
        mtech = new HashMap<String, String>();

        mtech.put("205938439", "Khanyisa#Abram#MTECH");
        mtech.put("230239498", "Jim#Can#MTECH");
    }

    @Override
    public String welcome(String studentNo) {

        if(mtech.containsKey(studentNo)){
            stdDetail = mtech.get(studentNo);
            return stdDetail;
        }
        else{
            return "Consult";
        }
    }
}
