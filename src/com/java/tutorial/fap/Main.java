package com.java.tutorial.fap;

import java.util.Arrays;
class InvalidStringException extends Exception{

}
public class Main {

    public static void main(String[] args) {
        try{
            System.out.println(doStuff(args));
        } catch (Exception e) {System.out.println("exec");}
        doStuff(args);
    }
    static int doStuff(String[] args) {
        return Integer.parseInt(args[0]);
    }
}

//    SELECT country_name, city_name, (SELECT COUNT(*) FROM customer JOIN city ON city.id = customer.city_id )
//        FROM country, city
//        WHERE country.id = city.country_id
//        AND (SELECT COUNT(*) FROM customer JOIN city ON city.id = customer.city_id ) > ((COUNT(*) FROM customer)/(COUNT(*) FROM city));
