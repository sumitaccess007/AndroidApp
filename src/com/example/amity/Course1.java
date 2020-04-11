package com.example.amity;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Course1 extends Activity {
	Button Maths, ES, C, Physics;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_course1);
		Maths = (Button) findViewById(R.id.button1);
		C = (Button) findViewById(R.id.button2);
		ES = (Button) findViewById(R.id.button3);
		Physics = (Button) findViewById(R.id.button4);

		Maths.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent a = new Intent(Course1.this, Book1.class);
				startActivity(a);
			}
		});
		ES.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent a1 = new Intent(Course1.this, Book2.class);
				startActivity(a1);
			}
		});
		C.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent a2 = new Intent(Course1.this, Book3.class);
				startActivity(a2);
			}
		});
		Physics.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent a3 = new Intent(Course1.this, Book4.class);
				startActivity(a3);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.course1, menu);
		return true;
	}

}
