/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Requests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author mahmouderradi
 */
public class RequestList {
    
    public static List <Request> requests;
    
    public RequestList(){
        requests = new ArrayList<>();
    }
    
    public boolean addRequest(Request request){
        return requests.add(request);
    }
    
    public boolean removeRequest(Request request){
        return requests.remove(request);
    }
    
    public void modifyRequest(Request search, Request newRequest){
        int index = requests.indexOf(search);
        if(index>=0){
            requests.set(index, newRequest);
        }
    }
    
    public List<Request> findRequestWithSuggestion(String suggestion){
        ArrayList<Request> results = new ArrayList<>();
        ListIterator<Request> iterator = requests.listIterator();
        while (iterator.hasNext()){
            Request request = iterator.next();
            if(request.getTitle_Suggestion().equals(suggestion)){
                results.add(request);
            }
        }
        return results;
    }
    
    public void sortTitle(RequestTitleComparator c){
        Collections.sort(requests, c);
    }
    
    @Override
    public String toString(){
        String str = "";
        ListIterator<Request> iterator = requests.listIterator();
        while (iterator.hasNext()) {
            Request request = iterator.next();
            str += request.toString() + "\n";
        }
        return str;
    }
    
    public ListIterator<Request> getRequests(){
        return requests.listIterator();
    }
    
}
