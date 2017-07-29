/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.consultorio.registro.daoimpl;

import com.consultorio.registro.dao.CitaDao;
import com.consultorio.registro.entity.Cita;
import java.util.ArrayList;
import java.util.List;


public class CitaDaoImpl implements CitaDao{
    
    private List<Cita> citaList = new ArrayList<>();
    

    @Override
    public void crear(Cita entity) {
        citaList.add(entity);
    }

    @Override
    public void modificar(Cita entity) {
        int index = citaList.indexOf(entity);
        citaList.set(index, entity);
    }

    @Override
    public Cita findById(Long along) {
        return citaList.get(along.intValue());
    }

    @Override
    public List<Cita> findAll() {
        return citaList; 
    }

}
