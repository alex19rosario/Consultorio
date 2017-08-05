/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.consultorio.registro.consultoriogui;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;



public class Main extends Application{
    
     public static void main(String[] args){
         launch(args);
     }

    @Override
    public void start(Stage primaryStage) throws Exception {
        
       
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/FXMLpantallaPrincipal.fxml"));
        Scene scene = new Scene(root,900,550);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Consultorio Medico");
        primaryStage.show();
    }

}
