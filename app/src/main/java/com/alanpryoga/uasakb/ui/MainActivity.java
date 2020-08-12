/**
 * NIM      : 10117210
 * Nama     : Ade Syahlan Prayoga
 * Kelas    : IF-7
 */
package com.alanpryoga.uasakb.ui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.alanpryoga.uasakb.R;
import com.alanpryoga.uasakb.ui.about.AboutFragment;
import com.alanpryoga.uasakb.ui.home.HomeFragment;
import com.alanpryoga.uasakb.ui.map.MapFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fragment homeFragment = new HomeFragment();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.frame_layout, homeFragment)
                .commit();

        bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragment = null;

                switch (item.getItemId()) {
                    case R.id.home_menu:
                        fragment = new HomeFragment();
                        break;
                    case R.id.map_menu:
                        fragment = new MapFragment();
                        break;
                    case R.id.about_menu:
                        fragment = new AboutFragment();
                        break;
                    default:
                        fragment = new HomeFragment();
                        break;
                }

                return loadFragment(fragment);
            }
        });
    }

    private boolean loadFragment(Fragment fragment) {
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.frame_layout, fragment)
                    .commit();
            return true;
        }

        return false;
    }
}