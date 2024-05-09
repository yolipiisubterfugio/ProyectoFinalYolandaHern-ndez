

package com.croot.demo.Entity;

import java.io.Serializable;

import jakarta.annotation.Generated;

@Entity
@Table(name="alumno")
public class Alumno implements Serializable{

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    @Id
    @Generated(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 150)
    private String nombre;
    @Column(nullable = false, length = 150)
    private String apellido;
    @Column(nullable = false, length = 150)
    private String email;
    @Column(nullable = false, length = 150)
    private String dni;



    private int telefono;



    public Long getId() {
        return id;
    }



    public void setId(Long id) {
        this.id = id;
    }



    public String getNombre() {
        return nombre;
    }



    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public String getApellido() {
        return apellido;
    }



    public void setApellido(String apellido) {
        this.apellido = apellido;
    }



    public String getEmail() {
        return email;
    }



    public void setEmail(String email) {
        this.email = email;
    }



    public String getDni() {
        return dni;
    }



    public void setDni(String dni) {
        this.dni = dni;
    }



    public int getTelefono() {
        return telefono;
    }



    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

}
