package com.vicenttcarvalho;

public class SmartTV {
    private boolean ligada;
    private int canal;
    private int volume;

    public SmartTV(boolean ligada, int canal, int volume){
        this.ligada = ligada;
        this.canal = canal;
        this.volume = volume;
    }


    public void ligarTV(){
        if (this.ligada == true){
            System.out.println("A TV está ligada");
        } else if(setLigada(true)) {
            System.out.println("Ligando Tv...");
        }
    }

    public void desligarTV(){
        if (this.ligada == false){
            System.out.println("A TV está desligada");
        } else if(this.ligada == true) {
            setLigada(false);
            System.out.println("Desligando Tv...");
        }
    }

    public void aumentarCanal(){
        if(this.ligada == false){
            System.out.println("A TV está desligada, por favor ligar para mudar de canal.");
        }else {
            this.canal +=1;
            System.out.println("Canal Atual:"+this.canal);
        }
    }

    public void diminuirCanal(){
        if(this.ligada == false){
            System.out.println("A TV está desligada, por favor ligar para mudar de canal.");
        }else {
            this.canal -=1;
            System.out.println("Canal Atual:"+this.canal);
        }
    }

    public void estabelecerCanal(int novoCanal){
        if(this.ligada == false){
            System.out.println("A TV está desligada, por favor ligar para mudar de canal.");
        }else {
            setCanal(novoCanal);
            System.out.println("Canal Atual:"+this.canal);
        }
    }

    public void aumentarVolume(){
        if(this.ligada == false){
            System.out.println("A TV está desligada, por favor ligar para mudar de canal.");
        }else {
            this.volume +=1;
            System.out.println("Volume Atual:"+this.volume);
        }
    }

    public void diminuirVolume(){
        if(this.ligada == false){
            System.out.println("A TV está desligada, por favor ligar para mudar de canal.");
        }else {
            this.volume -=1;
            System.out.println("Valume Atual:"+this.volume);
        }
    }



    public boolean isLigada() {
        return ligada;
    }

    public boolean setLigada(boolean ligada) {
        this.ligada = ligada;
        return ligada;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
