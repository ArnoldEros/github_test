package com.eros.test;

import com.eros.util.Sort;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class UtilTest {

    @Test
    public void testSort(){
        List<Integer> list=new ArrayList<>();
        list.add(4);
        list.add(2);
        list.add(5);
        list.add(1);
        list.add(6);
        list.add(10);
        list.add(3);
        for (Integer integer : list) {
            System.out.print(integer+" ");
        }
        System.out.println();
        Sort.BubbleSort(list);
        for (Integer integer : list) {
            System.out.print(integer+" ");
        }
    }
}
