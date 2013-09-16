package com.example.tophops;

import java.util.List;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.parse.FindCallback;
import com.parse.Parse;
import com.parse.ParseAnalytics;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.activity_main);
        
        Parse.initialize(this, "msCYZdfSAiqclFLPMl396gU12T6l4EVs51jMOFgO", "0AsCvNApKur5m26M2Ji6RPueqOxrglgEfH33xQ89");
        Button findBeers = (Button) findViewById(R.id.findBeers);
        findBeers.setOnClickListener(findBeersListener);
    }
    
    View.OnClickListener findBeersListener = new View.OnClickListener() {
        public void onClick(View v) {
        	Intent searchBeers = new Intent(getApplicationContext(), BeerSearch.class);
        	startActivity(searchBeers);
        }
      };

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
