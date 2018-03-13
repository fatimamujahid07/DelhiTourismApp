package com.example.fatima.myapplication;


import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.support.annotation.Nullable;

public class Fragment3 extends Fragment {
    ImageButton myImageButton;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_fragment3, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        myImageButton = (ImageButton) getView().findViewById(R.id.frag3_img1);
        myImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), AkshardhamActivity.class);
                intent.putExtra("string", "go to another Activity from ListView position: ");
                startActivity(intent);
            }

        });

        myImageButton = (ImageButton) getView().findViewById(R.id.frag3_img2);
        myImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), Qutub_MinarActivity.class);
                intent.putExtra("string", "go to another Activity from ListView position: ");
                startActivity(intent);
            }

        });

        myImageButton = (ImageButton) getView().findViewById(R.id.frag3_img3);
        myImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), LotussActivity.class);
                intent.putExtra("string", "go to another Activity from ListView position: ");
                startActivity(intent);
            }

        });

        myImageButton = (ImageButton) getView().findViewById(R.id.frag3_img4);
        myImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), RedfActivity.class);
                intent.putExtra("string", "go to another Activity from ListView position: ");
                startActivity(intent);
            }

        });

        myImageButton = (ImageButton) getView().findViewById(R.id.frag3_img5);
        myImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), India_GateActivity.class);
                intent.putExtra("string", "go to another Activity from ListView position: ");
                startActivity(intent);
            }

        });

    }

}





