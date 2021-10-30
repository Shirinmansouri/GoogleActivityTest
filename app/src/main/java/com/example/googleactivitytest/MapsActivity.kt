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

    //Essen, Germany
    private var  place31 = LatLng(51.45003694684787, 7.004779330189205)
    private var  place32= LatLng(51.490929898583374, 7.04389845992266)
    private var  place33= LatLng(51.43968681269753, 6.806211651108742)
    private var  place34=LatLng(51.460809500622915, 7.000758834980649)
    private var  place35=LatLng(51.41479480539004, 7.009556476882874)

    //London
    private var  place41 = LatLng(51.50622078425671, -0.12421192748611999)
    private var  place42= LatLng(51.49110588637827, -0.28921920027077436)
    private var  place43= LatLng(51.52366729738392, -0.12769731404300835)
    private var  place44=LatLng(51.48069150408709, -0.15930412363876092)
    private var  place45=LatLng(51.52425568502064, -0.15434684994062953)

    //Madrid
    private var  place51 = LatLng(40.39540948538992, -3.6979339058477287)
    private var  place52= LatLng(40.442732994403876, -3.638321130814093)
    private var  place53= LatLng(40.45168806699517, -3.730172563481489)
    private var  place54=LatLng(40.520173777336844, -3.655435050044181)
    private var  place55=LatLng(40.37928273020298, -3.6123548032656796)

    //Los Angeles
    private var  place61 = LatLng(34.07041529073723, -118.35974642739791)
    private var  place62= LatLng(34.06145764470279, -118.24933721473037)
    private var  place63= LatLng(34.12619360358506, -118.30108886955652)
    private var  place64=LatLng(34.18301527498086, -118.41884856946494)
    private var  place65=LatLng(34.084689649593294, -118.47378020502894)

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