package iat.pam.uts_prakpam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout

class TampilanKelima : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tampilan_kelima2)

        val popup = findViewById<LinearLayout>(R.id.popup)
        val button_akhir = findViewById<Button>(R.id.button_akhir)

        button_akhir.setOnClickListener {
            popup.visibility = View.VISIBLE
        }
    }
}