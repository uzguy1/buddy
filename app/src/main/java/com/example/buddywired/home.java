package com.example.buddywired;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.view.MenuItem;
import android.view.View;

import androidx.core.view.WindowCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.buddywired.databinding.ActivityHomeBinding;

public class home extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    homefragment homeFragment = new homefragment();
    addfragment addfragment = new addfragment();
    locationfragment locationfragment = new locationfragment();
    settingsfragment settingsFragment = new settingsfragment();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        bottomNavigationView  = findViewById(R.id.bottom_navigation);


        getSupportFragmentManager().beginTransaction().replace(R.id.container,homeFragment).commit();

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected( MenuItem item) {
                int id = item.getItemId();
                if (id == R.id.home ) {

                    getSupportFragmentManager().beginTransaction().replace(R.id.container, homeFragment).commit();
                    return true;

                }

                    else if(id == R.id.Add ) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.container, addfragment).commit();
                    return true;

                }
                    else if(id == R.id.location ) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.container, locationfragment).commit();
                    return true;


                }
                    else if(id == R.id.settings){
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, settingsFragment).commit();
                        return true;

                }
                return true;
            }
        });

    }
}