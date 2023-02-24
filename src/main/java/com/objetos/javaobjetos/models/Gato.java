package com.objetos.javaobjetos.models;

// indico que gato hereda los atributos y metodos de animal
public class Gato extends Animal {

    public Integer cantBigotes;

    // el constructor por defecto de una clase hija debe tener la funcion super
    // para asi obtener los datos 
    public Gato(){
        super();
    }

    public Gato(String nombre, String raza, String pelaje, Boolean vacunado, Integer cantBigotes) {
        super(nombre, raza, pelaje, vacunado);
        this.cantBigotes = cantBigotes;
    }

    public Integer getCantBigotes() {
        return cantBigotes;
    }

    public void setCantBigotes(Integer cantBigotes) {
        this.cantBigotes = cantBigotes;
    }

    public void maullar(){
        System.out.println("Miau Miau bro!");
    }

    @Override
    public String toString() {
        // concatenamos lo que trae animal + lo que tiene gato
        return super.toString() + "Gato [cantBigotes=" + cantBigotes + "]";
    }

    

    



    




}
