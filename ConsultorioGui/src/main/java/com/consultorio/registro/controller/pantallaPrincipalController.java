/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.consultorio.registro.controller;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class pantallaPrincipalController implements Initializable {
    
    /*@FXML Image ImagenPaciente = new Image(getClass().getResourceAsStream("/imagenes/User.png"));*/
    
    
    @FXML private void agregarPaciente(ActionEvent event ) throws IOException {
        
        
        Parent pacienteScene = FXMLLoader.load(getClass().getResource("/fxml/FXMLpantallaPaciente.fxml")); 
        Stage ventanaPaciente = new Stage();
        ventanaPaciente.setScene(new Scene(pacienteScene));
        ventanaPaciente.show();     
    }
    @FXML private void agregarDoctor(ActionEvent event) throws IOException{
        
        
        Parent doctorScene = FXMLLoader.load(getClass().getResource("/fxml/FXMLpantallaMedico.fxml"));
        Stage ventanaDoctor= new Stage();
        ventanaDoctor.setScene(new Scene(doctorScene));
        ventanaDoctor.show();
    }
    @FXML private void agregarProcedimiento(ActionEvent event) throws IOException{
        
        
        Parent procedimientoScene = FXMLLoader.load(getClass().getResource("/fxml/FXMLpantallaProcedimiento.fxml"));
        Stage ventanaProcedimiento= new Stage();
        ventanaProcedimiento.setScene(new Scene(procedimientoScene));
        ventanaProcedimiento.show();
    }
    @FXML private void agregarCita(ActionEvent event) throws IOException{
        
        
        Parent citaScene = FXMLLoader.load(getClass().getResource("/fxml/FXMLpantallaCita.fxml")); 
        Stage ventanaCita= new Stage(); 
        ventanaCita.setScene(new Scene(citaScene));
        ventanaCita.show(); 
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
    }    
    
    
    
}
