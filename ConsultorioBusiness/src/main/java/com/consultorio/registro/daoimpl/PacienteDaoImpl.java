/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.consultorio.registro.daoimpl;

import com.consultorio.registro.dao.PacienteDao;
import com.consultorio.registro.entity.Paciente;
import java.util.ArrayList;
import java.util.List;


public class PacienteDaoImpl implements PacienteDao{
    
    private List<Paciente> pacienteList = new ArrayList<>();

    @Override
    public void crear(Paciente entity) {
        pacienteList.add(entity);
    }

    @Override
    public void modificar(Paciente entity) {
        int index = pacienteList.indexOf(entity);
        pacienteList.set(index, entity);
    }

    @Override
    public Paciente findById(Long along) {
        return pacienteList.get(along.intValue());
    }

    @Override
    public List<Paciente> findAll() {
        return pacienteList;
    }

}
