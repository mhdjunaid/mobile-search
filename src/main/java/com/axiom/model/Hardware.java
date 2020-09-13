package com.axiom.model;



public class Hardware {

    private String audioJack;
    private String gps;
    private String battery;
 
    public Hardware() {
  
    }
 
    public Hardware(String audioJack, String gps, String battery) {
         this.audioJack = audioJack;
         this.gps = gps;
         this.battery = battery;
    }
 
   
    @Override
    public String toString() {
        return "Hardware{" +
        "audioJack='" + audioJack + '\'' +
        ", gps='" + gps + '\'' +
        ", battery='" + battery + '\'' +
        '}';
    }

    public String getAudioJack() {
        return audioJack;
    }

    public void setAudioJack(String audioJack) {
        this.audioJack = audioJack;
    }

    public String getGps() {
        return gps;
    }

    public void setGps(String gps) {
        this.gps = gps;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }
 
}