/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;
import java.time.LocalDateTime;
/**
 *
 * @author Moustafa
 */
public abstract class LibraryItem {
    protected String title;
    protected String author;
    protected String ISBN;
    protected boolean isAvailable ;
    protected LocalDateTime borrowDateTime;
    
    public LibraryItem(String title_, String author_ , String ISBN_){
        title = title_;
        author = author_;
        ISBN = ISBN_;
    }
    // func to return Items
    public void returnItem(){
        isAvailable = true;
        borrowDateTime = null;
        System.out.println("Item "+title+" has been returned");
    }
    // abstract func for borrowing
    public abstract void borrow();
    // getters
    public String getISBN(){
        return ISBN;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public boolean getisAvailable(){
        return isAvailable;
    }
    public LocalDateTime getBorrowDateTime(){
        return borrowDateTime;
    }
    // overriding toString() method to retrun Item details
    @Override
    public String toString(){
        return "title : "+title+"\n author : "+author+"\n ISBN : "+ISBN;
    }
    
    
}
