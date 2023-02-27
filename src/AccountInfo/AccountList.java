/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccountInfo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author mahmouderradi
 */
public class AccountList {
    public static List <Account> accounts;
    
    public AccountList(){
        accounts = new ArrayList<>();
    }
    
    public boolean addAccount(Account account){
        return accounts.add(account);
    }
    
    public boolean removeAccount(Account account){
        return accounts.remove(account);
    }
    
    public void modifyRequest(Account search, Account newAccount){
        int index = accounts.indexOf(search);
        if(index>=0){
            accounts.set(index, newAccount);
        }
    }
    
    public List<Account> findRequestWithEmail(String email){
        ArrayList<Account> results = new ArrayList<>();
        ListIterator<Account> iterator = accounts.listIterator();
        while (iterator.hasNext()){
            Account account = iterator.next();
            if(account.getEmail().equals(email)){
                results.add(account);
            }
        }
        return results;
    }
    
    public void sortTitle(AccountEmailComparator c){
        Collections.sort(accounts, c);
    }
    
    @Override
    public String toString(){
        String str = "";
        ListIterator<Account> iterator = accounts.listIterator();
        while (iterator.hasNext()) {
            Account account = iterator.next();
            str += account.toString() + "\n";
        }
        return str;
    }
    
    public ListIterator<Account> getRequests(){
        return accounts.listIterator();
    }
}
