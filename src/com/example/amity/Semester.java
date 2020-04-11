package com.example.amity;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Semester extends Activity {
	Button sem1, sem2, sem3, sem4;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_semester);
		sem1 = (Button) findViewById(R.id.button1);
		sem2 = (Button) findViewById(R.id.button2);
		sem3 = (Button) findViewById(R.id.button3);
		sem4 = (Button) findViewById(R.id.button4);

		sem1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent j = new Intent(Semester.this, Course1.class);
				startActivity(j);
			}
		});
		sem2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent k = new Intent(Semester.this, Course2.class);
				startActivity(k);
			}
		});
		sem3.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent l = new Intent(Semester.this, Course3.class);
				startActivity(l);
			}
		});
		sem4.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent m = new Intent(Semester.this, Course4.class);
				startActivity(m);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.semester, menu);
		return true;
	}

}
