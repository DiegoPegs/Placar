package br.com.diegohcc.placar.ui.time

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import br.com.diegohcc.placar.ui.placar.PlacarActivity
import br.com.diegohcc.placar.R
import br.com.diegohcc.placar.utils.KEY_EXTRA_TIME_A
import br.com.diegohcc.placar.utils.KEY_EXTRA_TIME_B
import kotlinx.android.synthetic.main.activity_times.*

class TimesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_times)

        btIniciarJogo.setOnClickListener {

        }

        btNovoJogo.setOnClickListener {
            val intent = Intent(this, PlacarActivity::class.java)
            intent.putExtra(KEY_EXTRA_TIME_A, inputTimeA.text.toString())
            intent.putExtra(KEY_EXTRA_TIME_B, inputTimeB.text.toString())
            startActivity(intent)
        }
    }
}
