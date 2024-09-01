package org.o7planning.myapplication.item;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.o7planning.myapplication.R;



public class gridDatachap extends BaseAdapter {
        Context context;
        int[] image;

        LayoutInflater inflater;
        public gridDatachap(Context context, int[] image) {
            this.context = context;
            this.image = image;
        }

        @Override
        public int getCount() {
            return image.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {

            if(inflater==null)
                inflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            if(view==null) {
                view = inflater.inflate(R.layout.item_chap, null);
            }
            ImageView imageView=view.findViewById(R.id.girdImage);
            TextView textView= view.findViewById(R.id.girdcaption);

            imageView.setImageResource(image[i]);
            return view;
        }
    }




