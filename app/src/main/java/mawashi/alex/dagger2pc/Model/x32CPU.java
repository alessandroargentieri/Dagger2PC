package mawashi.alex.dagger2pc.Model;

public class x32CPU implements Processor{
    private String name;

    public x32CPU(){
        this.name="x32CPU";
    }

    @Override
    public String getName(){
        return this.name;
    }
}
