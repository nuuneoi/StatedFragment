package com.inthecheesefactory.example.statedfragment.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.inthecheesefactory.example.statedfragment.R;
import com.inthecheesefactory.thecheeselibrary.fragment.support.v4.app.StatedFragment;

/**
 * Created by nuuneoi on 3/7/2015.
 */
public class MainFragment extends StatedFragment {

    TextView tvSample;
    EditText editText;
    Button btnPush;
    Button btnCopy;

    public static MainFragment newInstance() {
        MainFragment fragment = new MainFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        initInstances(rootView);
        return rootView;
    }

    private void initInstances(View rootView) {
        btnPush = (Button) rootView.findViewById(R.id.btnPush);
        tvSample = (TextView) rootView.findViewById(R.id.tvSample);
        editText = (EditText) rootView.findViewById(R.id.editText);
        btnCopy = (Button) rootView.findViewById(R.id.btnCopy);

        btnPush.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction()
                                                         .replace(R.id.contentContainer, SecondFragment.newInstance())
                                                         .addToBackStack(null)
                                                         .commit();
            }
        });

        btnCopy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvSample.setText(editText.getText());
            }
        });
    }

    @Override
    protected void onSaveState(Bundle outState) {
        super.onSaveState(outState);
        outState.putString("text", tvSample.getText().toString());
    }

    @Override
    protected void onRestoreState(Bundle savedInstanceState) {
        super.onRestoreState(savedInstanceState);
        tvSample.setText(savedInstanceState.getString("text"));
    }
}
