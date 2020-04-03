package com.mparrastia.mock;

import com.sun.javafx.binding.StringFormatter;
import com.sun.org.apache.regexp.internal.RE;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;


public class GeneradorAutomaticoDeMovimientos {

    private  static final String TRANSFERENCIA="Transferencia de ";
    private  static final String INGRESO="Ingreso de ";
    private  static final String RETIRADA="retirada de ";
    private  static final String PAGO_CON_TARGETA="Pago con targeta ";
    private  static final String NOMINA="Ingreso de nomina ";
    private  static final String PAGO_DE_RECIBO="Pago de recibos ";

    public ArrayList<String>numeroDeMovimientos(int numeroDeMovimientos,String moneda){


        ArrayList<String>movimientos=new ArrayList<>();


        for(int i=0; i< numeroDeMovimientos; i++){



            String tipoDeMivimiento=" ";
            int numeroDeMovimiento;
            numeroDeMovimiento = obtenerint(1,6);
            switch (numeroDeMovimiento){


                case 1: tipoDeMivimiento=TRANSFERENCIA;
                        break;
                case 2: tipoDeMivimiento=INGRESO;
                    break;
                case 3: tipoDeMivimiento= RETIRADA;
                    break;
                case 4: tipoDeMivimiento=PAGO_CON_TARGETA;
                    break;
                case 5: tipoDeMivimiento=NOMINA;
                    break;
                default: tipoDeMivimiento=PAGO_DE_RECIBO;
                    break;


            }

            double cantidadaleatoria=obtenercantidad(1.0,300000.0);
            String movimiento=(tipoDeMivimiento  +String.format("%.2f",cantidadaleatoria)+" "+moneda );

            movimientos.add(movimiento);
        }



        return movimientos;
    }


             private int obtenerint(int min,int max){

        return ThreadLocalRandom.current().nextInt(min, max);
      }

    private double obtenercantidad(double min, double max){

        return ThreadLocalRandom.current().nextDouble(min, max+1.0);
    }

}
