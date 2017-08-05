/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.consultorio.registro.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;


public class PantallaPacienteController implements Initializable {

    @FXML private ChoiceBox sexoChoiceBox;
    @FXML private ChoiceBox  diaChoiceBox;
    @FXML private ChoiceBox mesChoiceBox;
    @FXML private ChoiceBox anioChoiceBox;
    @FXML private ChoiceBox sangreChoiceBox;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        sexoChoiceBox.getItems().addAll("Masculino","Femenino");
        
        for(int i = 0; i<32;i++){
            diaChoiceBox.getItems().add(String.valueOf(i));
        } 
        for(int i = 0; i < 13; i++){
            mesChoiceBox.getItems().add(String.valueOf(i));
        }
        for(int i = 1930; i< 2017; i++){
            anioChoiceBox.getItems().add(String.valueOf(i));
        }
        sangreChoiceBox.getItems().addAll("A+","A-","B+","B-","AB+","AB-","O+","O-");
        
    }    
    
}
