package practice.collections.Lists;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {

    @Test
    public void arrayListdefinitionandLoad() {

        //define and add heterogeneous data
        List anyList = new ArrayList();
        anyList.add("test");
        anyList.add(1);
        anyList.add(true);
        System.out.println(anyList.add(1));
        //returns the addition process status result
        System.out.println(anyList);
        //o/p > test, 1, true,1 -- insertion order is preserved and duplicates are allowed.

        //define and add homogeneous data
        List<String> stringList = new ArrayList<>();
        stringList.add("one");
        stringList.add(0,"first");

        // returns boolean after adding value
        System.out.println(stringList.add("two"));

        // doesn't return any value when added with index
        stringList.add(0,"updated after first");

        System.out.println(stringList);
    }
}
