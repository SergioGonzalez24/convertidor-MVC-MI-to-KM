package mx.itesm.smgv.convertidor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import mx.itesm.smgv.convertidor.databinding.ActivityMainBinding

//cONTROLADOR
class MainActivity : AppCompatActivity() {

    //Referencias a los componentes de la GUI
    //private var etKilometros: EditText? = null
    //private var etMillas: EditText? = null

    //Boton
    //Viewbinding
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root) //La vista Principal de la GUI

        configurarGUI()
    }

    private fun configurarGUI() {
        //etKilometros = findViewById(R.id.etKilometros)
        //etMillas = findViewById(R.id.etMillas)
        val btnConvertir = binding.btnConvertir//findViewById<Button>(R.id.btnConvertir)


        btnConvertir.setOnClickListener {
            val kilometros = binding.etKilometros.text.toString().toDouble()
            //val millas = binding.etMillas.text.toString().toDouble()
            val modelo = Convertidor()
            val mi = modelo.convertirKmMi(kilometros)
            //val kms = modelo.convertirMiKm(millas)

            binding.etMillas.setText(mi.toString())
            //binding.etKilometros.setText(kms.toString())
        }
    }
}