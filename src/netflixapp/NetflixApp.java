/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package netflixapp;
import AccountInfo.*;
import Subscriptions.*;
import Shows.*;
import Requests.*;
import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author mahmouderradi
 */
public class NetflixApp {
    
    static List <Show> shows = new ArrayList<>();
    static List <Account> customers = new ArrayList<>();
    static List <Request> requests;
    Map plans_by_country;
    Map maturity_by_region;

  static Scanner scanner = new Scanner(System.in);
  
    public static void main(String[] args) {
        
        Show showA = new Movie("152 minutes", "Harry Potter and the Philosopher's Stone", "ULTRA_HD", "DRAMA", "ENGLISH", 99, "First Harry Potter movie", 10, "59:59:59");
        Show showB = new Series(9, 201, "The Office", "HD", "COMEDY", "ENGLISH", 99, "Workplace Comedy", 99, "59:59:59");
        Show showC = new Movie("558 minutes", "The Lord of the Rings", "ULTRA_HD", "DRAMA", "ENGLSIH", 99, "Based on book series by J. R. R. Tolkien", 10, "59:59:59");
        Show showD = new Series(8, 73, "Game of Thrones", "ULTRA_HD", "DRAMA", "ENGLISH", 99, "Based on the book series by George R. R. Martin", 99, "59:59:59");
        shows.add(showA);
        shows.add(showB);
        shows.add(showC);
        shows.add(showD);
        
    int choice;
    do{
            
      System.out.print("""
                       1. Register a new Account.
                       2. Add a show (Movie or Series) to the list.
                       3. Browse for Shows.
                       4. Search for Shows.
                       5. Quit.
                       Your choice: """);
            
      choice = scanner.nextInt();
            
      switch(choice){
                
        case 1 -> register();
                      
        case 2 -> addShow();

        case 3 -> browse();
        
        case 4 -> {
            System.out.println("Search: ");
            String a = scanner.nextLine();
            String search = scanner.nextLine();
            List <Show> searchResult = search(search);
            System.out.println("Result of the search:\n");
            searchResult.forEach(result -> {
                System.out.println("----------------------------------");
                System.out.println(result.toString());
                System.out.println("----------------------------------");
            });
        }

        case 5 -> {
            scanner.close();
            System.out.println("Program End");
                }

        default -> System.out.println("Invalid choice, try again.\n");
      }
            
            
    } while(choice != 5);
        
  }
    
  
  static void register(){

    System.out.println("Please Enter your email address");
    String email = scanner.next();
    try{
        checkEmail(email);
    }
    catch(DuplicateEmailException e){
        System.out.println("A problem occured: " + e);
        return;
    }

    System.out.println("Please Enter your account password");
    String password = scanner.next();

    Account account = new Account(email, password);
    System.out.println("Your new account was created successfully\n");
    customers.add(account);
    for(Account customer: customers){
       System.out.println(customer);
    }
    
  }
  
  
  static void browse(){      
      for(Show show: shows){
        System.out.println("----------------------------------");
        System.out.println(show);
    }
      System.out.println("----------------------------------");
      System.out.println("\n");
  }

  
  static void addShow(){
      
    System.out.println("Please Enter the name of the show");
    String title = scanner.next();

    System.out.println("\nPlease choose the quality of the show from the following options:");
    Quality[] options = Quality.values();
    for(Quality quality : options){
      System.out.println(quality + " ");
    }
    String quality = scanner.next();
    
    System.out.println("\nPlease choose the genre of the show from the following options:");
    Genre[] genres = Genre.values();
    for(Genre genre : genres){
      System.out.println(genre + " ");
    }
    String genre = scanner.next();
    
    System.out.println("\nPlease choose the language of the show from the following options:");
    Language[] languages = Language.values();
    for(Language language : languages){
      System.out.println(language + " ");
    }
    String language = scanner.next();
    
    System.out.println("Please Enter the number of views");
    int num_views = scanner.nextInt();

    System.out.println("Please Enter the synopsys of the show");
    String synopsys = scanner.next();

    System.out.println("Please Enter the average rating");
    double average_rating = scanner.nextDouble();
    String a = scanner.nextLine();

    System.out.println("Please Enter the total watch time of the show");
    String total_watch = scanner.nextLine();
    
    Boolean invalidType = true;
    String type;
    do{
    System.out.println("Please specify the type of the show (Movie or Series)");
    type = scanner.nextLine();
    
    try{
        invalidType = checkType(type, invalidType);
    }
    catch(InvalidTypeException e){
        System.out.println("A problem occured: " +e);
    }
    }while(invalidType == true);
    
    if(type.equalsIgnoreCase("Movie")){
        System.out.println("Please Enter the duration of the movie:");
        String duration = scanner.nextLine();
        Show movie = new Movie(duration, title, quality, genre, language, num_views, synopsys, average_rating, total_watch);
        shows.add(movie);
    }
    
    else if(type.equalsIgnoreCase("Series")){
        System.out.println("Please Enter the number of seasons:");
        int number_of_seasons = scanner.nextInt();
        System.out.println("Please Enter the number of episodes:");
        int number_of_episodes = scanner.nextInt();
        Show series = new Series(number_of_seasons, number_of_episodes, title, quality, genre, language, num_views, synopsys, average_rating, total_watch);
        shows.add(series);
    }

  }
  
  
  static Boolean checkType(String type, Boolean invalidType) throws InvalidTypeException{
      
      if(type.equalsIgnoreCase("Movie") || type.equalsIgnoreCase("Series")) {
          return invalidType = false;
      }
        
      else {
          throw new InvalidTypeException("Please enter a valid type of show!"); 
      }   
        
   }
  
  static void checkEmail(String email) throws DuplicateEmailException{
    for(Account customer: customers){
        
        if(customer.getEmail().equals(email) == true){
            throw new DuplicateEmailException("This email address is already in use.");
        }
        
    }
    
  }
  
  
  static ArrayList<Show> search(String title){
      ArrayList<Show> searchResults = new ArrayList<>();
      ListIterator<Show> iterator = shows.listIterator();
      while (iterator.hasNext()){
          Show show = iterator.next();
          if(show.getTitle().equals(title)){
              searchResults.add(show);
          }
      }
      return searchResults;
  }

}
