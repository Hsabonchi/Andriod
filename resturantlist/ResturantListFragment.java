package com.hasanainalsabonchi.resturantlist;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class ResturantListFragment extends Fragment {
    private int mPosition;
    private List<Resturant> resturant_data ;


    public ResturantListFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_resturant_list, container, false);
    }



    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        resturant_data = setupPlanets();

        ListView listView = (ListView) getActivity().findViewById(R.id.Resturant_List);
        ImageTextArrayAdapter adapter = new ImageTextArrayAdapter(getActivity(), R.layout.resturant_item, resturant_data);
        listView.setAdapter(adapter);

    }



    private List <Resturant> setupPlanets() {
        String type_planet = getResources().getString(R.string.type_Resturant).toString();
        String type_minor_planet = getResources().getString(R.string.type_minor_Rest).toString();
        List<Resturant> planet_data_list ;

        Resturant[] resturants = new Resturant[] {
                new Resturant(R.drawable.a,"Fogo deChaao","Brazlian","Steak","$$$",R.drawable.star5),
                new Resturant(R.drawable.b,"Hookido","Asain","suchi","$",R.drawable.ra1),
                new Resturant(R.drawable.f,"Urth Cafe", "American","sandwich","$$$",R.drawable.star4),
                new Resturant(R.drawable.e,"indain Grill", "Indain","spicy food","$$",R.drawable.ra1),
                new Resturant(R.drawable.d,"Panini", "Mediterranean","Chicken kabab","$$",R.drawable.ra1),

        };
// Make list from Array
        planet_data_list= new ArrayList<>(Arrays.asList(resturants));
        return planet_data_list;



}

}