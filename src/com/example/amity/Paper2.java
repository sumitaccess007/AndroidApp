package com.example.amity;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class Paper2 extends Activity implements OnClickListener{
ImageView as3,as, as1, as2, as4,as5;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_paper2);
		as3=(ImageView) findViewById(R.id.imageView1);
		as=(ImageView) findViewById(R.id.imageView2);
		as1=(ImageView) findViewById(R.id.imageView3);
		as2=(ImageView) findViewById(R.id.imageView4);
		as4=(ImageView) findViewById(R.id.imageView5);
		as5=(ImageView) findViewById(R.id.imageView6);
		
		as.setOnClickListener(this);
		as1.setOnClickListener(this);
		as2.setOnClickListener(this);
		as4.setOnClickListener(this);
		as5.setOnClickListener(this);
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.paper1, menu);
		return true;
	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		switch(arg0.getId()){
		case R.id.imageView2:
			as3.setImageResource(R.drawable.as);
			break;
			
		case R.id.imageView3:
			as3.setImageResource(R.drawable.as1);
			break;
			
		case R.id.imageView4:
			as3.setImageResource(R.drawable.as2);
			break;
			
		case R.id.imageView5:
			as3.setImageResource(R.drawable.as4);
			break;
			
		case R.id.imageView6:
			as3.setImageResource(R.drawable.as5);
			break;
	}
	}
}
