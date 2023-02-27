/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Requests;

import java.util.Comparator;

/**
 *
 * @author mahmouderradi
 */
class RequestTitleComparator implements Comparator<Request>{
    
    public int compare(Request requestA, Request requestB){
        
        return requestA.getTitle_Suggestion().compareTo(requestB.getTitle_Suggestion());
        
    }
}
