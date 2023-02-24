package com.objetos.javaobjetos.models;

public class Portamina extends Lapiz {

    public Boolean boton;
    public Boolean goma;

    public Portamina() {
        super();
    }


    public Portamina(String material, String tinta, Double tamanio, Boolean boton, Boolean goma) {
        super(material, tinta, tamanio);
        this.boton = boton;
        this.goma = goma;
    }


    public Boolean getBoton() {
        return boton;
    }

    public void setBoton(Boolean boton) {
        this.boton = boton;
    }

    public Boolean getGoma() {
        return goma;
    }

    public void setGoma(Boolean goma) {
        this.goma = goma;
    }

    public void bosquejar(){
        System.out.println("Mira loco el bosquejito");
    }


    @Override
    public String toString() {
        return super.toString()+"Portamina [boton=" + boton + ", goma=" + goma + "]";
    }

    

    

    

    
    
}
