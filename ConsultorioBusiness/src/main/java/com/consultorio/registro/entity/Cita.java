/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.consultorio.registro.entity;


public class Cita {
    
    private Reservacion reservacion;
    private String fecha_visita;
    private String motivo_visita;
    private String departamento;
    private Procedimiento procedimiento;

    public Reservacion getReservacion() {
        return reservacion;
    }

    public void setReservacion(Reservacion reservacion) {
        this.reservacion = reservacion;
    }

    public String getFecha_visita() {
        return fecha_visita;
    }

    public void setFecha_visita(String fecha_visita) {
        this.fecha_visita = fecha_visita;
    }

    public String getMotivo_visita() {
        return motivo_visita;
    }

    public void setMotivo_visita(String motivo_visita) {
        this.motivo_visita = motivo_visita;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Procedimiento getProcedimiento() {
        return procedimiento;
    }

    public void setProcedimiento(Procedimiento procedimiento) {
        this.procedimiento = procedimiento;
    }
    
    
    

}
