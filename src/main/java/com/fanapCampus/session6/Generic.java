package com.fanapCampus.session6;

import java.util.List;

public class Generic {

    public List<Integer> listOne;
    public List<Integer> listTwo;

    public Integer getSumList( List<Integer> listOne,List<Integer> listTwo){

        Integer sum=0;
        int indexTwo=0;
        for (int indexOne=0;indexOne<listOne.size();indexOne++) {

            if (indexTwo == indexOne && indexTwo <listTwo.size()) {


                sum += listOne.get(indexOne) + listTwo.get(indexTwo);
                indexTwo ++;
            }//else
               // System.out.println("Error");

        }
        return  sum;
    }
}
