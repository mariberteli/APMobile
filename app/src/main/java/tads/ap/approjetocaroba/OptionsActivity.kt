package tads.ap.approjetocaroba

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class OptionsActivity : AppCompatActivity() {

    private lateinit var btnCadastrar: Button
    private lateinit var btnExcluir: Button
    private lateinit var btnConsultar: Button
    private lateinit var btnEditar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_options)

        // Inicializando os botões a partir do layout XML
        btnCadastrar = findViewById(R.id.btnCadastrar)
        btnExcluir = findViewById(R.id.btnExcluir)
        btnConsultar = findViewById(R.id.btnConsultar)
        btnEditar = findViewById(R.id.btnEditar)

        // Coletando dados da MainActivity (Institution e Responsible)
        val institution = intent.getStringExtra("institution")
        val responsible = intent.getStringExtra("responsible")

        // Configurando a ação para o botão de Cadastrar
        btnCadastrar.setOnClickListener {
            val intent = Intent(this, CadastroAmostraActivity::class.java)
            intent.putExtra("institution", institution)
            intent.putExtra("responsible", responsible)
            startActivity(intent)
        }

        // Ações para os botões de Excluir, Consultar e Editar
        btnExcluir.setOnClickListener {
            // Implementar ação de exclusão
        }

        btnConsultar.setOnClickListener {
            // Implementar ação de consulta
        }

        btnEditar.setOnClickListener {
            // Implementar ação de edição
        }
    }
}
