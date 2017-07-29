/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.consultorio.registro.daoimpl;

import com.consultorio.registro.dao.ProcedimientoDao;
import com.consultorio.registro.entity.Medico;
import com.consultorio.registro.entity.Procedimiento;
import java.util.ArrayList;
import java.util.List;


public class ProcedimientoDaoImpl implements ProcedimientoDao{
    
    private List<Procedimiento> procedimientoList = new ArrayList<>();

    @Override
    public void crear(Procedimiento entity) {
        procedimientoList.add(entity);   
    }

    @Override
    public void modificar(Procedimiento entity) {
        int index = procedimientoList.indexOf(entity);
        procedimientoList.set(index, entity);
    }

    @Override
    public Procedimiento findById(Long along) {
        return procedimientoList.get(along.intValue());
    }

    @Override
    public List<Procedimiento> findAll() {
        return procedimientoList;
    }

}
