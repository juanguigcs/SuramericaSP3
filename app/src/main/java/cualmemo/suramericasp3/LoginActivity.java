package cualmemo.suramericasp3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    Button blAceptar,blCancelar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_login);
        blAceptar =(Button)findViewById(R.id.blAceptar);
        blCancelar=(Button)findViewById(R.id.blCancelar);

        blAceptar.setOnClickListener(this);
        blCancelar.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch (id) {
            case R.id.blAceptar:
                Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
                break;
            case R.id.blCancelar:
                Intent intent2=new Intent(getApplicationContext(),InicioActivity.class);
                startActivity(intent2);
                finish();
                break;
        }
    }
}