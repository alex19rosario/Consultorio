/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.consultorio.registro.daoimpl;

import com.consultorio.registro.dao.ReservacionDao;
import com.consultorio.registro.entity.Reservacion;
import java.util.ArrayList;
import java.util.List;


public class ReservacionDaoImpl implements ReservacionDao {
    
    private List<Reservacion> reservacionList = new ArrayList<>();

    @Override
    public void crear(Reservacion entity) {
        reservacionList.add(entity);
    }

    @Override
    public void modificar(Reservacion entity) {
        int index = reservacionList.indexOf(entity);
        reservacionList.set(index, entity);
    }

    @Override
    public Reservacion findById(Long along) {
        return reservacionList.get(along.intValue());
    }

    @Override
    public List<Reservacion> findAll() {
        return reservacionList;
    }

}
