/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caballero.practico6;

/**
 *
 * @author Usuario
 */
public class Cliente {
    private long dni;
    private String nombre;
    private String Apellido;
    private String ciudad;
    private String direccion;

    public Cliente(long dni, String nombre, String Apellido, String ciudad, String direccion) {
        this.dni = dni;
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.ciudad = ciudad;
        this.direccion = direccion;
    }

    public long getDni() {
        return dni;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return Apellido;
    }
    public String getCiudad() {
        return ciudad;
    }
    public String getDireccion() {
        return direccion;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
}
