# Book My Show Application 🎬🍿

## Overview

The **Book My Show Application** is a simple console-based Java application designed to simulate a movie booking system. It allows users to book tickets for movies 🎥, select snacks 🍔, and view the booking details 📜. The project demonstrates object-oriented principles with classes for Movies, Snacks, and the booking system.

This application is built using Java ☕ and includes the following main components:
- **Movie** class to represent movies 🎬.
- **Snack** class to represent available snacks 🍕.
- **BookMyShow** service to handle ticket booking 🎟️ and snack selection 🍽️.
- **BookingDesk** class implementing the `BookMyShow` interface for managing bookings 📅.

## Features ✨

- **Movie Booking** 🎥: Users can choose from a list of movies based on their genre.
- **Snack Selection** 🍟: Users can select snacks while booking their movie tickets.
- **Booking Details** 📋: The application displays the list of movies and snacks selected for booking.
- **Logout** 🚪: After booking, the user can log out of the system.

## Project Structure 🏗️

The project is structured into different packages for organizing the application:

- **`com.model`**: Contains classes for `Movie` 🎬 and `Snack` 🍔.
- **`com.service`**: Contains service classes `BookMyShow` 🎟️ and `BookingDesk` 💼.

## Classes 📚

### Movie Class 🎬
- Represents a movie with attributes such as movie ID, name, rating, and genre.

### Snack Class 🍕
- Represents a snack with attributes such as snack ID, name, origin, and price.

### BookMyShow Interface 🎟️
- Contains methods for booking tickets, adding snacks, and printing booking details.

### BookingDesk Class 💼
- Implements the `BookMyShow` interface, providing concrete implementations for the methods such as booking tickets, adding snacks, and printing booking details.

### Test Class 🧪
- This is the entry point of the application, which simulates the user experience of booking tickets, selecting snacks, and printing the final booking details.

## Code Walkthrough 🚶‍♂️

### Main Code Flow 🔄
1. **Movie and Snack Initialization** 🎬🍟: The program initializes a list of movies and snacks.
2. **Ticket Booking** 🎟️: Users can book tickets for a movie from the available list.
3. **Snack Selection** 🍔: Users can select snacks to accompany their movie tickets.
4. **Displaying Details** 📜: After booking, the application prints the movie and snack details selected by the user.
5. **Logout** 🚪: Finally, the user can log out from the system.
