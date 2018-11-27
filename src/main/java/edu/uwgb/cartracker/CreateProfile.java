package edu.uwgb.cartracker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class CreateProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_profile);
    }

    public void onSubmit(View view) {
        //This is how you create a new Intent to push activites onto the stack
        Intent intent = new Intent(this,VehicleMenu.class);
        startActivity(intent);
    }
}
