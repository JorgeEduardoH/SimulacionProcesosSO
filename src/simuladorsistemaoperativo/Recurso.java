/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package simuladorsistemaoperativo;

import java.util.Random;
/**
 *
 * @author windows
 */
public class Recurso 
{
    boolean libarado;
    String nombre;
    boolean ya_se_ha_tomado;

    public boolean Ya_se_ha_tomado() 
    {
        return ya_se_ha_tomado;
    }

    public Recurso() {
    }
    
    
    
    

    public void setYa_se_ha_tomado(boolean ya_se_ha_tomado) {
        this.ya_se_ha_tomado = ya_se_ha_tomado;
    }

    public Recurso(String nombre,boolean libarado, boolean ya_se_ha_tomado) {
        this.libarado = libarado;
        this.nombre = nombre;
        this.ya_se_ha_tomado = ya_se_ha_tomado;
    }
    
     
    public Recurso(String nombre,boolean libarado ) {
        this.libarado = libarado;
        this.nombre = nombre;
    }

    public boolean isLibarado() {
        return libarado;
    }

    public void setLibarado(boolean libarado) {
        this.libarado = libarado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
  
    public void liberarrecurso()
    {
        Random rnd = new Random();
        double random = rnd.nextDouble();
       // System.out.println("Número aleatorio real entre [0,1[ : "+random);
        if(Math.round(random)==1)
            this.libarado=true;
        else
            this.libarado=false;
    }        
    
    
}
