package com.shekharkg.beacons

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {


  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    beaconCyan.setOnClickListener(this)
    beaconTint.setOnClickListener(this)
    beaconIndigo.setOnClickListener(this)
  }


  override fun onClick(v: View?) {
    if(v == beaconCyan)
      Toast.makeText(this, "Cyan", Toast.LENGTH_SHORT).show()
    else if(v == beaconTint)
      Toast.makeText(this, "Tint", Toast.LENGTH_SHORT).show()
    else if(v == beaconIndigo)
      Toast.makeText(this, "Indigo", Toast.LENGTH_SHORT).show()
  }
}
