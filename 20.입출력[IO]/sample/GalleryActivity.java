내장메모리데이타
package com.choongang.adapter.gallery;

import android.app.Activity;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;


public class GalleryActivity extends Activity {
	/** Called when the activity is first created. */
	Integer[] imageArray={
			R.drawable.icon,R.drawable.car1,
			R.drawable.icon,R.drawable.koreanfood,
			R.drawable.icon,R.drawable.icon,
			R.drawable.icon,R.drawable.icon,
			R.drawable.icon,R.drawable.icon,
			R.drawable.icon,R.drawable.icon,
			R.drawable.icon,R.drawable.icon,
			R.drawable.icon,R.drawable.icon};
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		Gallery gallery=(Gallery)findViewById(R.id.gallery1);
		GalleryAdapter adapter=new GalleryAdapter();
		gallery.setAdapter(adapter);
		
		Bitmap no_imageBitmap=
			BitmapFactory.decodeResource(getResources(), R.drawable.no_image);
		ImageView  image_detail=(ImageView)findViewById(R.id.imageView1);
		image_detail.setImageBitmap(no_imageBitmap);
		
		/*
        Auto Boxing,unBoxing
        Integer i=34;
        Integer ii=new Integer(34);
		 */
		gallery.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> adapterview, View arg1, int position,
					long arg3) {
				ImageView iv=(ImageView)findViewById(R.id.imageView1);
				int imageId=(Integer)adapterview.getItemAtPosition(position);
				iv.setImageResource(imageId);
				

			}


		});
	}
	/************Gallery Adapter***************/
	class GalleryAdapter extends BaseAdapter{
		int itemBackground=0;
		public GalleryAdapter() {

			TypedArray a=obtainStyledAttributes(R.styleable.Gallery1);
			itemBackground=a.getResourceId(R.styleable.Gallery1_android_galleryItemBackground, 0);

		}


		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return imageArray.length;
		}
		@Override
		public View getView(int position, View arg1, ViewGroup arg2) {
			// TODO Auto-generated method stub
			ImageView view=new ImageView(getApplicationContext());
			view.setImageResource(imageArray[position]);
			view.setLayoutParams(new Gallery.LayoutParams(100, 100));
			view.setScaleType(ImageView.ScaleType.FIT_XY);

			view.setBackgroundResource(itemBackground);

			return view;
		}

		@Override
		public Object getItem(int position) {
			// TODO Auto-generated method stub
			return imageArray[position];
		}

		@Override
		public long getItemId(int arg0) {
			// TODO Auto-generated method stub
			return 0;
		}



	}
	/******************************************/
}