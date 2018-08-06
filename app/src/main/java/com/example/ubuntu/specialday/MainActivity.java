package com.example.ubuntu.specialday;

import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        NavigationView navigationView = findViewById(R.id.nv);
        FrameLayout frameLayout = findViewById(R.id.fl);
        drawerLayout = findViewById(R.id.dl);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,
                R.string.open,R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener(){
           public boolean onNavigationItemSelected(MenuItem item){
               switch(item.getItemId()){
                   case R.id.item0:
                       getSupportFragmentManager().beginTransaction().replace(R.id.fl, new HomeFragment()).commit();
                       break;
                   case R.id.item1:
                       getSupportFragmentManager().beginTransaction().replace(R.id.fl, new HomeFragment()).commit();
                       break;
                   case R.id.item2:
                       getSupportFragmentManager().beginTransaction().replace(R.id.fl, new HomeFragment()).commit();
                       break;
                   case R.id.item3:
                       getSupportFragmentManager().beginTransaction().replace(R.id.fl, new HomeFragment()).commit();
                       break;
                   case R.id.item4:
                       getSupportFragmentManager().beginTransaction().replace(R.id.fl, new HomeFragment()).commit();
                       break;
                   case R.id.item5:
                       getSupportFragmentManager().beginTransaction().replace(R.id.fl, new HomeFragment()).commit();
                       break;
                   case R.id.item6:
                       getSupportFragmentManager().beginTransaction().replace(R.id.fl, new HomeFragment()).commit();
                       break;
                   default:
                       Toast.makeText(getApplicationContext(),"This is default page",Toast.LENGTH_LONG).show();
               }
               drawerLayout.closeDrawer(GravityCompat.START);
               return  true;
           }
        });

        if(savedInstanceState == null){
            navigationView.setCheckedItem(R.id.item0);
            getSupportFragmentManager().beginTransaction().replace(R.id.fl, new HomeFragment()).commit();

        }

    }
    public void onBackPressed(){
        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }else{
            super.onBackPressed();
        }
    }
}
