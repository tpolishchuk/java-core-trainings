/*------TASK 3------*/
    /*Create 5 methods which demonstrate principles of method overloading as you understand it  from Lektion 31.*/


package srijana.workshop_2;


import java.time.Year;

public class Task_3 {

    public static void main(String[] args) {
        movie();
    }

    public static void movie() {
        String movieDetails = movie("Leo", "Vinci");
        float movieRating = movie(2.0f);
        int releaseYear = movie("2018");
        int duration = movie(120);
        System.out.println(movieDetails + " was released on the year: " + releaseYear + " and has rating: " + movieRating + ". Duration: " + duration);
    }

    public static String movie(String title, String director) {
        return "Movie: " + title + ", directed by: " + director;
    }

    public static float movie(float rating) {
        return rating;
    }

    public static int movie(String year){
        return Integer.valueOf(year);
    }

    public static int movie(int mins) {
        return mins;
    }
}




/*function takes input (optional)
function process data
function returns some data (optional)

 */


