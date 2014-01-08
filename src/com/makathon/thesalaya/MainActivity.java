package com.makathon.thesalaya;

import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.viewpagerindicator.TabPageIndicator;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View.OnClickListener;


public class MainActivity extends SherlockFragmentActivity {
	private static String[] CONTENT_SECTION = new String[5];
	private TabPageIndicator indicator;
	private int current_pos = 0;
	
	// Section Fragment
	private NewsAndEventFragment newsAndEventFragment;
	private PromotionFragment promotionFragment;
	private CategoriesFragment categoriesFragment;
	private MapFragment mapFragment;
	private MoreFragment moreFragment;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      
        //Set the pager with an adapter
        ViewPager pager = (ViewPager)findViewById(R.id.pager);
        pager.setAdapter(new TheSalayaAdapter(getSupportFragmentManager()));

        //Bind the Tab indicator to the adapter
        indicator = (TabPageIndicator) findViewById(R.id.indicator);
		indicator.setViewPager(pager);
		indicator.setCurrentItem(current_pos);
		
		
		
		
		newsAndEventFragment = new NewsAndEventFragment();
		promotionFragment = new PromotionFragment();
		categoriesFragment = new CategoriesFragment();
		mapFragment = new MapFragment();
		moreFragment = new MoreFragment();
        
    }


    
    
    
    public class TheSalayaAdapter extends FragmentStatePagerAdapter {

    	

    	public TheSalayaAdapter(FragmentManager fm) {
    		super(fm);
    		CONTENT_SECTION = getResources().getStringArray(R.array.sections);
    	}

    	@Override
    	public Fragment getItem(int position) {
    		switch (position) {
    		case 0:
    			// News & Event
    			return newsAndEventFragment;
    			
    		case 1:
    			// Promotion
    			return promotionFragment;
    			
    		case 2:
    			// Categories
    			return categoriesFragment;
    			
    		case 3:
    			// Map
    			return mapFragment;
    			
    		case 4:
    			// More
    			return moreFragment;
    			
    		default:
    			return null;
    		}
    		
    	}
    	
		@Override
		public CharSequence getPageTitle(int position) {
			return CONTENT_SECTION[position % CONTENT_SECTION.length];
		}

    	@Override
    	public int getCount() {
    		return CONTENT_SECTION.length;
    	}

    }
    
}


