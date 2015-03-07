package com.inthecheesefactory.example.statedfragment.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.inthecheesefactory.example.statedfragment.R;
import com.inthecheesefactory.thecheeselibrary.fragment.support.v4.app.StatedFragment;

/**
 * Created by nuuneoi on 3/7/2015.
 */
public class SecondFragment extends StatedFragment {

    Button btnPush;

    public static SecondFragment newInstance() {
        SecondFragment fragment = new SecondFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_second, container, false);
        initInstances(rootView);
        return rootView;
    }

    private void initInstances(View rootView) {

    }

}
