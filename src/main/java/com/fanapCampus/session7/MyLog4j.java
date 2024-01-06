package com.fanapCampus.session7;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MyLog4j {
    public static Logger log = LogManager.getLogger(MyLog4j.class);

    public static void main(String[] args) {
        log.debug("Debug Message Logged !!!");
        log.info("Info Message Logged !!!");
        log.error("Error Message Logged !!!");
    }

    //اتفاقی که می افته در پوشه logs یک بار log.log اجرا میشود و بعد طبق pattern تعریف شده فایل log را ایجاد می کند
}
