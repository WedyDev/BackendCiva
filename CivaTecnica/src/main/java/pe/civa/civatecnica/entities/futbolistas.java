package pe.civa.civatecnica.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="futbolistas")
public class futbolistas {




    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "nombres",length = 60, nullable = false)
    private String Nombres;
    @Column(name = "apellidos",length = 60, nullable = false)
    private String Apellidos;
    @Column(name = "fecha")
    private LocalDate Fecha;
    @Column(name = "caracteristicas",length = 60, nullable = false)
    private String Caracteristicas;
    @Column(name = "posicion",length = 60, nullable = false)
    private String Posicion;


    public futbolistas()
    {

    }
    public futbolistas(int id, String nombres, String apellidos, LocalDate fecha, String caracteristicas, String posicion) {
        this.id = id;
        Nombres = nombres;
        Apellidos = apellidos;
        Fecha = fecha;
        Caracteristicas = caracteristicas;
        Posicion = posicion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String nombres) {
        Nombres = nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public LocalDate getFecha() {
        return Fecha;
    }

    public void setFecha(LocalDate fecha) {
        Fecha = fecha;
    }

    public String getCaracteristicas() {
        return Caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        Caracteristicas = caracteristicas;
    }

    public String getPosicion() {
        return Posicion;
    }

    public void setPosicion(String posicion) {
        Posicion = posicion;
    }
}
