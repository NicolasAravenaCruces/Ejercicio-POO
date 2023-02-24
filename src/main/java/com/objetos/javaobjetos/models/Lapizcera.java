package com.objetos.javaobjetos.models;

public class Lapizcera extends Lapiz {

    public String envoltorio;
    public Boolean derretir;

    public Lapizcera() {
        super();
    }

    public Lapizcera(String material, String tinta, Double tamanio, String envoltorio, Boolean derretir) {
        super(material, tinta, tamanio);
        this.envoltorio = envoltorio;
        this.derretir = derretir;
    }

    public String getEnvoltorio() {
        return envoltorio;
    }

    public void setEnvoltorio(String envoltorio) {
        this.envoltorio = envoltorio;
    }

    public Boolean getDerretir() {
        return derretir;
    }

    public void setDerretir(Boolean derretir) {
        this.derretir = derretir;
    }

    public void pintar(){
        System.out.println("Mirame loco como pinto xd");
     
    }

    @Override
    public String toString() {
        return super.toString() + "Lapizcera [envoltorio=" + envoltorio + ", derretir=" + derretir + "]";
    }

    

    

    

    


    
}
