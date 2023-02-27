/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccountInfo;
import Shows.*;
import Subscriptions.*;
import Requests.Request;
import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;

/**
 *
 * @author mahmouderradi
 */
public class User {
    
  private String phone;
  private List <Profile> profile;
  private List <Request> requests;
  private PayementMethod pay_method;

  public User(String phone, List<Profile> profile, List <Request> requests, PayementMethod pay_method){
    this.phone = phone;
    profile = new ArrayList<>();
    requests = new ArrayList<>();
    this.pay_method = pay_method;
  }

  String getPhone(){
    return phone;
  }

  ListIterator<Profile> getProfile(){
    return profile.listIterator();
  }

  ListIterator<Request> getRequests(){
    return requests.listIterator();
  }

  PayementMethod getPay_Method(){
    return pay_method;
  }

  void setPhone(String phone){
    this.phone = phone;
  }

  void setProfile(Profile newProfile){
    profile.add(newProfile);
  }

  void setRequests(Request request){
    requests.add(request);
  }

  void setPay_Method(PayementMethod pay_method){
    this.pay_method = pay_method;
  }
  
  @Override
  public String toString(){
    return phone + " " + profile + " " + requests + " " + pay_method;
  }
  
}
