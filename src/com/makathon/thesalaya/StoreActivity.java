package com.makathon.thesalaya;

import android.os.Bundle;
import android.widget.ListView;

import com.actionbarsherlock.app.SherlockActivity;
import com.makathon.thesalaya.adapter.StoreAdapter;

public class StoreActivity extends SherlockActivity {
    String[] storeNames = new String[] { "Android", "iPhone", "WindowsMobile",
    "Blackberry", "WebOS", "Ubuntu", "Windows7", "Max OS X",
    "Linux", "OS/2", "Ubuntu", "Windows7", "Max OS X", "Linux",
    "OS/2", "Ubuntu", "Windows7", "Max OS X", "Linux", "OS/2",
    "Android", "iPhone", "WindowsMobile" };
    String[] locations = new String[] { "The Salaya", "The Salaya", "The Salaya",
    		"The Salaya", "The Salaya", "The Salaya", "The Salaya", "The Salaya",
    		"The Salaya", "The Salaya", "The Salaya", "The Salaya", "The Salaya", "The Salaya",
    		"The Salaya", "The Salaya", "The Salaya", "The Salaya", "The Salaya", "The Salaya",
    		"The Salaya", "The Salaya", "The Salaya" };
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.list_store);
		
		Bundle extras = getIntent().getExtras();
		
		setTitle(extras.getString("cate_name"));
		
		 ListView listview = (ListView) findViewById(R.id.list_view_store);
		 StoreAdapter eventAdapter = new StoreAdapter(this, R.layout.list_item_store, storeNames, locations);
		 listview.setAdapter(eventAdapter);
		
	}

	
	
}
