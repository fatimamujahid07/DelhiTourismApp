package com.example.fatima.myapplication;


import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.support.annotation.Nullable;

public class Fragment2 extends Fragment {
    ImageButton myImageButton;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_fragment2, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        myImageButton = (ImageButton) getView().findViewById(R.id.frag2_img1);
        myImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), HistoricalScrollingActivity.class);
                intent.putExtra("string", "go to another Activity from ListView position: ");
                startActivity(intent);
            }

        });
/////
        myImageButton = (ImageButton) getView().findViewById(R.id.frag2_img2);
        myImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), GardenActivity.class);
                intent.putExtra("string", "go to another Activity from ListView position: ");
                startActivity(intent);
            }

        });
        myImageButton = (ImageButton) getView().findViewById(R.id.frag2_img3);
        myImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), MallActivity.class);
                intent.putExtra("string", "go to another Activity from ListView position: ");
                startActivity(intent);
            }

        });

        myImageButton = (ImageButton) getView().findViewById(R.id.frag2_img4);
        myImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), SpritualActivity.class);
                intent.putExtra("string", "go to another Activity from ListView position: ");
                startActivity(intent);
            }

        });

        myImageButton = (ImageButton) getView().findViewById(R.id.frag2_img5);
        myImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), HauntedActivity.class);
                intent.putExtra("string", "go to another Activity from ListView position: ");
                startActivity(intent);
            }

        });
    }

}





