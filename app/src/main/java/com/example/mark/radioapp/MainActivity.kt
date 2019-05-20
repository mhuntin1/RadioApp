package com.example.mark.radioapp

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.*

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        var radioFemale = findViewById<RadioButton>(R.id.femaleButton)
        var radioMale = findViewById<RadioButton>(R.id.maleButton)

        var createButton = findViewById<Button>(R.id.buttonOne)

        createButton.setOnClickListener(View.OnClickListener {
            val userText = findViewById<EditText>(R.id.username)
            //var string = readLine()
            if (radioFemale.isChecked)
                Toast.makeText(this, "Female user " + userText.text + " created", Toast.LENGTH_LONG).show()
            if (radioMale.isChecked)
                Toast.makeText(this, "Male user " + userText.text + " created", Toast.LENGTH_LONG).show()
        })

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
    // Inflate the menu; this adds items to the action bar if it is present.
    menuInflater.inflate(R.menu.menu_main, menu)
    return true
    }

override fun onOptionsItemSelected(item: MenuItem): Boolean {
// Handle action bar item clicks here. The action bar will
// automatically handle clicks on the Home/Up button, so long
// as you specify a parent activity in AndroidManifest.xml.
return when (item.itemId) {
R.id.action_settings -> true
else -> super.onOptionsItemSelected(item)
}
}






}
