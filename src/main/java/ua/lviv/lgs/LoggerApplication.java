package ua.lviv.lgs;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class LoggerApplication {
    private static Logger LOG = Logger.getLogger(LoggerApplication.class);

    public static void main(String[] args) {
        System.out.println("This is an application that shows a work of loggers!!!");
        System.out.println("Let's do it....");
        System.out.println();
        System.out.println("==========================================================");

        DOMConfigurator.configure("log4j.xml");
        try {
            System.out.println("Try block Message");
            LOG.debug("Start the program");
            LOG.warn("Try block almost done, error is possible in next line");
            int i = 5/0;
        } catch (Exception e) {
            e.printStackTrace();
            LOG.error(e.getMessage().toString());
        } finally {
            System.out.println("Finally Message");
            LOG.info("Finaly block done");
        }
    }
}