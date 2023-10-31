package iat.pam.uts_prakpam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton

class TampilanKetiga : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tampilan_ketiga)

        val addButton = findViewById<FloatingActionButton>(R.id.fab)
        val extraName = intent.getStringExtra("EXTRA_NAME")
        val extraDistrict = intent.getStringExtra("EXTRA_DISTRICT")
        addButton.setOnClickListener {
            val intent = Intent(this, TampilanKeempat::class.java)
            intent.putExtra("EXTRA_NAME", extraName)
            intent.putExtra("EXTRA_DISTRICT", extraDistrict)
            startActivity(intent)
        }
    }
}