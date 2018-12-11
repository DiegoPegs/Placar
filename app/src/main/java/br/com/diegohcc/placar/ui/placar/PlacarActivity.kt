package br.com.diegohcc.placar.ui.placar

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import br.com.diegohcc.placar.R
import br.com.diegohcc.placar.utils.KEY_EXTRA_TIME_A
import br.com.diegohcc.placar.utils.KEY_EXTRA_TIME_B
import kotlinx.android.synthetic.main.activity_placar.*

class PlacarActivity : AppCompatActivity() {

    private var placarA = 0
    private var placarB = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_placar)

        if (savedInstanceState != null){
            placarA = savedInstanceState.getInt("PLACAR_CASA")
            placarB = savedInstanceState.getInt("PLACAR_FORA")

            tvPlacarTimeA.text = placarA.toString()
            tvPlacarTimeB.text = placarB.toString()
        }
        tvTimeA.text = intent.extras.getString(KEY_EXTRA_TIME_A)
        tvTimeB.text = intent.extras.getString(KEY_EXTRA_TIME_B)

        btUmPontoTimeA.setOnClickListener { adicionaPontosTimeA(1)}
        btDoisPontosTimeA.setOnClickListener { adicionaPontosTimeA(2)}
        btTresPontosTimeA.setOnClickListener {adicionaPontosTimeA(3)}

        btUmPontoTimeB.setOnClickListener { adicionaPontosTimeB(1)}
        btDoisPontosTimeB.setOnClickListener { adicionaPontosTimeB(2)}
        btTresPontosTimeB.setOnClickListener { adicionaPontosTimeB(3)}

    }

    private fun adicionaPontosTimeA(ponto: Int) {
        placarA += ponto
        tvPlacarTimeA.text = placarA.toString()
    }

    private fun adicionaPontosTimeB(ponto: Int) {
        placarB += ponto
        tvPlacarTimeB.text = placarB.toString()
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        outState?.putInt("PLACAR_CASA", placarA)
        outState?.putInt("PLACAR_FORA", placarB)
    }

}
