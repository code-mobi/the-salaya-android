package com.makathon.thesalaya.adapter;

import java.util.HashMap;
import java.util.List;

import com.makathon.thesalaya.R;



import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class EventAdapter extends ArrayAdapter<String> {
	
	private final Activity activity;
	private final int resId;
	private final String[] titles;
	private final String[] descriptions;
	private static LayoutInflater mInflater = null;
	
	  public EventAdapter(Activity activity,int resource, String[] titles, String[] descriptions) {
	    super(activity, resource, titles);
	    this.activity = activity;
	    this.resId = resource;
	    this.titles = titles;
	    this.descriptions = descriptions;
	    mInflater = (LayoutInflater) activity
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	  }
	  
	private static final class ViewHolder {
			TextView title_tv;
			TextView description_tv;
			ImageView thumbnail_imv;
		}

	  @Override
	  public View getView(int position, View convertView, ViewGroup parent) {
			ViewHolder holder;
			if (convertView == null) {
				convertView = mInflater.inflate(resId, parent, false);
				holder = new ViewHolder();

				holder.title_tv = (TextView) convertView
						.findViewById(R.id.title_event_tv);
				holder.description_tv = (TextView) convertView
						.findViewById(R.id.description_event_tv);
				holder.thumbnail_imv = (ImageView) convertView
						.findViewById(R.id.thumb_event_imgview);
				convertView.setTag(holder);
			} else {
				holder = (ViewHolder) convertView.getTag();
			}
			
			String titleStr = titles[position];
			String descriptionStr = descriptions[position];
			holder.title_tv.setText(titleStr);
			holder.description_tv.setText(descriptionStr);
			holder.thumbnail_imv.setImageResource(R.drawable.thumb_event_empty);
//			Category item = categories.get(position);
//			holder.title.setText(item.getTitle());
//			imageLoader.displayImage(item.getThumbnail(), holder.thumbnail,
//					AppUtility.getInstance().getDefaultImageOption(),
//					animateFirstListener);
			return convertView;
	  }
	  
	@Override
	public int getCount() {
		return titles.length;
	}
}
