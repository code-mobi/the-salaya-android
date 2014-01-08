package com.makathon.thesalaya;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.actionbarsherlock.app.SherlockFragment;

public class MoreFragment extends SherlockFragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.section_more, container,
				false);

//		gridview = (GridView) rootView.findViewById(R.id.gridview);
//		mCategories = AppUtility.getInstance().getCategories(getActivity());
//		mAdapter = new CategoryAdapter(getActivity(), mCategories,
//				R.layout.cate_grid_item);
//
//		gridview.setAdapter(mAdapter);
//		gridview.setOnItemClickListener(this);
//		
//		mCategories.setOnCategoryChangeListener(new OnCategoryChangeListener() {
////			mCategories.setOnCategoryChangeListener(new OnCategoryChangeListener() {
//
//			@Override
//			public void onCategoryChange(Categories categories) {
//				mAdapter.notifyDataSetChanged();
//			}
//		});
		return rootView;
	}
	
	
}
