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

        /*
        var place21: LatLng?=arguments?.getParcelable("Place21")
        var place22: LatLng?=arguments?.getParcelable("Place22")
        var place23: LatLng?=arguments?.getParcelable("Place23")
        var place24: LatLng?=arguments?.getParcelable("Place24")
        var place25: LatLng?=arguments?.getParcelable("Place25")

        var place31: LatLng?=arguments?.getParcelable("Place31")
        var place32: LatLng?=arguments?.getParcelable("Place32")
        var place33: LatLng?=arguments?.getParcelable("Place33")
        var place34: LatLng?=arguments?.getParcelable("Place34")
        var place35: LatLng?=arguments?.getParcelable("Place35")

        var place41: LatLng?=arguments?.getParcelable("Place41")
        var place42: LatLng?=arguments?.getParcelable("Place42")
        var place43: LatLng?=arguments?.getParcelable("Place43")
        var place44: LatLng?=arguments?.getParcelable("Place44")
        var place45: LatLng?=arguments?.getParcelable("Place45")

        var place51: LatLng?=arguments?.getParcelable("Place51")
        var place52: LatLng?=arguments?.getParcelable("Place52")
        var place53: LatLng?=arguments?.getParcelable("Place53")
        var place54: LatLng?=arguments?.getParcelable("Place54")
        var place55: LatLng?=arguments?.getParcelable("Place55")
        */

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

        /*
        markerPlace1 = map.addMarker(
            place21?.let {
                MarkerOptions()
                    .position(it)
                    .title("place21")
            }
        )
        markerPlace1.tag = 0
        markerPlace2 = map.addMarker(
            place22?.let {
                MarkerOptions()
                    .position(it)
                    .title("place22")
            }
        )
        markerPlace2.tag = 0
        markerPlace3 = map.addMarker(
            place23?.let {
                MarkerOptions()
                    .position(it)
                    .title("place23")
            }
        )
        markerPlace3.tag = 0
        markerPlace4 = map.addMarker(
            place24?.let {
                MarkerOptions()
                    .position(it)
                    .title("place24")
            }
        )
        markerPlace4.tag = 0
        markerPlace5 = map.addMarker(
            place25?.let {
                MarkerOptions()
                    .position(it)
                    .title("place25")
            }
        )
        markerPlace5.tag = 0

        markerPlace1 = map.addMarker(
            place31?.let {
                MarkerOptions()
                    .position(it)
                    .title("place31")
            }
        )
        markerPlace1.tag = 0
        markerPlace2 = map.addMarker(
            place32?.let {
                MarkerOptions()
                    .position(it)
                    .title("place32")
            }
        )
        markerPlace2.tag = 0
        markerPlace3 = map.addMarker(
            place33?.let {
                MarkerOptions()
                    .position(it)
                    .title("place33")
            }
        )
        markerPlace3.tag = 0
        markerPlace4 = map.addMarker(
            place34?.let {
                MarkerOptions()
                    .position(it)
                    .title("place34")
            }
        )
        markerPlace4.tag = 0
        markerPlace5 = map.addMarker(
            place35?.let {
                MarkerOptions()
                    .position(it)
                    .title("place35")
            }
        )
        markerPlace5.tag = 0

        markerPlace1 = map.addMarker(
            place41?.let {
                MarkerOptions()
                    .position(it)
                    .title("place41")
            }
        )
        markerPlace1.tag = 0
        markerPlace2 = map.addMarker(
            place42?.let {
                MarkerOptions()
                    .position(it)
                    .title("place42")
            }
        )
        markerPlace2.tag = 0
        markerPlace3 = map.addMarker(
            place43?.let {
                MarkerOptions()
                    .position(it)
                    .title("place43")
            }
        )
        markerPlace3.tag = 0
        markerPlace4 = map.addMarker(
            place44?.let {
                MarkerOptions()
                    .position(it)
                    .title("place44")
            }
        )
        markerPlace4.tag = 0
        markerPlace5 = map.addMarker(
            place45?.let {
                MarkerOptions()
                    .position(it)
                    .title("place45")
            }
        )
        markerPlace5.tag = 0

        markerPlace1 = map.addMarker(
            place51?.let {
                MarkerOptions()
                    .position(it)
                    .title("place51")
            }
        )
        markerPlace1.tag = 0
        markerPlace2 = map.addMarker(
            place52?.let {
                MarkerOptions()
                    .position(it)
                    .title("place52")
            }
        )
        markerPlace2.tag = 0
        markerPlace3 = map.addMarker(
            place53?.let {
                MarkerOptions()
                    .position(it)
                    .title("place53")
            }
        )
        markerPlace3.tag = 0
        markerPlace4 = map.addMarker(
            place54?.let {
                MarkerOptions()
                    .position(it)
                    .title("place54")
            }
        )
        markerPlace4.tag = 0
        markerPlace5 = map.addMarker(
            place55?.let {
                MarkerOptions()
                    .position(it)
                    .title("place55")
            }
        )
        markerPlace5.tag = 0
        */

        map.moveCamera(CameraUpdateFactory.newLatLngZoom(place1, 9f))
        // Set a listener for marker click.
       // map.setOnMarkerClickListener(this)
    }
}