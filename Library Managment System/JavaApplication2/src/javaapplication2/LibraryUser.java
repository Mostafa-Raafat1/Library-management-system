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
public class LibraryUser {
    public String userId;
    public String name;
    public ArrayList<LibraryItem> borrowedItem; // Array list to store borrowed items for each user
    
    public LibraryUser(String userId_,String name_){
        userId = userId_;
        name = name_;
        borrowedItem = new ArrayList<>();
    }
    // func to handle borrowing items
    public void borrowItem(LibraryItem item){
        // checking if the item can be borrowed or not
        if(item instanceof BorrowableInterface){
            item.borrow();
            borrowedItem.add(item);
            System.out.println("User name : " + name+", id :  "+userId+", has borrow "+ item.getISBN());
        }
        else{
            System.out.println("This item can not be borrowed");
        }
        
    }
    // func to handle returning Items
    public void returnItem(LibraryItem item){
        // checking if the user borrowed items contains this item
       if(borrowedItem.contains(item)){
           item.returnItem();
           borrowedItem.remove(item);
           System.out.println("User name : " + name+" id :  "+userId+" has returned "+ item.getISBN());
       }
       else{
           System.out.println("The item is not in the borrowed list by user : "+userId+ "With name : "+name);
       }
    }
    // Overriding toString func to help printing opoerations
    @Override
    public String toString(){
        return "Name : "+ name+ "\n UserId : "+userId;
    }
}
