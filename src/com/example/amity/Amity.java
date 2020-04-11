package com.example.amity;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class Amity extends Activity {
	EditText Enroll, pass;
	ImageButton Login;
	String Enrollment, password;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_amity);
		Enroll = (EditText) findViewById(R.id.editText1);
		pass = (EditText) findViewById(R.id.editText2);
		Login = (ImageButton) findViewById(R.id.imageButton1);
		Enrollment = Enroll.getText().toString();
		password = pass.getText().toString();

		Login.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i = new Intent(Amity.this, Semester.class);
				startActivity(i);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.amity, menu);
		return true;
	}

}
