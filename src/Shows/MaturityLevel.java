/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shows;

/**
 *
 * @author mahmouderradi
 */
public class MaturityLevel {
    
  private int min_age;
  private String description;

  public MaturityLevel(int min_age, String description){
    this.min_age = min_age;
    this. description = description;
  }

  int getMin_Age(){
    return min_age;
  }

  String getDescription(){
    return description;
  }

  void setMin_Age(int min_age){
    this.min_age = min_age;
  }

  void setDescription(String description){
    this.description = description;
  }

  @Override
  public String toString(){
    return min_age + " " + description;
  }

}
