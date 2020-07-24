package com.example.android.stuttgarttourguide.ui.activities;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.android.stuttgarttourguide.CustomAdapter;
import com.example.android.stuttgarttourguide.Place;
import com.example.android.stuttgarttourguide.R;

import java.util.ArrayList;

public class ActivitiesFragment extends Fragment {

    CustomAdapter customAdapter;
    ListView listView;

    @Override
    public String toString() {
        return "DishesFragment{" +
                "customAdapter=" + customAdapter +
                ", listView=" + listView +
                '}';
    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View view  = inflater.inflate(R.layout.fragment_activities, container, false);

        final ArrayList<Place> arrayList = new ArrayList<>();
        arrayList.add(new Place(R.drawable.soon,getString(R.string.mercedes), getString(R.string.mercedes_address)));
        //Image source: https://crossfit-pottbox.com/comingsoon/coming-soon-2579123_1920/
        arrayList.add(new Place(R.drawable.soon,getString(R.string.porsche), getString(R.string.porsche_address)));
        arrayList.add(new Place(R.drawable.soon,getString(R.string.wilhelma), getString(R.string.wilhelma_address)));
        arrayList.add(new Place(R.drawable.soon,getString(R.string.weihnachtsmarkt), getString(R.string.weihnachtsmarkt_address)));
        arrayList.add(new Place(R.drawable.soon,getString(R.string.kunstmuseum), getString(R.string.kunstmuseum_address)));
        arrayList.add(new Place(R.drawable.soon,getString(R.string.lindenmuseum), getString(R.string.lindenmuseum_address)));


        customAdapter = new CustomAdapter(getContext(), arrayList);
        listView =  view.findViewById(R.id.list_view);
        listView.setAdapter(customAdapter);
        return view;
    }
}