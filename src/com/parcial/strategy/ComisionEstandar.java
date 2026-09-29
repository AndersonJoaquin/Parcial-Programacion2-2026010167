package com.parcial.strategy;

public class ComisionEstandar implements EstrategiaComision {
    private static final double PORCENTAJE_COMISION = 0.5;

    @Override
    public double calcularComision(double montoVenta){
        return montoVenta * PORCENTAJE_COMISION;
    }
}
