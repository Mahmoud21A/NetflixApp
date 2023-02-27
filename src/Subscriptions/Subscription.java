/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Subscriptions;
import java.util.Date;
import java.util.Map;

/**
 *
 * @author mahmouderradi
 */
public class Subscription {
    
  private Date subscribed;
  private Plan current_plan;
  private Date cancelled;
  private String cancel_reason;
  private Map billing_by_month;

  public Subscription(Date subscribed, Plan current_plan, Date cancelled, String cancel_reason, Map billing_by_month){

    this.subscribed = subscribed;
    this.current_plan = current_plan;
    cancelled = new Date();
    this.cancel_reason = cancel_reason;
    this.billing_by_month = billing_by_month;

  }

  Date getSubscribed(){
    return subscribed;
  }
  
  Plan getCurrent_Plan(){
    return current_plan;
  }

  Date getCancelled(){
    return cancelled;
  }

  String getCancel_Reason(){
    return cancel_reason;
  }

  Map getBilling_by_Month(){
    return billing_by_month;
  }

  void setSubscribed(Date subscribed){
    this.subscribed = subscribed;
  }
  
  void setCurrent_Plan(Plan current_plan){
    this.current_plan = current_plan;
  }

  void setCancelled(Date cancelled){
    this.cancelled = cancelled;
  }

  void setCancel_Reason(String cancel_reason){
    this.cancel_reason = cancel_reason;
  }

  void setBilling_by_Month(Map billing_by_month){
    this.billing_by_month = billing_by_month;
  }
  
  @Override
  public String toString(){
    return subscribed + " " + current_plan + " " + cancelled + " " + cancel_reason + " " + billing_by_month;
  }
  
}
