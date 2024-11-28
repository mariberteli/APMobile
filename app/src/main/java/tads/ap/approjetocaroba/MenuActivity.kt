package tads.ap.approjetocaroba

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MenuActivity : AppCompatActivity() {

    private lateinit var btnRegisterSample: Button
    private lateinit var btnDeleteSample: Button
    private lateinit var btnConsultSample: Button
    private lateinit var btnEditSample: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        // Inicializar os botões
        btnRegisterSample = findViewById(R.id.btnRegisterSample)
        btnDeleteSample = findViewById(R.id.btnDeleteSample)
        btnConsultSample = findViewById(R.id.btnConsultSample)
        btnEditSample = findViewById(R.id.btnEditSample)

        // Definir ações para os botões
        btnRegisterSample.setOnClickListener {
            val intent = Intent(this, CadastroAmostraActivity::class.java)
            startActivity(intent)
        }

        btnDeleteSample.setOnClickListener {
            // Redirecionar para a tela de exclusão de amostras (a ser criada)
            // Exemplo de intent
            val intent = Intent(this, DeleteSampleActivity::class.java)
            startActivity(intent)
        }

        btnConsultSample.setOnClickListener {
            // Redirecionar para a tela de consulta de amostras (a ser criada)
            // Exemplo de intent
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
        }

        btnEditSample.setOnClickListener {
            // Redirecionar para a tela de edição de amostras (a ser criada)
            // Exemplo de intent
            val intent = Intent(this, EditSampleActivity::class.java)
            startActivity(intent)
        }
    }
}
