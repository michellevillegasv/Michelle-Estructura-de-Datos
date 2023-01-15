/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listaenlazada1;

/**
 *
 * @author USUARIO
 */
public class Lista {
    protected Nodo beginning,end;//punteros
    //inicializar beginning y end
    public Lista(){
        beginning=null;
        end=null;
    }
    //Método para saber si la lista está vacía
    public boolean emptylist(){
        if(beginning==null){
        return true;        
    }else{
            return false;
        }
    }
    //Método para agregar al final
    public void addend(String data){
        //crear Nodo del final
        if (!emptylist()){
            end.next=new Nodo(data);
            end=end.next;
        } else {
            end=beginning=new Nodo(data);
        }

        
    }
    //método para mostrar los datos
    public void show(){
        Nodo recorrer=beginning;
        while(recorrer!=null){
            System.out.println("["+recorrer.name+"]");
            recorrer=recorrer.next;
        }
    }
    //método para buscar
    public boolean found(String data){
       Nodo temporal=beginning;//nodo que apunta a inicio
       while (temporal!=null && temporal.name!=data){
           temporal=temporal.next;
       }
       return temporal!=null;
    }
}
