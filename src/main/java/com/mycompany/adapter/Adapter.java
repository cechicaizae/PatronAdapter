/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.adapter;

import java.util.Scanner;

/**
 *
 * @author ce.christian
 */
public class Adapter {
    private static final Scanner S = new Scanner(System.in);
    private static Motor motor;
    public static void main(String[] args) {
        int opcion;
        do{
            opcion = preguntarOpcion();
            switch(opcion){
                case 1:
                    motor = new MotorComun();
                    usarMotor();
                    break;
                case 2:
                    motor = new MotorEconomico();
                    usarMotor();
                    break;
                case 3:
                    System.out.println("Cerrando programa");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
            System.out.println("\n\n");
        }while (opcion!=4);
    }
        
        private static int preguntarOpcion() {
            System.out.println("MENU DE OPCIONES\n"
                    + "......................... \n"
                    + "1. Encender motor comun \n"
                    + "2. Encender motor economico \n"
                    + "3. Salir"
                    + "Seleccione una opcion: "
            );
            return Integer.parseInt(S.nextLine());
        }
        
    private static void usarMotor(){
        motor.encender();
        motor.acelerar();
        motor.apagar();
        
    }
    
}
