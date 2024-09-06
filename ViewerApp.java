public class ViewerApp {
    public static void main(String[] args){
        // Create devices
        Tv tv = new Tv();
        Light light = new Light();
        Thermostat thermostat = new Thermostat();
        
        // Create remote control
        RemoteControl rc = new RemoteControl();
        
        // TV commands
        Command tvOn = new PowerOn(tv);
        Command tvOff = new PowerOff(tv);
        
        // Light commands
        Command lightOn = new LightOn(light);
        Command lightOff = new LightOff(light);
        Command dimLight = new DimLight(light);
        
        // Thermostat commands
        Command tempUp = new IncreaseTemperature(thermostat);
        Command tempDown = new DecreaseTemperature(thermostat);
        
        // Control TV
        rc.setCommand(tvOn);
        rc.pressButton();
        
        rc.setCommand(tvOff);
        rc.pressButton();
        
        // Control Light
        rc.setCommand(lightOn);
        rc.pressButton();
        
        rc.setCommand(dimLight);
        rc.pressButton();
        
        rc.setCommand(lightOff);
        rc.pressButton();
        
        // Control Thermostat
        rc.setCommand(tempUp);
        rc.pressButton();
        
        rc.setCommand(tempDown);
        rc.pressButton();
    }
}