/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dateand.time;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author SABUJ CHANDRA PAUL
 */
public class DateAndTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Date dNow = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("hh-mm-ss");

        String tD = ft.format(dNow);
        
        System.out.println("Current Date: " + tD);
//        System.out.println("hdhd");
//        
//        Date dNow1 = new Date();
//        SimpleDateFormat ft1 = new SimpleDateFormat("hh:mm:ss a zzz\nE yyyy.MM.dd");
//        String tD1 = ft1.format(dNow1);
//        System.out.println("Current Date1: " + tD1);
    }
}
