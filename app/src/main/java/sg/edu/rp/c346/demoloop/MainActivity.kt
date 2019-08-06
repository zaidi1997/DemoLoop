package sg.edu.rp.c346.demoloop

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener {
            for(i in 1..5) {
                Log.i("MainActivity", "$i")
            }
        }

        button2.setOnClickListener {
            var word = editText.text.toString()

            for(letter in word) {
                Log.i("MainActivity", "$letter")
            }
        }
    }
}
