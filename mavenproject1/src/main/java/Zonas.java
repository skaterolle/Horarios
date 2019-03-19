/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usuario
 */
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;


public class Zonas {
    
    Local hor = new Local();

    public String zona(String zona1, String zona2) {
        Date purchaseDate = new Date();

        System.out.println("Fecha/Hora "+ zona1);
        System.out.println(hor.cogerHora());

        DateFormat outFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        outFormat.setTimeZone(TimeZone.getTimeZone(zona2));

        System.out.println("Misma Fecha/Hora en " + zona2);
        System.out.println(outFormat.format(purchaseDate));
        
        return (String)outFormat.format(purchaseDate);

    }

}
