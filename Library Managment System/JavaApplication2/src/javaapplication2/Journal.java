/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author Moustafa
 */
public class Journal extends LibraryItem {
    public Journal(String t, String a, String ISBN){
        super(t,a,ISBN);
        borrowDateTime = null;
        isAvailable = false;
    }
    @Override
    public void borrow(){
        System.out.println("Journal "+title+", can not be borrowed");
    }
}
