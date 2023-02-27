/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccountInfo;

/**
 *
 * @author mahmouderradi
 */
public class Account {
  private String email;
  private String password;

  public Account(String email, String password){
    this.email = email;
    this.password = password;
  }
  
  public String getEmail(){
    return email;
  }

  public String getPassword(){
    return password;
  }

  public void setEmail(String email){
    this.email = email;
  }

  public void setPasswords(String password){
    this.password = password;
  }

  @Override
  public String toString(){
    return email + " " + password;
  }
  
  @Override
  public boolean equals (Object obj){
    if(obj != null && obj instanceof Account){
      Account account = (Account) obj;
      return (this.email.equals(account.getEmail()));
    }
    return false;
  }
}
