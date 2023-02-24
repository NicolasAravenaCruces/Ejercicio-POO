package com.objetos.javaobjetos.models;

public class Plumon extends Lapiz {

    public String tapa;
    public Boolean puntaGruesa;

    

    public Plumon() {
        super();
    }

    
    public Plumon(String material, String tinta, Double tamanio, String tapa, Boolean puntaGruesa) {
        super(material, tinta, tamanio);
        this.tapa = tapa;
        this.puntaGruesa = puntaGruesa;
    }


    public String getTapa() {
        return tapa;
    }

    public void setTapa(String tapa) {
        this.tapa = tapa;
    }

    public Boolean getPuntaGruesa() {
        return puntaGruesa;
    }

    public void setPuntaGruesa(Boolean puntaGruesa) {
        this.puntaGruesa = puntaGruesa;
    }

    public void pizarra(){
        System.out.println("Mirame loco sirvo para la pizarra");
    }

    @Override
    public String toString() {
        return super.toString()+ "Plumon [tapa=" + tapa + ", puntaGruesa=" + puntaGruesa + "]";
    }

    

    

    

    
    
}
