package tads.ap.approjetocaroba

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class EditSampleActivity : AppCompatActivity() {

    private lateinit var btnEdit: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_sample)  // Make sure the XML layout is correctly set

        // Initialize the button using the ID defined in XML
        btnEdit = findViewById(R.id.btnEdit)

        // Set up a click listener for the button
        btnEdit.setOnClickListener {
            // Implement the logic for editing a sample
            Toast.makeText(this, "Amostra editada com sucesso", Toast.LENGTH_SHORT).show()
        }
    }
}
