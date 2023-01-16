/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listadoble;

/**
 *
 * @author USUARIO
 */
public class Nodo {
    public String songs;
    Nodo siguiente,anterior;
    //Constructor para cuando ya hay nodos
    public Nodo(String s,Nodo sig,Nodo ant){
        songs=s;
        siguiente=sig;
        anterior=ant;
    }
    //Cuando no hay nodos aún
    public Nodo(String s){
        this(s,null,null);
    }
}
