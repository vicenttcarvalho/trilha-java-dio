package com.vicenttcarvalho;

public class Usuario {
    public static void main(String[] args) {
        SmartTV tv1 = new SmartTV(false, 4, 30);

        tv1.ligarTV();
//        tv1.desligarTV();
        tv1.aumentarCanal();
        tv1.aumentarCanal();
        tv1.estabelecerCanal(10);
        tv1.diminuirCanal();
        tv1.aumentarVolume();
        tv1.aumentarVolume();
        tv1.aumentarVolume();
        tv1.aumentarVolume();
        tv1.aumentarVolume();
        tv1.diminuirVolume();
        tv1.desligarTV();


    }
}