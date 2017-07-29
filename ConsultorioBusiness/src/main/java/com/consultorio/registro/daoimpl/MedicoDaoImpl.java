/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.consultorio.registro.daoimpl;

import com.consultorio.registro.dao.MedicoDao;
import com.consultorio.registro.entity.Medico;
import java.util.ArrayList;
import java.util.List;


public class MedicoDaoImpl implements MedicoDao{
    
    private List<Medico> medicoList = new ArrayList<>();

    @Override
    public void crear(Medico entity) {
        medicoList.add(entity);
    }

    @Override
    public void modificar(Medico entity) {
        int index = medicoList.indexOf(entity);
        medicoList.set(index, entity);
        
    }

    @Override
    public Medico findById(Long along) {
        return medicoList.get(along.intValue());
    }

    @Override
    public List<Medico> findAll() {
        return medicoList;
    }

}
