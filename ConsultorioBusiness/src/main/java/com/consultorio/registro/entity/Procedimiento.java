/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.consultorio.registro.entity;

public class Procedimiento {
    
    private Medico medico;
    private String prueba_realizada;
    private String diagnostico;
    private String tratamiento;

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public String getPrueba_realizada() {
        return prueba_realizada;
    }

    public void setPrueba_realizada(String prueba_realizada) {
        this.prueba_realizada = prueba_realizada;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

}
