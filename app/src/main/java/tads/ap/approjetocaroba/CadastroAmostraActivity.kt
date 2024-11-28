package tads.ap.approjetocaroba

import android.app.DatePickerDialog
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import java.util.*
class CadastroAmostraActivity : AppCompatActivity() {

    private lateinit var editSpecies: EditText
    private lateinit var spinnerSampleType: Spinner
    private lateinit var editCollectionDate: EditText
    private lateinit var btnSaveSample: Button
    private lateinit var editInstitution: EditText  // Campo para Instituição
    private lateinit var editResponsible: EditText  // Campo para Responsável

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro_amostra)

        // Inicializar os componentes da UI
        editSpecies = findViewById(R.id.editSpecies)
        spinnerSampleType = findViewById(R.id.spinnerSampleType)
        editCollectionDate = findViewById(R.id.editCollectionDate)
        btnSaveSample = findViewById(R.id.btnSaveSample)
        editInstitution = findViewById(R.id.editInstitution)  // Inicializar campo de instituição
        editResponsible = findViewById(R.id.editResponsible)  // Inicializar campo de responsável

        // Preencher os dados de responsável e instituição
        val institution = intent.getStringExtra("institution")
        val responsible = intent.getStringExtra("responsible")

        // Preencher os campos com os dados passados pela Intent
        editInstitution.setText(institution)  // Preenche o campo de instituição
        editResponsible.setText(responsible)  // Preenche o campo de responsável

        // Configurar o Spinner para o tipo de amostra (Pele, Músculo, Gordura)
        val sampleTypes = arrayOf("Pele", "Músculo", "Gordura")
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, sampleTypes)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerSampleType.adapter = adapter

        // Configurar o campo de data
        editCollectionDate.setOnClickListener {
            val calendar = Calendar.getInstance()
            val datePickerDialog = DatePickerDialog(
                this,
                { _, year, month, dayOfMonth ->
                    editCollectionDate.setText("$dayOfMonth/${month + 1}/$year")
                },
                calendar.get(Calendar.YEAR),
                calendar.get(Calendar.MONTH),
                calendar.get(Calendar.DAY_OF_MONTH)
            )
            datePickerDialog.show()
        }

        // Configurar o botão de salvar
        btnSaveSample.setOnClickListener {
            // Coletar dados e salvar a amostra
        }
    }
}
