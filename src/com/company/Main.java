package com.company;

public class Main {

    public static void main(String[] args) {
        //Primera parte
	    int funcSuma = suma(5, 10, 15);

        System.out.println("El resultado de la suma es: "+funcSuma);

        //Segunda parte
        Coche coche1 = new Coche();
        coche1.incrementarPuertas();
        System.out.println("\n"+coche1);
    }

    public static int suma(int a, int b, int c){
        int resultado;

        resultado = (a + b + c);

        return resultado;
    }
}

class Coche {
    private int cantPuertas = 0;

    public void incrementarPuertas(){
        this.cantPuertas ++;
    }

    @Override
    public String toString() {
        return "Cantidad de puertas de este coche: " +this.cantPuertas;
    }
}
