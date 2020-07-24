package com.example.android.stuttgarttourguide.ui.hotels;

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

public class HotelsFragment extends Fragment {

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

        View view  = inflater.inflate(R.layout.fragment_hotels, container, false);

        final ArrayList<Place> arrayList = new ArrayList<>();
        arrayList.add(new Place(R.drawable.soon,getString(R.string.kronenhotel), getString(R.string.kronenhotel_address)));
        //Image source: https://crossfit-pottbox.com/comingsoon/coming-soon-2579123_1920/
        arrayList.add(new Place(R.drawable.soon,getString(R.string.waldhotel), getString(R.string.waldhotel_address)));
        arrayList.add(new Place(R.drawable.soon,getString(R.string.maritimhotel), getString(R.string.maritimhotel_address)));
        arrayList.add(new Place(R.drawable.soon,getString(R.string.wartburghotel), getString(R.string.wartburghotel_address)));
        arrayList.add(new Place(R.drawable.soon,getString(R.string.hotelunger), getString(R.string.hotelunger_address)));
        arrayList.add(new Place(R.drawable.soon,getString(R.string.novumhotel), getString(R.string.novumhotel_address)));
        arrayList.add(new Place(R.drawable.soon,getString(R.string.motelone), getString(R.string.motelone_address)));

        customAdapter = new CustomAdapter(getContext(), arrayList);
        listView =  view.findViewById(R.id.list_view);
        listView.setAdapter(customAdapter);
        return view;
    }
}