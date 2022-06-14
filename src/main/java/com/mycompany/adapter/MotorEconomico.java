/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.adapter;

/**
 *
 * @author ce.christian
 */
public class MotorEconomico extends Motor{
    public MotorEconomico(){
        super();
        System.out.println("Creando motor economico...");
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
