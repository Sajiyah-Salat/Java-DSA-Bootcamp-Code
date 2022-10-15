package com.kunal.interfaces;

public class NiceCar {
    private Engine engine;
private Media player = new CDPlayer();
    public NiceCar(Engine engine) {
        this.engine = engine;
    }

    public NiceCar(){
        engine = new PowerEngine();
    }
    public void start(){
        engine.start();
    }
    public void stop(){
        engine.start();
    }
    public void startMusic(){
        player.start();
    }
    public void stopMusic(){
        player.start();
    }
    public void upgradeEngine(){
        this.engine =  new ElectricEngine();
    }
}
