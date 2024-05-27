package com.unisagrado.lixixo;


import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.maps.android.SphericalUtil;


import java.util.ArrayList;

import java.util.List;

public class Map extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private LocationManager locationManager;
    private Criteria criteria;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.Map);
        mapFragment.getMapAsync(this);

        locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
        criteria = new Criteria();
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED
                && ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{android.Manifest.permission.ACCESS_FINE_LOCATION, android.Manifest.permission.ACCESS_COARSE_LOCATION}, 1);
            return;
        }

        Location location = null;
        if (locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER)) {
            location = locationManager.getLastKnownLocation(LocationManager.GPS_PROVIDER);
        } else if (locationManager.isProviderEnabled(LocationManager.NETWORK_PROVIDER)) {
            location = locationManager.getLastKnownLocation(LocationManager.NETWORK_PROVIDER);
        }

        if (location != null) {
            LatLng userLatLng = new LatLng(location.getLatitude(), location.getLongitude());
            CameraUpdate cameraUpdate = CameraUpdateFactory.newLatLngZoom(userLatLng, 14);
            googleMap.animateCamera(cameraUpdate);
            mMap.addMarker(new MarkerOptions().position(userLatLng).title("Você").icon(bitmapDescriptorFromVector(getApplicationContext(),R.drawable.baseline_boy_24)));


            LatLng nearestLatLng = null;
            double nearestDistance = Double.MAX_VALUE;

            List<LatLng> coordinateList = new ArrayList<>();
            coordinateList.add(new LatLng(-22.344239, -49.066982));
            coordinateList.add(new LatLng(-22.345712, -49.058080));
            coordinateList.add(new LatLng(-22.314405, -49.079043));
            coordinateList.add(new LatLng(-22.314874, -49.070899));
            coordinateList.add(new LatLng(-22.335747, -49.038827));
            coordinateList.add(new LatLng(-22.314957, -49.069624));
            coordinateList.add(new LatLng(-22.325000, -49.059647));
            coordinateList.add(new LatLng(-22.323312, -49.038489));



            for (LatLng coordinate : coordinateList) {
                double distance = SphericalUtil.computeDistanceBetween(userLatLng, coordinate);
                mMap.addMarker(new MarkerOptions().position(coordinate).title("Ecoponto Bauru").icon(bitmapDescriptorFromVector(getApplicationContext(),R.drawable.trash_svgrepo_com)));
                if (distance < nearestDistance) {
                    nearestDistance = distance;
                    nearestLatLng = coordinate;

                }
            }

            if (nearestLatLng != null) {
                PolylineOptions polylineOptions = new PolylineOptions();
                polylineOptions.add(userLatLng, nearestLatLng);
                mMap.addPolyline(polylineOptions);
            }

        }else{
            LatLng userLatLng = new LatLng(-22.303074, -49.065628);
            CameraUpdate cameraUpdate = CameraUpdateFactory.newLatLngZoom(userLatLng, 14);
            googleMap.animateCamera(cameraUpdate);

            List<LatLng> coordinateList = new ArrayList<>();
            coordinateList.add(new LatLng(-22.344239, -49.066982));
            coordinateList.add(new LatLng(-22.345712, -49.058080));
            coordinateList.add(new LatLng(-22.314405, -49.079043));
            coordinateList.add(new LatLng(-22.314874, -49.070899));
            coordinateList.add(new LatLng(-22.335747, -49.038827));
            coordinateList.add(new LatLng(-22.314957, -49.069624));
            coordinateList.add(new LatLng(-22.325000, -49.059647));
            coordinateList.add(new LatLng(-22.323312, -49.038489));



            for (LatLng coordinate : coordinateList) {
                mMap.addMarker(new MarkerOptions().position(coordinate).title("Ecoponto Bauru").icon(bitmapDescriptorFromVector(getApplicationContext(),R.drawable.trash_svgrepo_com)));
                }
            }





    }

    private BitmapDescriptor bitmapDescriptorFromVector(Context context, int vectorResId){
        Drawable vectorDrawable = ContextCompat.getDrawable(context, vectorResId);
        vectorDrawable.setBounds(0,0,vectorDrawable.getIntrinsicWidth(),
                vectorDrawable.getIntrinsicHeight());
        Bitmap bitmap = Bitmap.createBitmap(vectorDrawable.getIntrinsicWidth(),
                vectorDrawable.getIntrinsicHeight(),Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        vectorDrawable.draw(canvas);
        return BitmapDescriptorFactory.fromBitmap(bitmap);


    }
}