/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Subscriptions;
import Shows.Quality;

/**
 *
 * @author mahmouderradi
 */
public class Plan {
    
  private double cost;
  private int screen_num;
  private int download_devices;
  private Quality quality;

  public Plan(double cost, int screen_num, int download_devices, Quality quality){

    this.cost = cost;
    this.screen_num = screen_num;
    this.download_devices = download_devices;
    this.quality = quality;

  }

  double getCost(){
    return cost;
  }

  int getScreen_Num(){
    return screen_num;
  }

  int getDownload_Devices(){
    return download_devices;
  }

  Quality getQuality(){
    return quality;
  }

  void setCost(double cost){
    this.cost = cost;
  }

  void setScreen_Num(int screen_num){
    this.screen_num = screen_num;
  }

  void setDownload_Devices(int download_devices){
    this.download_devices = download_devices;
  }

  void setQuality(Quality quality){
    this.quality = quality;
  }

  @Override
  public String toString(){
    return cost + " " + screen_num + " " + cost + " " + quality;
  }
  
}
