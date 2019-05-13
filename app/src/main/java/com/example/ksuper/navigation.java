package com.example.ksuper;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class navigation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);

        BottomNavigationView bottomNav = findViewById(R.id.navigation);
        bottomNav.setOnNavigationItemSelectedListener(navlistener);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_id,
                new fragment_home()).commit();
    }
    private BottomNavigationView.OnNavigationItemSelectedListener navlistener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                    Fragment selectedFragment=null;
                    switch (menuItem.getItemId()){
                        case R.id.home:
                            selectedFragment= new fragment_home();
                            break;

                        case R.id.image:
                            selectedFragment= new fragment_images();
                            break;
                        case R.id.emoticon:
                            selectedFragment= new fragment_imogi();
                            break;

                    }
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_id, selectedFragment).commit();
                    return true;
                }
            };
}
