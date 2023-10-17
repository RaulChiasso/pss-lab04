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
    public void changeStatus() {
        this.status = !this.status;
    }
    public int getIntensity() {
        return intensity;
    }
    public void setIntensity(int intensity) {
        if(intensity != 1 || intensity!=2 || intensity!=3){
            System.out.println("Valore di intensità non valido");
        }else{
            if(!this.status){
                changeStatus();
            }
            this.intensity = intensity;
        }
    }

    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        if(color != "bianco" || color!="rosso" || color!="blu" || color!="verde"){
            System.out.println("Colore non valido");
        }else{
            if(!this.status){
                changeStatus();
            }
            this.color = color;
        }
    }
}
