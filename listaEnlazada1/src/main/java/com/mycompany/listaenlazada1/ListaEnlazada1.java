/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.listaenlazada1;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class ListaEnlazada1 {

    public static void main(String[] args) {
        System.out.println("---WELCOME---");
        Lista list1=new Lista();
        while(true){
            byte option=0;
            try{
            option=Byte.parseByte(JOptionPane.showInputDialog("----MENU----"
                    + "\n1.Add a name at the end"
                    + "\n2.See all the lit's data"
                    + "\n3.Exit"));
            if(option==1){
               try{
               String name=JOptionPane.showInputDialog("Enter the name");
               list1.addend(name);
            }
               catch(Exception s){
                   System.out.println("Error "+s.getMessage());
               }
            }
            else if(option==2){
                list1.show();
            }
            else if(option==3){
                System.out.println("---GOODBYE!---");
                break;
            }
            else{
                System.out.println("Not valid option");
            }
        }
        catch(HeadlessException | NumberFormatException e){
                System.out.println("Error "+e.getMessage());
            }
        }
    }
}
