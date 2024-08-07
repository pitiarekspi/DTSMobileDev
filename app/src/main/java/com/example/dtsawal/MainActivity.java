package com.example.dtsawal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button bproses;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bproses = (Button) findViewById(R.id.btnOK);

        bproses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bproses.setBackgroundColor(Color.RED);
                Toast.makeText(MainActivity.this, "Sekarang Tombol jadi warna merah", Toast.LENGTH_SHORT).show();
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.optionmenu,menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==R.id.menu1) {
            startActivity(new Intent(this, Menu1.class));
        } else if (item.getItemId()==R.id.menu2) {
            startActivity(new Intent(this, Menu2.class));
        } else if (item.getItemId()==R.id.menu3) {
            startActivity(new Intent(this, Menu3.class));
        }
        return true;
    }
}