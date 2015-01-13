package com.example.e_health;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Ediagnose extends Activity
{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ediagnose);
		
		//button ezorg
			Button zwed = (Button) findViewById(R.id.zwediagnose);
			zwed.setOnClickListener(new View.OnClickListener() 
			{
			   public void onClick(View v) 
				  {
				    Intent i = new Intent(Ediagnose.this, EdiagnoseZW.class);
				    startActivity(i);
				   }
			});	
	}
}
