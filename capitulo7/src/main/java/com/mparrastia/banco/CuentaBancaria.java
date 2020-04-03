package com.mparrastia.banco;

    public class CuentaBancaria {

        private TipoDeCuenta tipodecuenta;
        private String titular;
        protected int saldo;
        static  int saldo2;


        public CuentaBancaria(TipoDeCuenta tipoDeCuenta,String titular,int saldo){

            this.tipodecuenta=tipoDeCuenta;
            this.saldo=saldo;
            this.titular=titular;

        }
      public   CuentaBancaria()
        { this(TipoDeCuenta.AHORRO,"",0); }



       public CuentaBancaria(String titular,int saldo){

            this(TipoDeCuenta.AHORRO,titular,saldo);

        }
            public int obtenerSaldo(){


             return saldo;
            }


       public void sacarDinero(int cantidad){

            if(cantidad<0){

                return;
            }else{

                if (cantidad>saldo){

                    return;
                }
            }
            saldo-=cantidad;


        }
       public void ingresarDinero(int cantidad){

            if (cantidad < 0) {

                return;
            }

            saldo+=cantidad;

        }

      protected    void cambiarTipoCuenta(TipoDeCuenta newKind){

            newKind=TipoDeCuenta.AHORRO;
        }




    }





