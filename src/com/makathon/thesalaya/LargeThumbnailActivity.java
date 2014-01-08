package com.makathon.thesalaya;

import android.app.Activity;
import android.database.ContentObserver;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.TextView;



public class LargeThumbnailActivity extends Activity {
	public static final String EXTRAS_TITLE = "EXTRAS_TITLE";
	public static final String EXTRAS_LARGE_THUMBNAIL = "EXTRAS_LARGE_THUMBNAIL";
	public static final String EXTRAS_PROGRAM_ID = "EXTRAS_PROGRAM_ID";
	public static final String EXTRAS_DETAIL = "EXTRAS_DETAIL";

	private Handler mHandler = new Handler();
	
	private String title_str;
	private String larg_thumbnail_url;

	private String programId;
	private String detail;

	
	private ImageButton buttonFav;
	private TextView textDescription;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.large_thumbnail);
		


//		TouchImageView img = (TouchImageView) findViewById(R.id.iv_largThumbnail);
//		ImageLoader.getInstance().displayImage(larg_thumbnail_url, img, AppUtility.getInstance().getDefaultImageOption());
//		img.setMaxZoom(4f);

	}



	

	

}
