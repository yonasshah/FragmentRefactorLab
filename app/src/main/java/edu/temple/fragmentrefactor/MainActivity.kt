package edu.temple.fragmentrefactor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    val fragmentManager = testFragment()
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainerView, fragmentManager)
            .commit()

    }
}