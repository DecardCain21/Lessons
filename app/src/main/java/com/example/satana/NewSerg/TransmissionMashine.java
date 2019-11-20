package com.example.satana.NewSerg;

public class TransmissionMashine {
    String privod;
    int numwheel;
    boolean airsuspension;

    public TransmissionMashine(String privod,int numwheel,boolean airsuspension){
        this.privod=privod;
        this.numwheel=numwheel;
        this.airsuspension=airsuspension;
    }

    public String getPrivod() {
        return privod;
    }

    public void setPrivod(String privod) {
        this.privod = privod;
    }

    public int getNumwheel() {
        return numwheel;
    }

    public void setNumwheel(int numwheel) {
        this.numwheel = numwheel;
    }

    public boolean isAirsuspension() {
        return airsuspension;
    }

    public void setAirsuspension(boolean airsuspension) {
        this.airsuspension = airsuspension;
    }
}
