package com.eros.util;

import java.util.List;

public class Sort {

    public static void BubbleSort(List<Integer> list){
        for(int i=0;i<list.size();i++){
            boolean flag=true;
            for(int j=i+1;j<list.size();j++){
                if(list.get(i)>list.get(j)){
                    int temp=list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                    flag=false;
                }
            }
            if(flag) break;
        }
    }
}
