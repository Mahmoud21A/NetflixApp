/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccountInfo;
import Shows.*;
import java.util.Date;

/**
 *
 * @author mahmouderradi
 */
public class Viewing {
    
  private Date date;
  private Show show;
  private Rating rate;

  public Viewing (Date date, Show show, Rating rate){
    date = new Date();
    this.show = show;
    this.rate = rate;
  }

  Date getDate(){
    return date;
  }

  Show getShow(){
    return show;
  }

  Rating getRate(){
    return rate;
  }

  void setDate(Date date){
    this.date = date;
  }

  void setShow(Show show){
    this.show = show;
  }

  void setRate(Rating rate){
    this.rate = rate;
  }

  @Override
  public String toString(){
    return date + " " + show + " " + rate;
  }  
  
}
