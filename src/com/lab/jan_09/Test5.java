package com.lab.jan_09;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class GenreSort implements Comparator<Movie> 
{
     public int compare(Movie one, Movie two) 
     {
           return one.getGenre().compareTo(two.getGenre());
     }
}
class Movie implements Comparable<Movie> 
{
     String title;
     String genre;
     String leadActor;
     Movie(String t, String g, String a) 
     {
           title = t;
           genre = g;
           leadActor = a;
     }
     public String toString() 
     {
           return title + " " + genre + " " + leadActor + "\n";
     }
     public int compareTo(Movie d) 
     {
           return title.compareTo(d.getTitle());
     }
     public String getTitle() 
     {
           return title;
     }
     public String getGenre() 
     {
           return genre;
     }
     public void setGenre(String genre) 
     {
           this.genre = genre;
     }
}
public class Test5 
{
     public static void main(String[] args) 
     {
           ArrayList<Movie> dvdlist = new ArrayList<Movie>();
           System.out.println(dvdlist); 
           Collections.sort(dvdlist);
           System.out.println(dvdlist); 
           GenreSort gs = new GenreSort();
           Collections.sort(dvdlist, gs);
           System.out.println(dvdlist); 
     }
}