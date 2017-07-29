/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.consultorio.registro.factory;

import com.consultorio.registro.dao.GenericDao;
import com.consultorio.registro.daoimpl.CitaDaoImpl;
import com.consultorio.registro.daoimpl.MedicoDaoImpl;
import com.consultorio.registro.daoimpl.PacienteDaoImpl;
import com.consultorio.registro.daoimpl.ProcedimientoDaoImpl;
import com.consultorio.registro.daoimpl.ReservacionDaoImpl;
import com.consultorio.registro.enums.DaoEnum;

public class ApplicationContext {
    
    public static GenericDao getDao(DaoEnum daoEnum){
        
        switch(daoEnum){
                case CITA_DAO:
                    return new CitaDaoImpl();
                
                case MEDICO_DAO:
                    return new MedicoDaoImpl();
                
                case PACIENTE_DAO:
                    return new PacienteDaoImpl();
                
                case PROCEDIMIENTO_DAO:
                    return new ProcedimientoDaoImpl();
                
                case RESERVACION_DAO:
                    return new ReservacionDaoImpl();
                
                default:
                    return null;
        }
        
        
    }

}
