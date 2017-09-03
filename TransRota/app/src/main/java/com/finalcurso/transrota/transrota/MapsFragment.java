package com.finalcurso.transrota.transrota;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsFragment extends SupportMapFragment implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        
        //GoogleMap.setOnMarkerClickListener(OnMarkerClickListener)

        // Add a marker in RioPardo and move the camera
        LatLng CENTRO = new LatLng(-21.595641, -46.888950);
        mMap.addMarker(new MarkerOptions().position(CENTRO).title("ESTAÇÃO CENTRAL"));
       //mMap.moveCamera(CameraUpdateFactory.newLatLng(RioPardo));
        LatLng VALEDOREDENTOR = new LatLng(-21.583923, -46.906266);
        mMap.addMarker(new MarkerOptions().position(VALEDOREDENTOR).title("ESTAÇÃO VALE DO REDENTOR"));

        LatLng NATALMERLI = new LatLng(-21.577344, -46.906266);
        mMap.addMarker(new MarkerOptions().position(NATALMERLI).title("ESTAÇÃO NATAL MERLI"));

        LatLng TRESPODERES = new LatLng(-21.599813, -46.891334);
        mMap.addMarker(new MarkerOptions().position(TRESPODERES).title("ESTAÇAO TRÊS PODERES"));

        LatLng HOSPITAL = new LatLng(-21.603145, -46.893351);
        mMap.addMarker(new MarkerOptions().position(HOSPITAL).title("ESTAÇÃO HOSPITAL"));

        LatLng ISOLETAVILELADEFIGUEIREDONASSER = new LatLng(-21.602082, -46.903997);
        mMap.addMarker(new MarkerOptions().position(ISOLETAVILELADEFIGUEIREDONASSER).title("ESTAÇÃO ISOLETA VILELA DE FIGUEIREDO NASSER"));



    }
}
