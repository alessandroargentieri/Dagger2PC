package mawashi.alex.dagger2pc.Dagger;


import dagger.Module;
import dagger.Provides;
import mawashi.alex.dagger2pc.Model.Computer;
import mawashi.alex.dagger2pc.Model.PC;
import mawashi.alex.dagger2pc.Model.Processor;
import mawashi.alex.dagger2pc.Model.x32CPU;

@Module
public class PC1Module {

    @Provides
    public Processor provideProcessor(){
        return new x32CPU();
    }

    @Provides
    public Computer provideComputer(Processor cpu){
        return new PC(cpu);
    }
}