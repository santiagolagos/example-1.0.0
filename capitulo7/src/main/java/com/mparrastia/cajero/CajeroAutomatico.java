package com.mparrastia.cajero;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import com.mparrastia.banco.CuentaBancaria;
import com.mparrastia.banco.TipoDeCuenta;
import com.mparrastia.mock.GeneradorAutomaticoDeMovimientos;

public class CajeroAutomatico {

    CuentaBancaria cuentaBancariaActual;

    CajeroAutomatico(String identificador,String contraseña){

        int cantidadaleatoria= ThreadLocalRandom.current().nextInt(0,5000000);

        cuentaBancariaActual=new CuentaBancaria(TipoDeCuenta.AHORRO,"Arley santiago cubillos lagos",cantidadaleatoria);

    }
    void mostrarSaldo(){
        System.out.println(" Su saldo es "+cuentaBancariaActual.obtenerSaldo());


    }

    void ingresarDinero() {
        Scanner read=new Scanner(System.in);
        System.out.println("Ingrese cuanto dinero desea ingresar");

        int ingresoDinero=read.nextInt();
        cuentaBancariaActual.ingresarDinero(ingresoDinero);

    }
    void sacarDinero(){
        Scanner read=new Scanner(System.in);
        System.out.println("escriba cuanto dinero desea retirar de su cuenta");
        int retiro=read.nextInt();
        cuentaBancariaActual.sacarDinero(retiro);
    }

    void consultarUltimosMovimientos(){

        GeneradorAutomaticoDeMovimientos generadorAutomaticoDeMovimientos=new GeneradorAutomaticoDeMovimientos();

        Scanner read=new Scanner(System.in);
        System.out.println("cuantos movimientos desea consultar");
        int numMovimientos=read.nextInt();

        ArrayList<String> movimientos =generadorAutomaticoDeMovimientos.numeroDeMovimientos(numMovimientos,"euros");

            mostrarMovimientos(movimientos);

    }

    void mostrarMovimientos(ArrayList<String>monimientos){

        for(String a:monimientos){

            System.out.println(a);
        }

    }


    void finPrograma(){

        System.out.println("Gracias por utilizar nuestros servicios");
    }

}
