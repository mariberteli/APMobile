package tads.ap.approjetocaroba

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class DeleteSampleActivity : AppCompatActivity() {

    private lateinit var btnDelete: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_delete_sample)

        btnDelete = findViewById(R.id.btnDelete)

        btnDelete.setOnClickListener {
            // Implementação para excluir a amostra
            // Aqui você pode criar uma lógica para excluir a amostra baseada em algum identificador
            Toast.makeText(this, "Amostra excluída com sucesso", Toast.LENGTH_SHORT).show()
        }
    }
}
