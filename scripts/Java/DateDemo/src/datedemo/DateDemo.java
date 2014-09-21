/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package datedemo;

import java.util.*;
import java.text.*;

/**
 *
 * @author Common
 */
public class DateDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date dNow = new Date();
        String str = "";
        SimpleDateFormat ft = new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
        str = "CurrentDate:" + ft.format(dNow);
        System.out.println(str);
    }
    
}
