package com.objetos.javaobjetos.models;
import java.util.ArrayList;

public class Cuaderno {

    /*tamaño 
    cantidad de hojas 
    diseño
    lomo o espiral
    tipo de hoja
     * 
     */

    public String tamanio;
    public Integer cantHojas;
    public String disenio;
    public String lomo;
    public String tipoHoja;

    public Cuaderno() {
    }

    public Cuaderno(String tamanio, Integer cantHojas, String disenio, String lomo, String tipoHoja) {
        this.tamanio = tamanio;
        this.cantHojas = cantHojas;
        this.disenio = disenio;
        this.lomo = lomo;
        this.tipoHoja = tipoHoja;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public Integer getCantHojas() {
        return cantHojas;
    }

    public void setCantHojas(Integer cantHojas) {
        this.cantHojas = cantHojas;
    }

    public String getDisenio() {
        return disenio;
    }

    public void setDisenio(String disenio) {
        this.disenio = disenio;
    }

    public String getLomo() {
        return lomo;
    }

    public void setLomo(String lomo) {
        this.lomo = lomo;
    }

    public String getTipoHoja() {
        return tipoHoja;
    }

    public void setTipoHoja(String tipoHoja) {
        this.tipoHoja = tipoHoja;
    }

    /*
    -se puede rayar 
    -se puede pintar 
    -guardar información
    -hacer avioncitos
    -dibujar
     */

     public String rayarCuaderno(String raya){
        return"Rayaste el cuaderno con " +raya;
     }

     public void pintarCuaderno(Boolean pinto, String color ){
        if(pinto==true){
            System.out.println("Pintaste el cuaderno con color "+color);
        }
        else{
            System.out.println("Pinta el cuaderno, no seas fome xd");
        }
     }

     public String guardar(String info){
        ArrayList<String> cuaderno = new ArrayList<String>();
        cuaderno.add(info);
        return"Guardaste en el cuaderno la siguiente informacion : "+cuaderno;
     }

     public void avioncito(Boolean avion){
        if(avion==true){
            System.out.println( "Hiciste un avioncito de papel =)");
        }
        else{
            System.out.println("No hiciste un avioncito =(");
        }

     }

     public String dibujar(String dibujo){
        return"Dibujaste en el cuaderno "+dibujo;
     }

    
    
    
    
}
