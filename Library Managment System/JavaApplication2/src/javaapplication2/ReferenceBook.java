/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author Moustafa
 */
public class ReferenceBook extends LibraryItem{
    public ReferenceBook(String t, String a, String ISBN){
        super(t,a,ISBN);
        borrowDateTime = null;
        isAvailable = false; // As its not available to borrow
    }
    @Override
    public void borrow(){
        System.out.println("ReferenceBook "+title+", can not be borrowed");
        isAvailable = false; // As its not available to borrow
    }
    
}
