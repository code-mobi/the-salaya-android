package com.makathon.thesalaya;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.TextView;

import com.actionbarsherlock.app.SherlockFragmentActivity;


public class EventDetailActivity extends SherlockFragmentActivity {

	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.event_detail);
		
		 Bundle extras = getIntent().getExtras();
		 String titleStr;
		 String descriptionStr;
		 if(extras == null) {
			 titleStr = "";
			 descriptionStr = "";
		 } else {
			 titleStr = extras.getString("title");
			 descriptionStr = extras.getString("description");
			 
		 }

		 TextView title_tv = (TextView) findViewById(R.id.title_event_detail_tv);
		 TextView destcription_tv = (TextView) findViewById(R.id.description_event_detail_tv);
		 title_tv.setText(titleStr);
		 destcription_tv.setText(descriptionStr);
		 
		 ImageButton share_facebook_button = (ImageButton)findViewById(R.id.share_facebook);
		 share_facebook_button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				new AlertDialog.Builder(EventDetailActivity.this)
			    .setTitle("Example")
			    .setMessage(" Share on Facebook")
			    .setNeutralButton("Dismiss", new DialogInterface.OnClickListener() {
			        public void onClick(DialogInterface dialog, int which) { 
			            dialog.cancel();
			        }
			     })
	
			     .show();
				
			}
		});
		
	}

	
}
