/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listaenlazada1;

/**
 *
 * @author USUARIO
 */
public class Nodo {
    public String name;
    public Nodo next; //puntero enlace
    public Nodo(String n){
       this.name=n;
       this.next=null;
    }
    public Nodo(String n, Nodo x){
        name=n;
        next=x;
    }
}
