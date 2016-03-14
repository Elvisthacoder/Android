package com.example.taifa.book;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by taifa on 3/11/16.
 */
public class signout extends Fragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstancesState) {

        View rootView = inflater.inflate(R.layout.signout, container, false);

        return rootView;
    }
}
