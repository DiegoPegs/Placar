package br.com.diegohcc.placar.ui.placaraac

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import br.com.diegohcc.placar.R
import kotlinx.android.synthetic.main.activity_placar_aac.*

class PlacarAACActivity : AppCompatActivity() {

    lateinit var placarAACViewModel: PlacarAACViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_placar_aac)
        placarAACViewModel = ViewModelProviders
                .of(this)
                .get(placarAACViewModel::class.java)

        registraObservers()

        btTresPontosTimeA.setOnClickListener {
            placarAACViewModel.adicionaPontoTimeA(3)
        }
        btDoisPontosTimeA.setOnClickListener {
            placarAACViewModel.adicionaPontoTimeA(2)
        }
        btUmPontoTimeA.setOnClickListener {
            placarAACViewModel.adicionaPontoTimeA(1)
        }

        btTresPontosTimeB.setOnClickListener {
            placarAACViewModel.adicionaPontoTimeB(3)
        }
        btDoisPontosTimeB.setOnClickListener {
            placarAACViewModel.adicionaPontoTimeB(2)
        }
        btUmPontoTimeB.setOnClickListener {
            placarAACViewModel.adicionaPontoTimeB(1)
        }

        btReiniciar.setOnClickListener{
            placarAACViewModel.reiniciarJogo()

        }


    }

    private fun registraObservers() {
        placarAACViewModel.placarA.observe(this, Observer {
            tvPlacarTimeA.text = it.toString()
        })

        placarAACViewModel.placarB.observe(this, Observer {
            tvPlacarTimeB.text = it.toString()
        })
    }
}
