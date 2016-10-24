package mawashi.alex.dagger2pc.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import javax.inject.Inject;

import mawashi.alex.dagger2pc.Application.WholeApplication;
import mawashi.alex.dagger2pc.Model.Computer;
import mawashi.alex.dagger2pc.Model.PC;
import mawashi.alex.dagger2pc.R;

public class MainActivity extends AppCompatActivity {

    @Inject Computer pc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WholeApplication.getComponent().inject(this);

        Toast.makeText(this, pc.getInfoPC(),Toast.LENGTH_LONG).show();


    }
}
