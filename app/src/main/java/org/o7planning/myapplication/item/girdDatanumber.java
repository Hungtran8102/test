package org.o7planning.myapplication.item;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.o7planning.myapplication.R;

public class girdDatanumber extends BaseAdapter {
        Context context;
        String[] name;

        LayoutInflater inflater;
        public girdDatanumber(Context context, String[] name) {
            this.context = context;
            this.name = name;
        }

        @Override
        public int getCount() {
            return name.length;
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
                view = inflater.inflate(org.o7planning.myapplication.R.layout.item_number, null);
            }
            TextView textView= view.findViewById(R.id.textView5);
            textView.setText(name[i]);
            return view;
        }
}





