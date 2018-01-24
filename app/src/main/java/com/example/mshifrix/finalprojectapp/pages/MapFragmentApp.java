package com.example.mshifrix.finalprojectapp.pages;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mshifrix.finalprojectapp.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

/**
 * A simple {@link Fragment} subclass.
 */
public class MapFragmentApp extends Fragment implements OnMapReadyCallback {
    private GoogleMap mMap;
    private OnMap mOnMap;

    public MapFragmentApp() {
    }

    /*Here we receive specific context
    * */
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if(context instanceof OnMap){
            mOnMap = (OnMap) context;
        }
    }//onAttach

    @Override
    public void onDetach() {
        super.onDetach();
        mOnMap = null;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_map, container, false);
        return view;
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        //TODO change standard code
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(-34, 151);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
    }

    private interface OnMap{
        //TODO change Name of interface
        //ToDo build interface if it need
    }

}
