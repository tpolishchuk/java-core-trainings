package srijana.workshop_1;

///+Write a short method, which takes 0 or 1 as an argument. It should return false if an argument was 0.
//+It should return true if an argument was 1. It should display an error if an argument does not equal 0 or 1

/**
 * Created by RI02585 on 2/19/2017.
 */

public class Task_3 {

public static void main(String[] args){
        function(0);
        function(1);
        function(1234);



        }

public static void function(int a){

        if(a==0){
        System.out.println("false");

        }

        else if(a==1){
        System.out.println("true");

        }

        else {
        System.out.println("error");

        }
        }


        }
