package za.ac.cput.datastructures.Impl;

import za.ac.cput.datastructures.Datastructures;

import java.util.*;

/**
 * Created by student on 2015/09/05.
 */
public class DatastructuresImpl implements Datastructures {


    public DatastructuresImpl() {
        super();
    }

    @Override
    public Set<String> winningnumbers() {
        Set myCar = new HashSet();
        myCar.add(2);
        myCar.add(0);
        myCar.add(8);
        myCar.add(14);
        myCar.add(14);
        return myCar;
    }

    @Override
    public Map<String, String> myBooks() {

        Map books = new HashMap();
        books.put("1", "Java");
        books.put("2", "C++");
        books.put("3", "PL/SQL");
        return books;

    }

    @Override
    public List<String> cars() {

        List cars = new ArrayList();
        cars.add("Rollsroyce");
        cars.add("Range Rover");
        cars.add("BMW");

        return cars;

    }
}
