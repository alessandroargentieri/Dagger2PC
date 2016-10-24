package mawashi.alex.dagger2pc.Dagger;


import dagger.Component;
import mawashi.alex.dagger2pc.View.MainActivity;

@Component(modules = {PC1Module.class})
public interface ComputerComponent {
    public void inject(MainActivity mainActivity);
}
