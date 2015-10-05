package com.example.juddyreina.sanandresapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class bares extends AppCompatActivity {
    ListView lvBar;
    private listas[] datos=new listas[]{
            new listas(R.drawable.smartb_banzai,"", ""),
            new listas(R.drawable.smartb_beerstation,"",""),
            new listas(R.drawable.smartb_cocoloco,"","")
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bares);
        String [] var1=getResources().getStringArray(R.array.nomB);
        String [] var2=getResources().getStringArray(R.array.dirB);

        datos[0].setNombre(var1[0]);
        datos[1].setNombre(var1[1]);
        datos[2].setNombre(var1[2]);

        datos[0].setInfo(var2[0]);
        datos[1].setInfo(var2[1]);
        datos[2].setInfo(var2[2]);

        Adapter adBar=new Adapter(this,datos);
        lvBar = (ListView) findViewById(R.id.idBares);
        lvBar.setAdapter(adBar);
        lvBar.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int sel = (int) parent.getItemIdAtPosition(position);

                switch (sel) {
                    case 0:
                        Toast.makeText(bares.this, R.string.info_bar1, Toast.LENGTH_LONG).show();
                        break;
                    case 1:
                        Toast.makeText(bares.this, R.string.info_bar2, Toast.LENGTH_LONG).show();
                        break;
                    case 2:
                        Toast.makeText(bares.this, R.string.info_bar3, Toast.LENGTH_LONG).show();
                        break;
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_bares, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        return super.onOptionsItemSelected(item);
    }

    public class Adapter extends ArrayAdapter<listas>{
        public Adapter(Context context, listas[] datos){super(context, R.layout.layout_listas,datos);}

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater infl= LayoutInflater.from(getContext());
            View item=infl.inflate(R.layout.layout_listas, null);

            ImageView img= (ImageView)item.findViewById(R.id.idIMG);
            img.setImageResource(datos[position].getIdImage());

            TextView txtT=(TextView)item.findViewById(R.id.idTTL);
            txtT.setText(datos[position].getNombre());

            TextView txtI=(TextView)item.findViewById(R.id.idINF);
            txtI.setText(datos[position].getInfo());

            return item;
        }
    }


}
