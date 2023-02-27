/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Requests;
import AccountInfo.Account;
import java.util.Date;

/**
 *
 * @author mahmouderradi
 */
public class Request {
    
  private Account requester;
  private Date request_made;
  private String title_suggestion;

  public Request(Account requester, Date request_made, String title_suggestion){
    this.requester = requester;
    request_made = new Date();
    this.title_suggestion = title_suggestion;
  }

  Account getRequester(){
    return requester;
  }

  Date getRequest_Made(){
    return request_made;
  }

  String getTitle_Suggestion(){
    return title_suggestion;
  }

  void setRequester(Account requester){
    this.requester = requester;
  }

  void setRequest_Made(Date request_made){
    this.request_made = request_made;
  }

  void setTitle_Suggestion(String title_suggestion){
    this.title_suggestion = title_suggestion;
  }

  @Override
  public String toString(){
    return requester + " " + request_made + " " + title_suggestion;
  }

}
