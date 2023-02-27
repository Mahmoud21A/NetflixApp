/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccountInfo;

import java.util.Comparator;

/**
 *
 * @author mahmouderradi
 */
class AccountEmailComparator implements Comparator<Account> {
    
    @Override
    public int compare(Account accountA, Account accountB){
        
        return accountA.getEmail().compareTo(accountB.getEmail());
        
    }
}
