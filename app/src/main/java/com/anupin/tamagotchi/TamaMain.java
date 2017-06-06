package com.anupin.tamagotchi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TamaMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tama_main);

        Button inizia=(Button) findViewById(R.id.button);

        inizia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Vmappa=new Intent(getApplicationContext(),TamaSelect.class);
                startActivity(Vmappa);
            }
        });
    }

    //ciao Test, eccomi
}
