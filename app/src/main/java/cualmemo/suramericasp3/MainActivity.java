package cualmemo.suramericasp3;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    String[] nombrerutas = new String[]{"Medellín-Machu Picchu", "mapa 2", "mapa 3", "mapa 4"};
    ListView Lst, listz;

    private String[] opciones = new String[]{"Principal", "Rutas", "Mis rutas", "Perfil", "firebase", "Cerrar sesión"};

    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle drawerToggle;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    //private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, nombrerutas);
        Lst = (ListView) findViewById(R.id.lst);
        Lst.setAdapter(adapter);
        Lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent2 = new Intent(getApplicationContext(), RutasActivity.class);
                startActivity(intent2);
            }
        });

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setHomeAsUpIndicator(R.drawable.ic_menu_white_24dp);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        drawerLayout = (DrawerLayout) findViewById(R.id.contenedor);
        listz = (ListView) findViewById(R.id.mizq);
        listz.setAdapter(new ArrayAdapter<String>(getSupportActionBar().getThemedContext(),
                android.R.layout.simple_list_item_1, opciones));
        listz.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Fragment fragment = null;
                switch (i) {
                    case (0):
                        //   Toast.makeText(getApplicationContext(),"Opcion "+String.valueOf(i), Toast.LENGTH_SHORT).show();
                        break;
                    case (1):
                        Intent intent = new Intent(getApplicationContext(), RutasActivity.class);
                        startActivity(intent);
                        // finish();
                        // Toast.makeText(getApplicationContext(),"Opcion "+String.valueOf(i), Toast.LENGTH_SHORT).show();
                        break;
                    case (2):
                        Intent intent2 = new Intent(getApplicationContext(), MisRutasActivity.class);

                        startActivity(intent2);
                        // finish();
                        // Toast.makeText(getApplicationContext(),"Opcion "+String.valueOf(i), Toast.LENGTH_SHORT).show();
                        break;
                    case (3):
                        Intent intent3 = new Intent(getApplicationContext(), PerfilActivity.class);
                        startActivity(intent3);
                        //editor.clear();
                        //editor.remove("v_ingreso");
                        //editor.commit();
                        //  Toast.makeText(getApplicationContext(),"Opcion cerrar  "+String.valueOf(i), Toast.LENGTH_SHORT).show();
                        break;
                    case (4):
                        Intent intent5 = new Intent(getApplicationContext(), TestFireActivity.class);
                        startActivity(intent5);
                        finish();
                        break;
                    case (5):
                        Intent intent4 = new Intent(getApplicationContext(), MapsActivity.class);
                        startActivity(intent4);
                        //finish();
                        break;
                }

                listz.setItemChecked(i, true);
                drawerLayout.closeDrawer(listz);
            }
        });
        drawerToggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.abierto, R.string.cerrado);
        drawerLayout.setDrawerListener(drawerToggle);
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        // client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                drawerLayout.openDrawer(Gravity.LEFT);
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}