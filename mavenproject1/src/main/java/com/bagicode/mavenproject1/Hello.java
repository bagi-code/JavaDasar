/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bagicode.mavenproject1;

/**
 *
 * @author Bagicode
 */
public class Hello {
    
    public static void main(String[] args){
        
        for (int a=0; a<=10; a++){
            System.out.println("ini valuenya "+a);
        }
        
        int i = 5;
        while (i<10) {
            System.out.println("ini valuenya "+5);
            i++;
        }
        
        do {
            System.out.println("ini valuenya "+5);
            i++;
        } while (i<10);
    }
    
    public void HelloSayOk() {
        System.out.println("I am Okay");
    }
    
}

class say extends Hello {
    @Override
    public void guaGenteng() {
        
    }
}
