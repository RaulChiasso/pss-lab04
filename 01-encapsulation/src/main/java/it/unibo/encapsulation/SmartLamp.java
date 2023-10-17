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
    /*
      If the SmartLamp is switch off, switch on before change intensity
      return 0 if value inserted is not valid
      return getIntensity() if value inserted is valid  
    */
    public int setIntensity(int intensity) {
        if(intensity == 1 || intensity==2 || intensity==3){
            if(!this.isOn) {
                changeStatus();
            }
            this.intensity = intensity;
            return getIntensity();
        }
        return 0;
    }

    public String getColor() {
        return this.color;
    }

    /*
      If the SmartLamp is switch off, switch on before change color
      return "Color not supported" if value inserted is not valid
      return getColor() if value inserted is valid
    */
    public String setColor(String color) {
        if(color == "white" || color=="red" || color=="blue" || color=="green"){
            if(!this.isOn){
                changeStatus();
            }
            this.color = color;
            return getColor();
        }
        return "Color not supported";
    }
}
