package com.voidmemories.nimbleedgedemo

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.voidmemories.doublearray.ArrayDoubler
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var arrayDoublerInstance: ArrayDoubler
    private val sampleFloatArray = floatArrayOf(1F, 2F, 3F, 4F, 5F)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        (application as DemoApplication).appComponent.inject(this)
        setContentView(R.layout.activity_main)

        val outputView = findViewById<TextView>(R.id.output_view)
        outputView.text = arrayDoublerInstance.doubleThisArray(sampleFloatArray).contentToString()
    }
}