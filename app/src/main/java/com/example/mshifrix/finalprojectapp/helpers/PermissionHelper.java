package com.example.mshifrix.finalprojectapp.helpers;

import android.Manifest;
import android.app.Activity;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;

/**
 * Created by tamir on 31/01/18.
 */

public class PermissionHelper {
    private static final int MY_PERMISSION_REQUEST_CODE = 7171;
    private static boolean locationPermissionGranted = false;

    private Activity activity;

    public PermissionHelper(Activity activity) {
        this.activity = activity;
    }

    /*return if location permissions granted or no.
    * */
    public boolean getStatusLocationPermisssions() {
        return locationPermissionGranted;
    }
    //This function wrote in main activity
    /*public boolean getLocationPermissions() {
        if (ActivityCompat.checkSelfPermission(activity, Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED
                && ActivityCompat.checkSelfPermission(activity, Manifest.permission.ACCESS_COARSE_LOCATION) == PackageManager.PERMISSION_GRANTED) {

            locationPermissionGranted = true;
            return true;
        } else {

            //Run-time request permission
            ActivityCompat.requestPermissions(activity, new String[]{
                    Manifest.permission.ACCESS_FINE_LOCATION,
                    Manifest.permission.ACCESS_COARSE_LOCATION
            }, MY_PERMISSION_REQUEST_CODE);
            locationPermissionGranted = true;

            return false;
        }

    }*/
}

