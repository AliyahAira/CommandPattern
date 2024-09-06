public class DimLight implements Command {
    private Light light;
    public DimLight(Light light){
        this.light = light;
    }
    @Override
    public String execute() {
        return light.dim();
    }
}