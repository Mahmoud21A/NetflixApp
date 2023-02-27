/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shows;

import java.util.Comparator;

/**
 *
 * @author mahmouderradi
 */
public class ShowTitleComparator implements Comparator<Show>{
    
    public int compare(Show showA, Show showB){
        
        return showA.getTitle().compareTo(showB.getTitle());
        
    }
    
}

