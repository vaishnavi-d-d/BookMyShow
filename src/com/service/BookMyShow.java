package com.service;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.model.Movie;
import com.model.Snack;

public interface BookMyShow {
	Movie bookTicket(List<Movie> mv);

//    Snack addMeal(Scanner s);

    void printDetails(Map<Integer, List<Object>> m);

	void logout();

	public List<Snack> addMeal(List<Snack> sn);

	
	

}

