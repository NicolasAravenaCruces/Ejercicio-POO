package com.objetos.javaobjetos.models;

public class Macetero {

    public Double tamanio;
    public String color;
    public String material;
    public int hoyitos;
    public String forma;

    public Macetero() {
    }

    public Macetero(Double tamanio, String color, String material, int hoyitos, String forma) {
        this.tamanio = tamanio;
        this.color = color;
        this.material = material;
        this.hoyitos = hoyitos;
        this.forma = forma;
    }

    public Double getTamanio() {
        return tamanio;
    }

    public void setTamanio(Double tamanio) {
        this.tamanio = tamanio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getHoyitos() {
        return hoyitos;
    }

    public void setHoyitos(int hoyitos) {
        this.hoyitos = hoyitos;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }


    /*-guardar tierra
    -plantar plantita(?)
    -contener agua
    -poner adornos
    -decorar  
     * 
     */

     public void tierra(){
        System.out.println("El macetero tiene tierra");
     }

     public String planta(Boolean planta){
        if(planta == true){
            return"El macetero tiene una plantita";
        }
        else{
            return"El macetero no tiene una plantita, planta una tu!";

        }

     }
     public String agua(Boolean macetaAgua){
        if(macetaAgua==true){
            return"El macetero tiene awita";
        }
        else{
            return"El macetero no tiene awita :C";
        }
     }

     public void adorno(String adorno){
        System.out.println("Al macetero le pusiste: "+ adorno );
     }

     public void decorar(String lugar){
         System.out.println("Tu macetero esta docorando "+lugar+" mira que lindo se ve xdxd");       
     }



    

    

    


}
