/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.adapter;

/**
 *
 * @author ce.christian
 */
public class MotorComun extends Motor{
    
    public MotorComun(){
        super();
        System.out.println("Creando motor comun...");
    }
    
    @Override
    public void encender() {
        System.out.println("Encendiendo motor");
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando motor");
    }

    @Override
    public void apagar() {
        System.out.println("Apagando motor");
    }
    
}
