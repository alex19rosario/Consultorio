/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.consultorio.registro.entity;

public class Reservacion {
    
    
    private boolean Confirmacion_presencial = false;
    private Long  numero_reservacion;

    

    public boolean isConfirmacion_presencial() {
        return Confirmacion_presencial;
    }

    public void setConfirmacion_presencial(boolean Confirmacion_presencial) {
        this.Confirmacion_presencial = Confirmacion_presencial;
    }

    public Long getNumero_reservacion() {
        return numero_reservacion;
    }

    public void setNumero_reservacion(Long numero_reservacion) {
        this.numero_reservacion = numero_reservacion;
    }
    

}
