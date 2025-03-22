package com.user;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import com.model.Movie;
import com.model.Snack;
import com.service.BookMyShow;
import com.service.BookingDesk;

public class Test {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		BookMyShow desk=new BookingDesk();
		
		Movie m1 = new Movie(101,"Jawan",8.9f,"Action");
		Movie m2 = new Movie(102,"Rockey aur Rani ki prem kahani",8.3f,"Romantic");
		Movie m3 = new Movie(103,"Darna Zaruri Hai",9.9f,"Thriller");
		Movie m4 = new Movie(104,"Nun 2",8.1f,"Horror");
		Movie m5 = new Movie(105,"Dream Girl 2",8.3f,"Drama");
		
		List<Movie> m = new ArrayList<>();
		m.add(m1);
		m.add(m2);
		m.add(m3);
		m.add(m4);
		m.add(m5);
		
		Movie movie =desk.bookTicket(m);
		
		Snack s1=new Snack(101,"Burger","French food",70);
		Snack s2=new Snack(102,"Pizza","Italian",100);
		Snack s3=new Snack(103,"popcorn","Indian",120);
		Snack s4=new Snack(104,"French Fries","French food",90);
		Snack s5=new Snack(105,"Cheese Sandwich","American",100);
		List<Snack> ns=new ArrayList<>();
		ns.add(s1);
		ns.add(s2);
		ns.add(s3);
		ns.add(s4);
		ns.add(s5);
		
		List<Snack> snack=desk.addMeal(ns);
		
		Map movie_snack = new HashMap<>();
		movie_snack.put(1, ns);
		movie_snack.put(2, m);
		
		desk.printDetails(movie_snack);
		
		desk.logout();
	}

}
