package org.example;
import java.util.ArrayList;

public class Pedido {

    private int id;
    private ArrayList<Producto> productos = new ArrayList<>();

    public void agregarProducto(Producto producto){
        productos.add(producto);
    }

    public double calcularCosto(){
        double precioTotal=0;

        for(Producto p : productos){
            precioTotal = precioTotal+p.getPrecio();
        }
        return precioTotal;
    }

}



