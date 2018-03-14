package com.hasanainalsabonchi.resturantlist;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by hasanainalsabonchi on 5/7/16.
 */
class ImageTextArrayAdapter  extends ArrayAdapter {
    public final static String TAG = "ImageTextArrayAdapter";
    int layoutResourceId;
    private Context context;
    private List<Resturant> data;
    private LayoutInflater inflater;

    public ImageTextArrayAdapter(Context context, int layoutResourceId, List<Resturant> data) {
        super(context, layoutResourceId, data);
        this.layoutResourceId = layoutResourceId;
        this.context = context;
        this.data = data;
        inflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    public View getView(int position, View convertView, ViewGroup parent) {
        ResturantHolder holder;
        if (null==convertView) {
            Log.d(TAG, "getView: rowView null: position make new holder" + position);
            convertView = inflater.inflate(layoutResourceId, parent, false);
            holder = new ResturantHolder();
            holder.imgLogo = (ImageView) convertView.findViewById(R.id.Resturant_logo);
            holder.RestNameView = (TextView) convertView.findViewById(R.id.Res_name);
            holder.RestTypeView = (TextView) convertView.findViewById(R.id.Res_type);
            holder.RestopinionView = (TextView) convertView.findViewById(R.id.Res_opinopn);
            holder.RestpriceView = (TextView) convertView.findViewById(R.id.Res_price);
            holder.ResimgRating = (ImageView) convertView.findViewById(R.id.img_Rating);
            convertView.setTag(holder);

        }else {

            Log.d(TAG, "getView: rowView !null - reuse holder: position " + position);
            holder = (ResturantHolder) convertView.getTag();


        }

          Resturant resturant= data.get(position);
           holder.imgLogo.setImageResource(resturant.logo);
           holder.RestNameView.setText(resturant.name);
           holder.RestTypeView.setText(resturant.type);
           holder.RestpriceView.setText(resturant.price);
           holder.RestopinionView.setText(resturant.opinion);
            holder.ResimgRating.setImageResource(resturant.Rating);



//            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//            Log.d(TAG, "getView: rowView null: position " + position);
//            View rowView = inflater.inflate(layoutResourceId, parent, false);
//            TextView RestNameView = (TextView) rowView.findViewById(R.id.Res_name);
//            TextView RestTypeView = (TextView) rowView.findViewById(R.id.Res_type);
//            TextView RestpriceView = (TextView) rowView.findViewById(R.id.Res_price);
//            TextView RestopinionView = (TextView) rowView.findViewById(R.id.Res_opinopn);
//            ImageView RestLogoView = (ImageView) rowView.findViewById(R.id.Resturant_logo);
//            ImageView ResimgRating = (ImageView) rowView.findViewById(R.id.img_Rating);
//
//            RestNameView.setText(data.get(position).name);
//            RestTypeView.setText(data.get(position).type);
//            RestLogoView.setImageResource(data.get(position).logo);
//            RestpriceView.setText(data.get(position).opinion);
//            RestopinionView.setText(data.get(position).price);
//            ResimgRating.setImageResource(data.get(position).Rating);
            return convertView;


    }


    static class ResturantHolder
    {

        ImageView imgLogo;
        TextView RestNameView;
        TextView RestTypeView;
        TextView RestpriceView;
        TextView  RestopinionView;
        ImageView ResimgRating;




    }}

