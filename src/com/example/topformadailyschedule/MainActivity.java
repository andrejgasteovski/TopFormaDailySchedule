package com.example.topformadailyschedule;

import android.app.AlertDialog;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    public void showMessage(View view){
    	int id = view.getId();
    	Button btn = (Button)view;
    	
    	String trainig = (String) btn.getText();
    	String instructor = "";
    	int calories = 0;
    	
    	switch(id){
	    	case(R.id.buttonMon1030):
	    		instructor = "НЕНО И ДУШИЦА";
	    		calories = 275;
	    		break;
		    case(R.id.buttonMon1800):
				instructor = "АЛЕКСАНДРА";
				calories = 550;
				break;
			case(R.id.buttonMon1900):
				instructor = "ДУШИЦА";
				calories = 400;
				break;
	
			case(R.id.buttonMon2000):
				instructor = "ДУШИЦА";
				calories = 700;
				break;
			}
    
    		AlertDialog alertDialog = new AlertDialog.Builder(this).create();
    		alertDialog.setTitle(trainig);
    		alertDialog.setMessage(String.format("Инструктор\n%s\n\nНа овој тренинг ќе согорите %d калории.", instructor, calories));
    		alertDialog.show();
    }
    
}
