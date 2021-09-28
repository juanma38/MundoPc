package com.gm.mundopc;

public class Teclado extends  DispositivoEntrada{
    private final int idTeclado;
    private int contadorTeclados;

    public Teclado (String tipoEntrada, String marca){
        super(tipoEntrada,marca);
        this.idTeclado= ++contadorTeclados;
    }

    @Override
    public String toString() {
        return "Teclado{" +
                "idTeclado=" + idTeclado +
                ", contadorTeclados=" + contadorTeclados +
                '}';
    }
}
