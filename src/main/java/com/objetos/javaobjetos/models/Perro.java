package com.objetos.javaobjetos.models;

public class Perro {
    // cuando creamos el atributo, podemos determinar si el atributo es priv o public, depende de la sensibilidad del dato
    public String raza;
    public String color;
    public Double tamanio;
    public String pelaje;
    public char sexo;
    private Integer chip;

    // constructor por defecto, debe ir si o si en todas las clases    
    public Perro() {
    }
    

    //constructor de objeto completo, debe estar en todas las clases que se crean
    public Perro(String raza, String color, Double tamanio, String pelaje, char sexo, Integer chip) {
        this.raza = raza;
        this.color = color;
        this.tamanio = tamanio;
        this.pelaje = pelaje;
        this.sexo = sexo;
        this.chip = chip;
    }

    //geters y seters para obtener valores y luego modificarlos, siempre tambien se crea 

    public String getRaza() {
        return raza;
    }


    public void setRaza(String raza) {
        this.raza = raza;
    }


    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        this.color = color;
    }


    public Double getTamanio() {
        return tamanio;
    }


    public void setTamanio(Double tamanio) {
        this.tamanio = tamanio;
    }


    public String getPelaje() {
        return pelaje;
    }


    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }


    public char getSexo() {
        return sexo;
    }


    public void setSexo(char sexo) {
        this.sexo = sexo;
    }


    public Integer getChip() {
        return chip;
    }


    public void setChip(Integer chip) {
        this.chip = chip;
    }



    //funcionalidades

    public void ladrar(){
        System.out.println("WAU!!");
    }

    public String romperCosas(boolean meRetaron){
        if(meRetaron == true){
            return "Destrozo";
        }
        else{
            return "No destrozo";
        }

    }

    public String cavar(){
        return "El perro un hoyo en el patio";
    }


    @Override
    public String toString() {
        return "Perro [raza=" + raza + ", color=" + color + ", tamaño=" + tamanio + ", pelaje=" + pelaje + ", sexo="
                + sexo + ", chip=" + chip + "]";
    }

    

}
