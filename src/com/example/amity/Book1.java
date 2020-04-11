package com.example.amity;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Book1 extends Activity {
	Button book,pp,notes;
	TextView tv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_book1);
		book = (Button) findViewById(R.id.button11);
		pp = (Button) findViewById(R.id.button12);
		notes = (Button) findViewById(R.id.button13);
		tv = (TextView) findViewById(R.id.textView2);
		book.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				tv.setText("1.The book by Arora (Available at the Amity University)./n"
						+ "Thank you.");
			}
		});
		pp.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent b1=new Intent (Book1.this,Paper1.class);
				startActivity(b1);
			}
		});
		notes.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent n1=new Intent (Book1.this,Notes1.class);
				startActivity(n1);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.book1, menu);
		return true;
	}

}
