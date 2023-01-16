/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listadoble;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class ListaDoble {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista newListaDoble = new Lista();
        byte option=0;
        System.out.println("---WELCOME---");
        while(true){
            try{
            option=(byte) Integer.parseInt(JOptionPane.showInputDialog("\n1.Add data at the beggining\n2. Add data at the end\n3.Show the list\n4.Exit"));
            }
            catch(HeadlessException | NumberFormatException e){
                System.out.println("Error "+e);
            }
            if(option==1){
                String songRequest=JOptionPane.showInputDialog("Enter the song you want to add");
                newListaDoble.AddatBeggining(songRequest);
            }else if(option==2){
                String songRequest=JOptionPane.showInputDialog("Enter the song you want to add");
                newListaDoble.AddatEnd(songRequest);
            }
            else if(option==3){
                newListaDoble.showList();
            }
            else if(option==4){
                System.out.println("---THANK YOU FOR VISITING US!---");
                break;
            }
            else{
                System.out.println("Not valid option!");
            }
        }
    }
    
}
