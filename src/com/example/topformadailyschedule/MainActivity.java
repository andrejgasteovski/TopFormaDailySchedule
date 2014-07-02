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
	    		instructor = "НЕНАД И ДУШИЦА";
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
		    case(R.id.buttonTue1030):
				instructor = "НЕНАД И ДУШИЦА";
				calories = 600;
				break;
		    case(R.id.buttonTue1800):
				instructor = "БИСЕРА";
				calories = 320;
				break;
			case(R.id.buttonTue1900):
				instructor = "АЛЕКСАНДРА";
				calories = 550;
				break;
			case(R.id.buttonTue2000):
				instructor = "НЕНАД";
				calories = 750;
				break;
			case(R.id.buttonWed1030):
				instructor = "НЕНАД И ДУШИЦА";
				calories = 400;
				break;
		    case(R.id.buttonWed1800):
				instructor = "ДУШИЦА";
				calories = 500;
				break;
			case(R.id.buttonWed1900):
				instructor = "НЕНАД";
				calories = 275;
				break;
		
			case(R.id.buttonWed2000):
				instructor = "ДУШИЦА";
				calories = 700;
				break;
			case(R.id.buttonThu1030):
				instructor = "НЕНАД И ДУШИЦА";
				calories = 700;
				break;
		    case(R.id.buttonThu1800):
				instructor = "НЕНАД";
				calories = 400;
				break;
			case(R.id.buttonThu1900):
				instructor = "НЕНАД";
				calories = 750;
				break;
			case(R.id.buttonThu2000):
				instructor = "АЛЕКСАНДРА";
				calories = 550;
				break;
			 case(R.id.buttonSun1800):
					instructor = "БИСЕРА";
					calories = 250;
					break;
				case(R.id.buttonSun1900):
					instructor = "НЕНАД";
					calories = 750;
					break;
			}
    
    		AlertDialog alertDialog = new AlertDialog.Builder(this).create();
    		alertDialog.setTitle(trainig);
    		alertDialog.setMessage(String.format("Инструктор\n%s\n\nНа овој тренинг ќе согорите %d калории.", instructor, calories));
    		alertDialog.show();
    }
    
}
