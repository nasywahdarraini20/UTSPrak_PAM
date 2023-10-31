package iat.pam.uts_prakpam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nama = findViewById<EditText>(R.id.nama)
        val storeSpinner = findViewById<Spinner>(R.id.storeSpinner)
        val submit_button = findViewById<Button>(R.id.submit_button)

        submit_button.setOnClickListener {
            val selectedStore = storeSpinner.selectedItem.toString()
            val customerName = nama.text.toString()

            val intent = Intent(this, TampilanKedua::class.java)
            intent.putExtra("data_key", "Data yang akan dikirim")
            intent.putExtra("selectedStore", selectedStore)
            intent.putExtra("customerName", customerName)
            startActivity(intent)
        }
    }
}