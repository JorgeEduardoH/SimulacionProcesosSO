/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simuladorsistemaoperativo;

import java.util.ArrayList;

/**
 *
 * @author windows
 */
public class Proceso 
{
   int id,tamano ,paginas,paginasdescontadas,prioridad;
   String nombre ;
   String estado;
   String alias;
   String color;  
   
   
   
   ArrayList<Recurso> listaRecursos ;

    public Proceso(int id, int tamano, String nombre, String estado, ArrayList<Recurso> listaRecursos)
    {
        this.id = id;
        this.tamano = tamano;
        this.nombre = nombre;
        this.estado = estado;
        this.listaRecursos = listaRecursos;
    }
     
    
    public Proceso(int id, int tamano, String nombre, String estado, ArrayList<Recurso> listaRecursos, String alias, String color,int paginas,int prioridad) {
        this.id = id;
        this.tamano = tamano;
        this.paginas = paginas;
        this.prioridad = prioridad;
        this.nombre = nombre;
        this.estado = estado;
        this.alias = alias;
        this.color = color;
        this.listaRecursos = listaRecursos;
        this.paginasdescontadas=paginas;
    }
    

    
     public int getPaginas() {
        return paginas;
    }
    
     public void calcularpaginas(int marco)
     {
       this.paginas=this.tamano/marco;
     }        

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
    
    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public int getPaginasdescontadas() {
        return paginasdescontadas;
    }

    public void setPaginasdescontadas(int paginasdescontadas) {
        this.paginasdescontadas = paginasdescontadas;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
    public Proceso()
    {
        System.out.println("se creo un nuevo proceso...");
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public ArrayList<Recurso> getListaRecursos() {
        return listaRecursos;
    }

    public void setListaRecursos(ArrayList<Recurso> listaRecursos) {
        this.listaRecursos = listaRecursos;
    }
   
   
   
   
   
    
}
