package com.parcial.model;

import com.parcial.strategy.EstrategiaComision;

public class Vendedor extends Empleado{

    public Vendedor(String nombre, double ventasMes, EstrategiaComision estrategia){
        super(nombre, ventasMes, estrategia);
    }

    @Override
    public void mostrarDetalle(){
        double comision = estrategia.calcularComision(ventasMes);

        System.out.printf("\n" + "Vendedor: " + nombre + "\n");
        System.out.printf("Venta total: $" + ventasMes + "\n");
        System.out.printf("Comisión: $" + comision);
    }
}
