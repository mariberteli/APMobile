package tads.ap.approjetocaroba

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var spinnerInstitution: Spinner
    private lateinit var editResponsible: EditText
    private lateinit var btnSave: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inicializar os componentes da UI
        spinnerInstitution = findViewById(R.id.spinnerInstitution)
        editResponsible = findViewById(R.id.editResponsible)
        btnSave = findViewById(R.id.btnSave)

        // Criar o adaptador para o Spinner
        val adapter = ArrayAdapter.createFromResource(
            this,
            R.array.institutions,
            android.R.layout.simple_spinner_item
        )
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerInstitution.adapter = adapter

        // Configurar o botão de salvar
        btnSave.setOnClickListener {
            val institution = spinnerInstitution.selectedItem.toString()
            val responsible = editResponsible.text.toString()

            // Criar a Intent para a próxima Activity (Tela de Opções)
            val intent = Intent(this, OptionsActivity::class.java)
            intent.putExtra("institution", institution)
            intent.putExtra("responsible", responsible)
            startActivity(intent)
        }
    }
}
