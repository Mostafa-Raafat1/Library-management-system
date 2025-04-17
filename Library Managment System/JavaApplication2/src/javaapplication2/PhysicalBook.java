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
public class PhysicalBook extends LibraryItem implements BorrowableInterface{
    public PhysicalBook(String t , String a, String ISBN){
        super(t,a,ISBN);
        isAvailable = true;
    }
    
    @Override
    public void borrow(){
        if(isAvailable){
            borrowDateTime = LocalDateTime.now();
            System.out.println("Pyhisical book "+ title+" borrowed Successfully at "+ borrowDateTime );
            isAvailable = false;
        }
    }
    
}
