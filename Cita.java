/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Date;

/**
 *
 * @author rafig
 */
public class Cita {
    
    private int cita;
    private String asunto;
    private int idDueño;
    private int idVeterinarios;
    private int idUsuario;
    private Date fecha;
    private Date hora;
    private Date fechaCreacion;
    private String cedula;

    public Cita() {
    }

    public Cita(int cita, String asunto, int idDueño, int idVeterinarios, int idUsuario, Date fecha, Date hora, Date fechaCreacion, String cedula) {
        this.cita = cita;
        this.asunto = asunto;
        this.idDueño = idDueño;
        this.idVeterinarios = idVeterinarios;
        this.idUsuario = idUsuario;
        this.fecha = fecha;
        this.hora = hora;
        this.fechaCreacion = fechaCreacion;
        this.cedula = cedula;
    }

    public int getCita() {
        return cita;
    }

    public void setCita(int cita) {
        this.cita = cita;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public int getIdDueño() {
        return idDueño;
    }

    public void setIdDueño(int inDueño) {
        this.idDueño = inDueño;
    }

    public int getIdVeterinarios() {
        return idVeterinarios;
    }

    public void setIdVeterinarios(int idVeterinarios) {
        this.idVeterinarios = idVeterinarios;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
}