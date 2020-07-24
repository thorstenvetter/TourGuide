package com.example.android.stuttgarttourguide.ui.restaurants;

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

public class RestaurantsFragment extends Fragment {

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

        View view  = inflater.inflate(R.layout.fragment_restaurant, container, false);

        final ArrayList<Place> arrayList = new ArrayList<>();
        arrayList.add(new Place(R.drawable.soon,getString(R.string.hupperts), getString(R.string.hupperts_address)));
        //Image source: https://crossfit-pottbox.com/comingsoon/coming-soon-2579123_1920/
        arrayList.add(new Place(R.drawable.soon,getString(R.string.ackerbürger), getString(R.string.ackerbürger_address)));
        arrayList.add(new Place(R.drawable.soon,getString(R.string.weinstube), getString(R.string.weinstube_address)));
        arrayList.add(new Place(R.drawable.soon,getString(R.string.cube), getString(R.string.cube_address)));
        arrayList.add(new Place(R.drawable.soon,getString(R.string.pier), getString(R.string.pier_address)));
        arrayList.add(new Place(R.drawable.soon,getString(R.string.stäffele), getString(R.string.stäffele_address)));


        customAdapter = new CustomAdapter(getContext(), arrayList);
        listView =  view.findViewById(R.id.list_view);
        listView.setAdapter(customAdapter);
        return view;
    }
}