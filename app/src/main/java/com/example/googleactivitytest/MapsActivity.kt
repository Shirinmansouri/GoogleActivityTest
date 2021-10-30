package com.example.googleactivitytest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.Spinner
import android.widget.Toast
import androidx.fragment.app.Fragment

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.example.googleactivitytest.databinding.ActivityMapsBinding
import com.google.android.gms.maps.model.Marker

class MapsActivity : AppCompatActivity(){
    //Toronto
    private var  place1 = LatLng(43.735446889615886, -79.40569130382907)
    private var  place2= LatLng(43.73527367489028, -79.4188681293801)
    private var  place3= LatLng(43.652460680166314, -79.38180802916467)
    private var  place4=LatLng(43.654508784002495, -79.39622758480662)
    private var  place5=LatLng(43.654508784002495, -79.39622758480662)

    //New York
    private var  place21 = LatLng(40.74086502396428, -74.00874221962006)
    private var  place22= LatLng(40.781034751402764, -73.96755122331288)
    private var  place23= LatLng(40.633585983012786, -73.95223509475834)
    private var  place24=LatLng(40.745956476754735, -74.17139485503111)
    private var  place25=LatLng(40.853327959528876, -73.87692613081053)

    //Toronto
    private var  place1 = LatLng(43.735446889615886, -79.40569130382907)
    private var  place2= LatLng(43.73527367489028, -79.4188681293801)
    private var  place3= LatLng(43.652460680166314, -79.38180802916467)
    private var  place4=LatLng(43.654508784002495, -79.39622758480662)
    private var  place5=LatLng(43.654508784002495, -79.39622758480662)

    //Toronto
    private var  place1 = LatLng(43.735446889615886, -79.40569130382907)
    private var  place2= LatLng(43.73527367489028, -79.4188681293801)
    private var  place3= LatLng(43.652460680166314, -79.38180802916467)
    private var  place4=LatLng(43.654508784002495, -79.39622758480662)
    private var  place5=LatLng(43.654508784002495, -79.39622758480662)

    //Toronto
    private var  place1 = LatLng(43.735446889615886, -79.40569130382907)
    private var  place2= LatLng(43.73527367489028, -79.4188681293801)
    private var  place3= LatLng(43.652460680166314, -79.38180802916467)
    private var  place4=LatLng(43.654508784002495, -79.39622758480662)
    private var  place5=LatLng(43.654508784002495, -79.39622758480662)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
     setContentView(R.layout.activity_maps)

        val spCities = findViewById<Spinner>(R.id.spCity) as Spinner
        spCities?.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                when(position)
                {
                    1 -> {
                         place1 = LatLng(43.735446889615886, -79.40569130382907)
                         place2= LatLng(43.81730485135306, -79.29177183465687)
                          place3= LatLng(43.81023383416433, -79.45205565335833)
                         place4=LatLng(43.83087554323812, -79.30395752172)
                         place5=LatLng(43.737906929116576, -79.4189862745749)
                        loadFragment(TorontoMapsFragment())
                    }
                    2 -> {
                        place1 = LatLng(43.735446889615886, -79.40569130382907)
                        place2= LatLng(43.73527367489028, -79.4188681293801)
                        place3= LatLng(43.652460680166314, -79.38180802916467)
                        place4=LatLng(43.654508784002495, -79.39622758480662)
                        place5=LatLng(43.654508784002495, -79.39622758480662)
                        loadFragment(TorontoMapsFragment())
                    }
                    3 -> {
                        place1 = LatLng(43.735446889615886, -79.40569130382907)
                        place2= LatLng(43.73527367489028, -79.4188681293801)
                        place3= LatLng(43.652460680166314, -79.38180802916467)
                        place4=LatLng(43.654508784002495, -79.39622758480662)
                        place5=LatLng(43.654508784002495, -79.39622758480662)
                        loadFragment(TorontoMapsFragment())
                    }
                    4 -> {
                        place1 = LatLng(43.735446889615886, -79.40569130382907)
                        place2= LatLng(43.73527367489028, -79.4188681293801)
                        place3= LatLng(43.652460680166314, -79.38180802916467)
                        place4=LatLng(43.654508784002495, -79.39622758480662)
                        place5=LatLng(43.654508784002495, -79.39622758480662)
                        loadFragment(TorontoMapsFragment())
                    }
                    5 -> {
                        place1 = LatLng(43.735446889615886, -79.40569130382907)
                        place2= LatLng(43.73527367489028, -79.4188681293801)
                        place3= LatLng(43.652460680166314, -79.38180802916467)
                        place4=LatLng(43.654508784002495, -79.39622758480662)
                        place5=LatLng(43.654508784002495, -79.39622758480662)
                        loadFragment(TorontoMapsFragment())
                    }
                }
            }

        }

    }
    private fun loadFragment(fragment: Fragment){

        val bundle = Bundle()
        bundle.putParcelable("Place1", place1)
        bundle.putParcelable("Place2", place2)
        bundle.putParcelable("Place3", place3)
        bundle.putParcelable("Place4", place4)
        bundle.putParcelable("Place5", place5)
        fragment.setArguments(bundle)
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.CityTypeLayout, fragment)
        transaction.disallowAddToBackStack()
        transaction.commit()
    }
}