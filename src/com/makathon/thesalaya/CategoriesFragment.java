package com.makathon.thesalaya;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.actionbarsherlock.app.SherlockFragment;

public class CategoriesFragment extends SherlockFragment implements OnClickListener {
	View rootView;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		rootView = inflater.inflate(R.layout.section_category, container,
				false);
		
		
		ImageView food_cate = (ImageView)rootView.findViewById(R.id.food_cate);
		ImageView green_cate = (ImageView)rootView.findViewById(R.id.green_cate);
		ImageView fashion_cate = (ImageView)rootView.findViewById(R.id.fashion_cate);
		ImageView creative_cate = (ImageView)rootView.findViewById(R.id.creative_cate);
		food_cate.setOnClickListener(this);
		green_cate.setOnClickListener(this);
		fashion_cate.setOnClickListener(this);
		creative_cate.setOnClickListener(this);

		return rootView;
		
	}

	
	


	@Override
	public void onClick(View v) {
		Intent i = new Intent(getActivity(), StoreActivity.class);
		switch (v.getId()) {
		case R.id.food_cate:
			Log.e("Cate++", "Food");
			i.putExtra("cate_name", "Food & Beverage");
			startActivity(i);
			break;
		case R.id.green_cate:
			Log.e("Cate++", "Green");
			i.putExtra("cate_name", "Green & ECO Zone");
			startActivity(i);
			break;
		case R.id.fashion_cate:
			Log.e("Cate++", "Fashion");
			i.putExtra("cate_name", "Fashion & Lifestyle");
			startActivity(i);
			break;
		case R.id.creative_cate:
			Log.e("Cate++", "Creative");
			i.putExtra("cate_name", "Creative Workshop & More");
			startActivity(i);
			break;

		default:
			break;
		}
		
	}
	
	
}
