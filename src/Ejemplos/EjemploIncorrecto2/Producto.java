package Ejemplos.EjemploIncorrecto2;

public class Producto {
    private double precio;
    public Producto(double precio) {
        this.precio = precio;
    }
    public void actualizarPrecio(double nuevoPrecio) {
        // No se realiza ninguna validación aquí
        precio = nuevoPrecio;
    }

}