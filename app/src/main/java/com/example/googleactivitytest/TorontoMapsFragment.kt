package com.example.googleactivitytest

import androidx.fragment.app.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.Marker
import com.google.android.gms.maps.model.MarkerOptions
import com.google.android.gms.maps.GoogleMap as GoogleMap

class TorontoMapsFragment : Fragment(), OnMapReadyCallback  {



    private lateinit var markerPlace1: Marker
    private lateinit var markerPlace2: Marker
    private lateinit var markerPlace3: Marker
    private lateinit var markerPlace4: Marker
    private lateinit var markerPlace5: Marker

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_toronto_maps, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val mapFragment = childFragmentManager.findFragmentById(R.id.map) as SupportMapFragment?
        mapFragment?.getMapAsync(this)

    }
    override fun onMapReady(map: GoogleMap) {
        // Add some markers to the map, and add a data object to each marker.
        val rdGroup = view?.findViewById(R.id.rdGroup) as RadioGroup
        rdGroup.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { group, checkedId ->
            when (checkedId) {
                R.id.rdStandard-> {
                    map.setMapType(GoogleMap.MAP_TYPE_NORMAL);
                }
                R.id.rdHybrid -> {
                    map.setMapType(GoogleMap.MAP_TYPE_HYBRID);
                }
                R.id.rdSatellite -> {
                    map.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
                }
            }
        })

        var place1: LatLng?=arguments?.getParcelable("Place1")
        var place2: LatLng?=arguments?.getParcelable("Place2")
        var place3: LatLng?=arguments?.getParcelable("Place3")
        var place4: LatLng?=arguments?.getParcelable("Place4")
        var place5: LatLng?=arguments?.getParcelable("Place5")

        markerPlace1 = map.addMarker(
            place1?.let {
                MarkerOptions()
                    .position(it)
                    .title("place1")
            }
        )
        markerPlace1.tag = 0
        markerPlace2 = map.addMarker(
            place2?.let {
                MarkerOptions()
                    .position(it)
                    .title("place2")
            }
        )
        markerPlace2.tag = 0
        markerPlace3 = map.addMarker(
            place3?.let {
                MarkerOptions()
                    .position(it)
                    .title("place3")
            }
        )
        markerPlace3.tag = 0
        markerPlace4 = map.addMarker(
            place4?.let {
                MarkerOptions()
                    .position(it)
                    .title("place4")
            }
        )
        markerPlace4.tag = 0
        markerPlace5 = map.addMarker(
            place5?.let {
                MarkerOptions()
                    .position(it)
                    .title("place5")
            }
        )
        markerPlace5.tag = 0

        map.moveCamera(CameraUpdateFactory.newLatLngZoom(place1, 9f))
        // Set a listener for marker click.
       // map.setOnMarkerClickListener(this)
    }
}