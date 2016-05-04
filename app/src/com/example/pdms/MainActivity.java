package com.example.pdms;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {
	
	String[] list = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.activity_listview, list);
		ListView listView = (ListView) findViewById(R.id.list);
	    listView.setAdapter(adapter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
