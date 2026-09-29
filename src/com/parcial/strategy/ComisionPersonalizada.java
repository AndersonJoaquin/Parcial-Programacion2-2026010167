package com.parcial.strategy;

public class ComisionPersonalizada implements EstrategiaComision {
    private static final double PORCENTAJE_BASE = 5.0;
    private final int cantidadLetrasNombre;

    public ComisionPersonalizada(String nombre) {
        this.cantidadLetrasNombre = nombre.length();
    }

    @Override
    public double calcularComision(double montoVenta){
        double porcentajeComision = (PORCENTAJE_BASE + cantidadLetrasNombre) / 100;
        return montoVenta * porcentajeComision;
    }
}
