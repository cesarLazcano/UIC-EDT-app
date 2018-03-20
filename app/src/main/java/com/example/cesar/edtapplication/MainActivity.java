package com.example.cesar.edtapplication;

import android.content.Intent;
import android.location.LocationListener;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    // views and widgets
    Button about_b, location_b, projects_b, new_member_b;

    // life cycle methods
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        registerButtons();
        registerListeners();
    }

    // register buttons
    private void registerButtons(){
        about_b = (Button)findViewById(R.id.about_button);
        location_b = (Button)findViewById(R.id.location_button);
        projects_b = (Button)findViewById(R.id.projects_button);
        new_member_b = (Button)findViewById(R.id.new_member_button);
    }

    private void registerListeners(){
        about_b.setOnClickListener(new AboutListener());
        location_b.setOnClickListener(new LocationListener());
        projects_b.setOnClickListener(new ProjectsListener());
        new_member_b.setOnClickListener(new NewMemberListener());
    }

    // button listeners
    class AboutListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            Intent aboutIntent = new Intent(MainActivity.this, AboutActivity.class);
            startActivity(aboutIntent);
        }
    }

    class LocationListener implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            Uri geo = Uri.parse("geo:41.867704, -87.645506");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW,geo);
            startActivity(mapIntent);
        }
    }

    class ProjectsListener implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this,MRDC_Activity.class);
            startActivity(intent);
        }
    }

    class NewMemberListener implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            // launch curts activity for new user login
        }
    }

}
