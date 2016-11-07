package cualmemo.suramericasp3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegistroActivity extends AppCompatActivity implements View.OnClickListener {

    Button brAceptar,brCancelar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        brAceptar =(Button)findViewById(R.id.brAceptar);
        brCancelar=(Button)findViewById(R.id.brCancelar);

        brAceptar.setOnClickListener(this);
        brCancelar.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch (id) {
            case R.id.brAceptar:
                Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
                break;
            case R.id.brCancelar:
                Intent intent2=new Intent(getApplicationContext(),InicioActivity.class);
                startActivity(intent2);
                break;
        }
    }
}
