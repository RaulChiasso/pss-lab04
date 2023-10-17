package it.unibo.encapsulation;

public class SmartLamp {
    private boolean status;
    private int intensity;
    private String color;

    public SmartLamp(boolean status, int intensity, String color) {
        this.status = status;
        this.intensity = intensity;
        this.color = color;
    }
    public boolean isStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
    public int getIntensity() {
        return intensity;
    }
    public void setIntensity(int intensity) {
        this.intensity = intensity;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    
    
}
