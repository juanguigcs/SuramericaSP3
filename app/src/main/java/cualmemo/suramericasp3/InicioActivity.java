package cualmemo.suramericasp3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class InicioActivity extends AppCompatActivity implements View.OnClickListener {

    Button bFace,bncuenta;
    ImageButton bLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        bFace =(Button)findViewById(R.id.bFace);
        bncuenta=(Button)findViewById(R.id.bCncuenta);
        bLogin=(ImageButton)findViewById(R.id.bLogin);

        bFace.setOnClickListener(this);
        bncuenta.setOnClickListener(this);
        bLogin.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch (id) {
            case R.id.bFace:
                Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
                break;
            case R.id.bCncuenta:
                Intent intent2=new Intent(getApplicationContext(),RegistroActivity.class);
                startActivity(intent2);
                break;
            case R.id.bLogin:
                Intent intent3=new Intent(getApplicationContext(),LoginActivity.class);
                startActivity(intent3);
                break;
        }
    }
}