package com.makathon.thesalaya;

import java.util.ArrayList;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.actionbarsherlock.app.SherlockFragment;
import com.makathon.thesalaya.adapter.EventAdapter;

public class NewsAndEventFragment extends SherlockFragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.section_news_and_event, container,
				false);

		final String[] titles = getResources().getStringArray(R.array.events_title_mock);
		final String[] descriptions = getResources().getStringArray(R.array.events_description_mock);

	    ListView listview = (ListView) rootView.findViewById(R.id.list_view_event);
	    EventAdapter eventAdapter = new EventAdapter(getActivity(), R.layout.list_item_event, titles, descriptions);
	    listview.setAdapter(eventAdapter);
	    
	    
	    listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position,
					long id) {
				// TODO Auto-generated method stub
				Log.e("Seleted+++", titles[position]);
				Intent intent = new Intent(getActivity(), EventDetailActivity.class);
				intent.putExtra("title", titles[position]);
				intent.putExtra("description", descriptions[position]);
				startActivity(intent);
			}
		}) ;
	    

		return rootView;
	}
	
	
}
