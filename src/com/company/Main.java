package com.company;
import java.util.ArrayList;

public class Main{
    public Main(){
        String st = "The quick brown fox jumped over the lazy dog";
        String empty = "";
        String[] st2 = st.split(" ");
        ArrayList<String> store = new ArrayList<String>();
        //Problem 1
        for(int i = st.length()-1; i >= 0; i--){
            System.out.print(st.charAt(i));
        }
        System.out.println();
        for(int i = st.length()-1; i >=0; i--){
            System.out.print(st.substring(i, i+1));
        }
        System.out.println();
        //Problem 2
        for(int i = 0; i < st.length(); i++){
            if(st.charAt(i) == 'a' || st.charAt(i) == 'e' || st.charAt(i) == 'i' || st.charAt(i) == 'o' || st.charAt(i) == 'u'){
                int rand = (int)(Math.random()*42)+80;
                empty+=(char)rand;
            }
            else{
                empty+=st.charAt(i);
            }
        }
        System.out.println(empty);
        //Problem 3
        for(int i = 0; i < st2.length; i++){
            store.add(st2[i]);
            store.set(i, store.get(i).substring(1, (store.get(i).length()-1)));
        }
        for(int i = 0; i < store.size(); i++){
            System.out.print(store.get(i)+ " ");
        }
    }
    public static void main(String args[]){
        Main app = new Main();
    }
}