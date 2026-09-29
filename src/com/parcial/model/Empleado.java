package com.parcial.model;

import com.parcial.strategy.EstrategiaComision;

public abstract class Empleado {
    protected String nombre;
    protected double ventasMes;
    protected EstrategiaComision estrategia;

    public Empleado(String nombre, double ventasMes, EstrategiaComision estrategia){
        this.nombre = nombre;
        this.ventasMes = ventasMes;
        this.estrategia = estrategia;
    }

    public void cambiarEstrategia(EstrategiaComision nuevaEstrategia){
        this.estrategia = nuevaEstrategia;
    }

    public abstract void mostrarDetalle();
}
