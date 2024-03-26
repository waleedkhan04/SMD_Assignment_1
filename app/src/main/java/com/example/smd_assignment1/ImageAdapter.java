package com.example.smd_assignment1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {

    private final Context mContext;
    private final int[] mPostImages;

    public ImageAdapter(Context context, int[] postImages) {
        mContext = context;
        mPostImages = postImages;
    }

    @Override
    public int getCount() {
        return mPostImages.length;
    }

    @Override
    public Object getItem(int position) {
        return mPostImages[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        } else {
            imageView = (ImageView) convertView;
        }
        imageView.setImageResource(mPostImages[position]);
        return imageView;
    }
}
