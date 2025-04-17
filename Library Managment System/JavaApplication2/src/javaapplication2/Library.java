/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

import java.util.ArrayList;

/**
 *
 * @author Moustafa
 */
public class Library {
    public  ArrayList<LibraryItem> items; //Array list of Items to store all items of the library
    public ArrayList<LibraryUser> users; // Array list of users to store all users of the library
    public Library(){
        items = new ArrayList<>();
        users = new ArrayList<>();
    }
    // add user func
    public void addUser(LibraryUser user){
        users.add(user);
    };
    // add item func
    public void addItem(LibraryItem item){
        items.add(item);
    }
    public void printItems(){
        for(int i = 0 ; i < items.size(); i++){
            System.out.println(items.get(i).toString());
        }
    }
    // func to handle borrow process by passing user and item
    public void borrowProcess(LibraryUser user, LibraryItem item){
        user.borrowItem(item);
    }
    // func to handle return process by passing user and item 
    public void returnProcess(LibraryUser user, LibraryItem item){
        user.returnItem(item);
    }
}
