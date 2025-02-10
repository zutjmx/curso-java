package com.zutjmx.curso.java.models;

public class Producto {
    private int idProducto;
    private String nombre;
    private double precio;
    
    public Producto(){

    }

    public Producto(int idProducto){
        this.idProducto = idProducto;
    }
    
    public Producto(int idProducto, String nombre, double precio){
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String toString(){
        return "IdProducto: " + idProducto + ", Nombre: " + nombre + ", Precio: " + precio;
    }
    
    public int getIdProducto() {
        return idProducto;
    }
    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
}
