package com.manikandansethuraj.golfscorecard;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/**
 * Created by MANIKANDAN_SETHURAJ on 2016-08-25.
 */
public class ListAdapter extends BaseAdapter {


    public ListAdapter (Context context, Hole[] holes){

        Context mContext = context;
        mHoles = holes;

    }

    @Override
    public int getCount() {
        return 0;
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
        return null;
    }
}
