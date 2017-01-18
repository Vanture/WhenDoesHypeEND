package me.vanture.whendoeshypeend;

import java.util.Date;

/**
 * @author vanture
 * @since 21/06/2016
 */
public class Hype {
    public static void main(String[] args) {

        /* 
        * It's so cringy but funny...
        */
        
        // When does the Hype really end? Well it will finally be calculated!
        long H = 'H';
        long y = 'y';
        long p = 'p';
        long e = 'e';

        long hype = 1337; //You're a l33t to?
        hype = (long) Math.pow(hype, H);
        hype = (long) Math.pow(hype, y);
        hype = (long) Math.pow(hype, p);
        hype = (long) Math.pow(hype, e);

        System.out.println("When does HYPE end?!?!?");
        System.out.println(new Date(hype));
    }
}
