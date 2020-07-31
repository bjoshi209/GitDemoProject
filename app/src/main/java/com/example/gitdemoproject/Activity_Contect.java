package com.example.gitdemoproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class Activity_Contect extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__contect);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.custom_menu,menu);

        return super.onCreateOptionsMenu(menu);



    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.mnuSplash:
                Intent intentSplash = new Intent(Activity_Contect.this,Activity_Splash.class);
                startActivity(intentSplash);

                Toast.makeText(this, "Splash Clicked", Toast.LENGTH_SHORT).show();
                break;

            case R.id.mnuLogin:
                Intent intentLogin = new Intent(Activity_Contect.this,Activity_Login.class);
                startActivity(intentLogin);
                Toast.makeText(this, "Login Clicked", Toast.LENGTH_SHORT).show();
                break;

            case R.id.mnuAbout:
                Intent intentAbout = new Intent(Activity_Contect.this,Activity_About.class);
                startActivity(intentAbout);
                Toast.makeText(this, "About Clicked", Toast.LENGTH_SHORT).show();

                break;

            case R.id.mnuContect:

                Toast.makeText(this, "Contect Clicked", Toast.LENGTH_SHORT).show();
                break;

        }
        return super.onOptionsItemSelected(item);
    }
}