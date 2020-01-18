package com.example.testapp;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import org.json.JSONException;
import org.json.JSONObject;

public class PitPageActivity extends AppCompatActivity {

    private JSONObject JSONDerulo;

    public PitPageActivity(){

        //
    }


    public void saveJson(){
        try
        {
            JSONDerulo = new JSONObject();
            JSONDerulo.put("orientation", findViewById(R.id.orientationIn));
            JSONDerulo.put("numberOfWheels", findViewById(R.id.numberOfWheelsIn));
            JSONDerulo.put("typeOfWheels", findViewById(R.id.typeOfWheelIn));
            JSONDerulo.put("driveTrain", findViewById(R.id.driveTrainIn));

        }
        catch(JSONException exc)
        {
            Log.e("PitPage", "Json failed!");
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pit_page);
    }
}
