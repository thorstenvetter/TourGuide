package com.example.android.stuttgarttourguide;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Menu;

import com.example.android.stuttgarttourguide.ui.activities.ActivitiesFragment;
import com.example.android.stuttgarttourguide.ui.hotels.HotelsFragment;
import com.example.android.stuttgarttourguide.ui.restaurants.RestaurantsFragment;
import com.example.android.stuttgarttourguide.ui.sights.SightsFragment;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.core.view.GravityCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout drawer;
    private AppBarConfiguration mAppBarConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        if (savedInstanceState == null) {

            navigationView.setCheckedItem(R.id.nav_sights);
        }


        AppBarConfiguration mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_sights, R.id.nav_activities, R.id.nav_restaurants, R.id.nav_hotels)
                .setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);

    }

        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            // Inflate the menu; this adds items to the action bar if it is present.
            getMenuInflater().inflate(R.menu.main, menu);
            return true;
        }

        @Override
        public boolean onSupportNavigateUp() {
            NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
            AppBarConfiguration mAppBarConfiguration = null;
            return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                    || super.onSupportNavigateUp();
        }

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.nav_sights:
                    getSupportFragmentManager().beginTransaction().replace(R.id.nav_host_fragment,
                            new SightsFragment()).commit();
                    break;
                case R.id.nav_activities:
                    getSupportFragmentManager().beginTransaction().replace(R.id.nav_host_fragment,
                            new ActivitiesFragment()).commit();
                    break;
                case R.id.nav_restaurants:
                    getSupportFragmentManager().beginTransaction().replace(R.id.nav_host_fragment,
                            new RestaurantsFragment()).commit();
                    break;

                case R.id.nav_hotels:
                    getSupportFragmentManager().beginTransaction().replace(R.id.nav_host_fragment,
                            new HotelsFragment()).commit();

                    break;

            }
            drawer.closeDrawer(GravityCompat.START);
            return true;
        }
}
