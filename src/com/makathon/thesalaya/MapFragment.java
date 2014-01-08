package com.makathon.thesalaya;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.actionbarsherlock.app.SherlockFragment;

public class MapFragment extends SherlockFragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.section_map, container,
				false);

		ImageView map_view = (ImageView)rootView.findViewById(R.id.map_view);
		map_view.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
//				openLargeImage();
			}
		});
		
		return rootView;
	}
	
	private void openLargeImage() {
//		Intent intent = new Intent(getActivity(),
//				LargeThumbnailActivity.class);
//		intent.putExtra(LargeThumbnailActivity.EXTRAS_TITLE,
//				program.getTitle());
//		intent.putExtra(LargeThumbnailActivity.EXTRAS_LARGE_THUMBNAIL, program.getPoster());
//		intent.putExtra(LargeThumbnailActivity.EXTRAS_PROGRAM_ID, program.getId());
//		intent.putExtra(LargeThumbnailActivity.EXTRAS_DETAIL, program.getDetail());
//		startActivity(intent);
	}

	
}
