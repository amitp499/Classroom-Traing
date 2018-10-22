package com.Logger_Log4J;

import com.amit.Main;
import org.apache.log4j.*;
public class Logger_Log4J {

    static  Logger log = Logger.getLogger(Logger_Log4J.class);

    public static void main(String[] args) {
        log.info("Infor Message");
        log.debug("Debug Message");
        log.error("Error Message");
        log.fatal("Exception Occured", new RuntimeException("Dummy"));



    }
}
