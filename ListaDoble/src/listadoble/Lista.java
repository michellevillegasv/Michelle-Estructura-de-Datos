/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listadoble;

/**
 *
 * @author USUARIO
 */
public class Lista {
    private Nodo start,end;
    public Lista(){
        start=end=null;
    }
    public boolean Empty(){
        if (start==null){
            return true;
        }
        else{return false;
    }
}
    //Metodo para agregar al final
    public void AddatEnd(String s){
        if(!Empty()){
            end= new Nodo(s, null, end);
            end.anterior.siguiente=end;
        }
        else{
            end= start= new Nodo(s);
        }
    }
    //Método para agregar al inicio
    public void AddatBeggining(String s){
        if(!Empty()){
            start= new Nodo(s, start, null);
            start.siguiente.anterior=start;
        }else{
            start=end=new Nodo(s);
        }
    }
    //Método para mostrar 
    public void showList(){
        if(!Empty()){
        Nodo recorrer=start;
        while(recorrer!=null){
            System.out.print(recorrer.songs+" <-->");
            recorrer=recorrer.siguiente;
        }
        }
        else{
                start=end;
                System.out.println(start);
        }
     }
    
}
