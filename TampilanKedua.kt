package iat.pam.uts_prakpam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TampilanKedua : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tampilan_kedua)

        val button: Button = findViewById(R.id.button)

        button.setOnClickListener {
            val receiverData = intent.getStringExtra("data_key")
            val intent = Intent(this, TampilanKetiga::class.java)
            intent.putExtra("data_key", receiverData)
            startActivity(intent)
        }
    }
}