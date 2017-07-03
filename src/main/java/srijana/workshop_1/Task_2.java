
//Write a short method, which takes String as an argument and returns it as int.
// If String cannot be converted to int, display this information with System.out.println() to user


package srijana.workshop_1;


public class Task_2 {

    public  static  void main (String[]args){

        System.out.println(ConvertStringToInt("1234"));
    }

    public static int ConvertStringToInt(String str ){

        return Integer.valueOf(str);


    }
}
