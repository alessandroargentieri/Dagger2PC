package mawashi.alex.dagger2pc.Model;

public class x64CPU implements Processor{
    private String name;

    public x64CPU(){
        this.name="x64CPU";
    }

    @Override
    public String getName(){
        return this.name;
    }
}