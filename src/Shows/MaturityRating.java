/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shows;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author mahmouderradi
 */
public class MaturityRating {
    
  private List<String> rating_reason;

  public MaturityRating(){
    rating_reason = new ArrayList<>();
  }

  List<String> getRating_Reason(){
    return rating_reason;
  }

  void setMin_Age(List<String> rating_reason){
    this.rating_reason=rating_reason;
  }

  @Override
  public String toString(){
    return rating_reason + " ";
  }
  
}
