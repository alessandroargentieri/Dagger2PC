package mawashi.alex.dagger2pc.Application;


import android.app.Application;

import mawashi.alex.dagger2pc.Dagger.ComputerComponent;
import mawashi.alex.dagger2pc.Dagger.DaggerComputerComponent;
import mawashi.alex.dagger2pc.Dagger.PC1Module;

public class WholeApplication extends Application {
    static ComputerComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        //here is where builder() is not recognized
        component = DaggerComputerComponent.builder().pC1Module(new PC1Module()).build();

    }

    public static ComputerComponent getComponent(){
        return component;
    }
}