/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shows;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author mahmouderradi
 */
public class Show implements Serializable{
    
  private String title;
  private Date release_date;
  private Quality quality;
  private Genre genre;
  private List<Genre> genreList = new ArrayList<>();
  private Language lang;
  private int num_views;
  private String synopsys;
  private double average_rating;
  private String total_watch;

  public Show(String title, String quality, String genre, String lang, int num_views, String synopsys, double average_rating, String total_watch) {
    this.title = title;
    release_date = new Date();
    setQuality(quality);
    setGenres(genre);
    setLang(lang);
    this.num_views = num_views;
    this.synopsys = synopsys;
    this.average_rating = average_rating;
    this.total_watch = total_watch;
    }
  

  public String getTitle() {
    return title;
  }

  public Date getRelease_date() {
    return release_date;
  }

  public Quality getQuality() {
    return quality;
   }

  public List<Genre> getGenres() {
    return genreList;
  }
  
  public Genre getGenre(){
      return genre;
  }

  public Language getLang() {
    return lang;
  }

  public int getNum_views() {
    return num_views;
  }

  public String getSynopsys() {
    return synopsys;
  }

  public double getAverage_rating() {
    return average_rating;
  }

  public String getTotal_watch() {
    return total_watch;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setRelease_date(Date release_date) {
    this.release_date = release_date;
  }

  public void setQuality(String quality) {
    if(quality.equalsIgnoreCase(Quality.HD.name()) || quality.equalsIgnoreCase(Quality.ULTRA_HD.name())){
      quality = quality.toUpperCase();
      this.quality = Quality.valueOf(quality);
    }
  }

  public void setGenres(String genres) {
    if(genres.equalsIgnoreCase(Genre.COMEDY.name()) || genres.equalsIgnoreCase(Genre.DRAMA.name())){
      genres = genres.toUpperCase();
      genreList.add(Genre.valueOf(genres));
    }
  }

  public void setLang(String lang) {
    if(lang.equalsIgnoreCase(Language.ENGLISH.name()) || lang.equalsIgnoreCase(Language.FRENCH.name()) || lang.equalsIgnoreCase(Language.SPANISH.name())){
      lang = lang.toUpperCase();
      this.lang = Language.valueOf(lang);
    }
  }

  public void setNum_views(int num_views) {
    this.num_views = num_views;
  }

  public void setSynopsys(String synopsys) {
    this.synopsys = synopsys;
  }

  public void setAverage_rating(double average_rating) {
    this.average_rating = average_rating;
  }

  public void setTotal_watch(String total_watch) {
    this.total_watch = total_watch;
  }
  /*
  @Override
  public String toString() {
    return "Show Title: " + title + "\nRelease date: " + release_date + "\nQuality: " + quality + "\nGenre: " + genreList + "\nLanguage: " + lang  + "\nNumber of views: " + num_views + "\nSynopsys: " + synopsys + "\nAverage rating: " + average_rating + "\nTotal watch time: " + total_watch + "\n";
  }*/
  
    //FOR GUI
  public Show(String title, Quality quality, Genre genre, Language lang, int num_views, String synopsys, double average_rating, String total_watch) {
    this.title = title;
    release_date = new Date(); 
    this.quality = quality;
    this.genre = genre;
    this.lang = lang;
    this.num_views = num_views;
    this.synopsys = synopsys;
    this.average_rating = average_rating;
    this.total_watch = total_watch;
    }
  
  @Override
  public String toString() { //To be used in the GUI. It should return only the key.
    return title + " ";
  }


}
