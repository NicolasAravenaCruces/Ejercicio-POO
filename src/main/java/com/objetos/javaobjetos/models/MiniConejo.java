package com.objetos.javaobjetos.models;

public class MiniConejo extends Conejo {

    public Double pesoEnGr;

    public MiniConejo(String nombre, String raza, String pelaje, Boolean vacunado, Double logitudOrejas,
            Double pesoEnGr) {
        super(nombre, raza, pelaje, vacunado, logitudOrejas);
        this.pesoEnGr = pesoEnGr;
    }

    public MiniConejo() {
        super();
    }

    public Double getPesoEnGr() {
        return pesoEnGr;
    }

    public void setPesoEnGr(Double pesoEnGr) {
        this.pesoEnGr = pesoEnGr;
    }

    @Override
    public String toString() {
        return super.toString()+ "MiniConejo [pesoEnGr=" + pesoEnGr + "]";
    }

    

    

    

    
    
}
