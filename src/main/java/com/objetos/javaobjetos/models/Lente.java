package com.objetos.javaobjetos.models;

public class Lente {
    /*
    -tipo de marco
    -color del marco
    -tipo de cristales
    -graduación de cristales
    -Material
     */

    public String tipoMarco;
    public String colorMarco;
    public String tipoCristal;
    public String material;
    private Double graduacionCristal;



    public Lente() {
    }


    public Lente(String tipoMarco, String colorMarco, String tipoCristal, String material, Double graduacionCristal) {
        this.tipoMarco = tipoMarco;
        this.colorMarco = colorMarco;
        this.tipoCristal = tipoCristal;
        this.material = material;
        this.graduacionCristal = graduacionCristal;
    }


    public String getTipoMarco() {
        return tipoMarco;
    }


    public void setTipoMarco(String tipoMarco) {
        this.tipoMarco = tipoMarco;
    }


    public String getColorMarco() {
        return colorMarco;
    }


    public void setColorMarco(String colorMarco) {
        this.colorMarco = colorMarco;
    }


    public String getTipoCristal() {
        return tipoCristal;
    }


    public void setTipoCristal(String tipoCristal) {
        this.tipoCristal = tipoCristal;
    }


    public String getMaterial() {
        return material;
    }


    public void setMaterial(String material) {
        this.material = material;
    }


    public Double getGraduacionCristal() {
        return graduacionCristal;
    }


    public void setGraduacionCristal(Double graduacionCristal) {
        this.graduacionCristal = graduacionCristal;
    }

    /*
    -verDeLejos
    -verDeCerca
    -proteccion solar
    -proteccion ocular
    -correccion estrabismo/daltonismo/
     */
    // miopia no puede ver de lejos
    // hipermetropía no puede ver de cerca
    // estrabismo Trastorno en el que los ojos no miran exactamente en la misma dirección al mismo tiempo.
    // daltonismo rara afección en la cual una persona no puede ver ningún color, solamente sombras de gris u colores distintos o solo 1 color

    public void verDeLejos(Boolean miopia){
        if(miopia==true){
            System.out.println("Tienes miopia, por ende tus lentes sirven para ver de lejos");
        }
        else{
            System.out.println("Tus lentes no sirven para ver de lejos");
        }
    }

    public void verDeCerca(Boolean hipermetropia){
        if(hipermetropia==true){
            System.out.println("Tienes hipermetropia, por ende tus lentes sirven para ver de cerca");
        }
        else{
            System.out.println("Tus lentes no sirven para ver de cerca");
        }
    }

    public void proteccionSolar(Boolean solar){
        if(solar==true){
            System.out.println("Tus lentes tienen proteccion solar! ");
        }
        else{
            System.out.println("Tus lentes no tienen proteccion solar!");
        }
    }

    public void proteccionOcular(Boolean ocular){
        if(ocular==true){
            System.out.println("Tus lentes tienen proteccion ocular! ");
        }
        else{
            System.out.println("Tus lentes no tienen proteccion ocular!");
        }
    }

    public void correccion(Boolean estribismo, Boolean daltonismo){
        if(estribismo==true){
            System.out.println("Tus lentes tienen proteccion ocular! ");
        }
        else{
            System.out.println("Tus lentes no tienen proteccion ocular!");
        }
    }








    

    



     

}
