package com.fanapCampus;

import com.fanapCampus.session6.Country;
import com.fanapCampus.session6.Generic;
import com.fanapCampus.session7.MyException;
import com.fanapCampus.session7.MyLog4j;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class Main {

    public static void main(String[] args) throws MyException {

          Logger log = LogManager.getLogger(MyLog4j.class);
/*
        //Practic of Generic
        Generic list= new Generic();
        list.listOne= Arrays.asList(1,2,3,4,5);
        list.listTwo=Arrays.asList(6,7,8,9);
        Integer listThree=list.getSumList(list.listOne,list.listTwo);
        System.out.println("Sum  of Two List "+listThree);

        //practice of Map
        Country countryAsia=new Country("IRN","ایران",11111);
        Country countryEurope=new Country("FRA","فرانسه",22222);
        Country countryAfrica=new Country("AGO","آنگولا" ,33333);
        Country countryNorthAmerica=new Country("USA","آمریکا",44444);

        HashMap<String,String> countries=new HashMap<String, String>();
        countries.put(countryAsia.getCountryCode(),countryAsia.getCountryName());
        countries.put(countryEurope.getCountryCode(),countryEurope.getCountryName());
        countries.put(countryAfrica.getCountryCode(),countryAfrica.getCountryName());
        countries.put(countryNorthAmerica.getCountryCode(),countryNorthAmerica.getCountryName());

        for (Map.Entry<String,String> item:countries.entrySet()) {
            String key=item.getKey();
            String value=item.getValue();
            System.out.println(
                    "Country Code is  "+ key +" and  Country Name is "+value);
        }

        System.out.println("Find Country IRN");
        String findValue=countryAsia.findKey("IRN",countries);
        System.out.println(findValue);

*/
        //practice of Exception Country
        Country countryAsia = new Country("IRN", "ایران", 11111);
        Country countryEurope = new Country("FRA", "", 22222);
        Country countryAfrica = new Country("", "آنگولا", 33333);
        Country countryNorthAmerica = new Country("USA", "آمریکا", 44444);

        HashMap<String,String> countries=new HashMap<String, String>();
        countries.put(countryAsia.getCountryCode(),countryAsia.getCountryName());
        countries.put(countryEurope.getCountryCode(),countryEurope.getCountryName());
        countries.put(countryAfrica.getCountryCode(),countryAfrica.getCountryName());
        countries.put(countryNorthAmerica.getCountryCode(),countryNorthAmerica.getCountryName());

        for (Map.Entry<String,String> item:countries.entrySet()) {
            if(!(item.getKey().isEmpty() || item.getValue().isEmpty()) ) {
                try {
                    String key = item.getKey();
                    String value = item.getValue();
                    log.info(
                            "Country Code is  " + key + " and  Country Name is " + value);
                }catch (Exception error){
                    throw new MyException();
                    //زمانیکه این exception را استفاده کردم مجبور شدم exception ی در متد main تعریف کنم که متوجه نشدم
                }
            }
            else{
                log.error("country "+ item +" is null value");
            }

        }
            //فرق exception بلوک try با باوک else در این مثال قابل فهم نمی باشد

    }

}
