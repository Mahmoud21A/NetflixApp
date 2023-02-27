/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shows;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;
import Shows.Genre;

/**
 *
 * @author mahmouderradi
 */
public class ShowList {
    
    public static List <Show> shows;

    public ShowList() {
        shows = new ArrayList<>();
    }
    
    public boolean addShow(Show show){
        return shows.add(show);
    }
    
    public boolean removeShow(Show show){
        return shows.remove(show);
    }
    
    public void modifyShow(Show search, Show newShow){
        int index = shows.indexOf(search);
        if(index>=0){
            shows.set(index, newShow);
        }
    }
    
    public List<Show> findShowWithTitle(String title){
        ArrayList<Show> results = new ArrayList<>();
        ListIterator<Show> iterator = shows.listIterator();
        while (iterator.hasNext()){
            Show show = iterator.next();
            if(show.getTitle().equals(title)){
                results.add(show);
            }
        }
        return results;
    }
    
    public List<Show> findShowWithGenre(String genreStr){
        ArrayList<Show> results = new ArrayList<>();
        ListIterator<Show> iterator = shows.listIterator();
        
        genreStr = genreStr.toUpperCase();
        Genre genre = Genre.valueOf(genreStr);
        
        while (iterator.hasNext()){
            Show show = iterator.next();
            if (show.getGenres().contains(genre)) {
                results.add(show);
            }
        }
        return results;
    }    
    
    public void sortTitle(ShowTitleComparator c){
        Collections.sort(shows, c);
    }
    
    public void load(String file) throws ClassNotFoundException, IOException {
        ObjectInputStream in;
        in = new ObjectInputStream(new FileInputStream(file));
        shows = (ArrayList<Show>) in.readObject();
    }

    public void save(String file) throws IOException {
        FileOutputStream fout = new FileOutputStream(file);
        ObjectOutputStream out = new ObjectOutputStream(fout);
        out.writeObject(this.shows);
        out.close();
    }
    
    @Override
    public String toString(){
        String str = "";
        ListIterator<Show> iterator = shows.listIterator();
        while (iterator.hasNext()) {
            Show show = iterator.next();
            str += show.toString() + "\n";
        }
        return str;
    }
    
    public ListIterator<Show> getShows(){
        return shows.listIterator();
    }
}
