package com.example.amity;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Book2 extends Activity {
	Button book,pp,notes;
	TextView tv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_book2);
		book = (Button) findViewById(R.id.button11);
		pp = (Button) findViewById(R.id.button12);
		notes = (Button) findViewById(R.id.button13);
		tv = (TextView) findViewById(R.id.textView2);
		book.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				tv.setText("1.ELECTRICAL SCIENCE by G.B Gupta"
						+
						
						"2. ELECTRICAL SCIENCE by B.L Theraija"
						
					+	"Thank you.");
			}
		});
		pp.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent b1=new Intent (Book2.this,Paper2.class);
				startActivity(b1);
			}
		});
		notes.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent n1=new Intent (Book2.this,Notes2.class);
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