package mawashi.alex.dagger2pc.Model;

public class PC implements Computer{
    private Processor cpu;

    public PC(Processor cpu){
        this.cpu = cpu;
    }

    @Override
    public String getInfoPC(){
        return "PC con processore " + cpu.getName();
    }
}
