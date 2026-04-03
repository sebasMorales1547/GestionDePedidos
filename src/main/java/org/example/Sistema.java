package org.example;

import java.util.ArrayList;

public class Sistema {

    ArrayList<Producto> productos = new ArrayList<>();
    ArrayList<Pedido> pedidos = new ArrayList<>();

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public Producto buscarProductos(String nombre) {

        for (Producto p : productos) {
            if (nombre.equalsIgnoreCase(p.getNombre())) {
                return p;
            }
        }
        return null;
    }
}
