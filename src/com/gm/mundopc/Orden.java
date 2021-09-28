package com.gm.mundopc;

public class Orden {
    private int idOrden;
    private Computadora computadoras[];
    private static int contadorOrdenes;
    private int contadorComputadora;
    private static final int MAX_PRODUCTOS = 5;

    public Orden (){
        this.idOrden=++contadorOrdenes;
        computadoras = new  Computadora[MAX_PRODUCTOS];

    }
    public  void agregarComputadora( Computadora computadora ){
        if (this.contadorComputadora < MAX_PRODUCTOS){
            this.computadoras[this.contadorComputadora++] = computadora;
        }
        else {
            System.out.println("se ha superado el maximo");
        }

    }
    public void mostrarOrden () {
        System.out.println("Orden #:" + this.idOrden);
        System.out.println("Computadoras de la orden #" + this.idOrden + ":");

        for (int i = 0; i < this.contadorComputadora; ++i) {
            System.out.println(this.computadoras[i]);

        }
    }

}
