/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Subscriptions;
import java.util.Date;

/**
 *
 * @author mahmouderradi
 */
public class PayementMethod {
    
  private String holder_name;
  private Date expiration;
  private Type type;
  private int number;

  public PayementMethod(String holder_name, Date expiration, Type type, int number){
    this.holder_name = holder_name;
    expiration = new Date();
    this.type = type;
    this.number = number;
  }

  String getHolder_Name(){
    return holder_name;
  }

  Date getExpiration(){
    return expiration;
  }

  Type getTypel(){
    return type;
  }

  int getNumber(){
    return number;
  }
  
  void setEmail(String holder_name){
    this.holder_name = holder_name;
  }

  void setExpiration(Date expiration){
    this.expiration = expiration;
  }

  void setType(Type type){
    this.type = type;
  }

  void setNumber(int number){
    this.number = number;
  }

  @Override
  public String toString(){
    return holder_name + " " + expiration + " " + type + " " + number;
  }

}
