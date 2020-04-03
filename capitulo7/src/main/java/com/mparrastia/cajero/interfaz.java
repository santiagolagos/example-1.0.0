package com.mparrastia.cajero;

import java.util.Scanner;

public class interfaz {

    public static final int RANGO_MENOR=0;
    public static final int RANGO_MAYOR=4;

    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);

        System.out.println("Ingrese su numero de identificación");
        String identificación=read.next();
        System.out.println("Ingrese su contraseña");
        String contrasena=read.next();
        CajeroAutomatico cajero=new CajeroAutomatico(identificación,contrasena);



        int opcion;

        do{

            System.out.println("Elija una de las siguientes opciones");
            System.out.println("[1] Para consultar su saldo");
            System.out.println("[2] Para ingresar saldo");
            System.out.println("[3] Para retirar saldo");
            System.out.println("[4] Para ver movimientos recientes");

            opcion=read.nextInt();

        }while (opcion<=RANGO_MENOR||opcion<=RANGO_MENOR);

            switch(opcion){

                case 1: cajero.mostrarSaldo();
                    break;

                case 2:  cajero.ingresarDinero();
                    break;

                case 3:cajero.sacarDinero();

                default:cajero.consultarUltimosMovimientos();

                    break;
            }
    }
}
