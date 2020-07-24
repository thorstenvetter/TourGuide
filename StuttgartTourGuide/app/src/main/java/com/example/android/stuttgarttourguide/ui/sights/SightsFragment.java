package com.example.android.stuttgarttourguide.ui.sights;

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

public class SightsFragment extends Fragment {

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

        View view  = inflater.inflate(R.layout.fragment_sights, container, false);

        final ArrayList<Place> arrayList = new ArrayList<>();
        arrayList.add(new Place(R.drawable.schlossplatz,getString(R.string.schlossplatz), " "));
        //Image Source: https://www.stuttgart-tourist.de/a-schlossplatz-stuttgart
        arrayList.add(new Place(R.drawable.fernsehturm,getString(R.string.fernsehturm), getString(R.string.fernsehturm_address)));
        //Image Source: https://www.stuttgarter-nachrichten.de/inhalt.stuttgarter-fernsehturm-der-leuchtturm-meldet-sich-zurueck.7d7ce358-45dc-4e79-a56b-d83045f92c7e.html
        arrayList.add(new Place(R.drawable.grabkapelle,getString(R.string.grabkapelle), getString(R.string.grabkapelle_address)));
        //Image source: https://www.stuttgarter-nachrichten.de/inhalt.mausoleum-in-stuttgart-rotenberg-besucherrekord-in-der-grabkapelle-erwartet.3f9835ab-872a-4be9-8c8e-169f6236d8e2.html
        arrayList.add(new Place(R.drawable.schlosssolitude,getString(R.string.solitude), getString(R.string.solitude_address)));
        //Image Source: https://www.schloss-solitude.de/start
        arrayList.add(new Place(R.drawable.staatsgalerie,getString(R.string.staatsgalerie), getString(R.string.staatsgalerie_address)));
        //Image Source: https://www.stuttgart-tourist.de/a-staatsgalerie-stuttgart
        arrayList.add(new Place(R.drawable.killesbergturm,getString(R.string.killesbergturm), getString(R.string.killesbergturm_address)));
        //Image Source: https://commons.wikimedia.org/wiki/File:Stuttgart_Killesbergturm_1.JPG

        customAdapter = new CustomAdapter(getContext(), arrayList);
        listView =  view.findViewById(R.id.list_view);
        listView.setAdapter(customAdapter);
        return view;
    }
}