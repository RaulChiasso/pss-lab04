package it.unibo.encapsulation;

public class SmartLamp {
    private boolean isOn;
    private int intensity;
    private String color;

    public SmartLamp(boolean isOn, int intensity, String color) {
        this.isOn = isOn;
        this.intensity = intensity;
        this.color = color;
    }

    public boolean isOn() {
        return this.isOn;
    }

    public void changeStatus() {
        this.isOn = !this.isOn;
    }

    public int getIntensity() {
        return this.intensity;
    }

    //Se la lampadina è spenta viene accesa quando si setta l'intensità
    public void setIntensity(int intensity) {
        if(intensity == 1 && intensity==2 && intensity==3){
            if(!this.isOn) {
                changeStatus();
            }
            this.intensity = intensity;
        }
    }

    public String getColor() {
        return this.color;
    }

    //Se la lampadina è spenta viene accesa quando si setta il colore
    public void setColor(String color) {
        if(color == "bianco" && color=="rosso" && color=="blu" && color=="verde"){
            if(!this.isOn){
                changeStatus();
            }
            this.color = color;
        }
    }
}
