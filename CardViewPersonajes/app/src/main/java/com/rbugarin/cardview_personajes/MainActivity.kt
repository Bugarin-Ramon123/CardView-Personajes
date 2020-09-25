package com.rbugarin.cardview_personajes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.card_personajes.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        val personajesAdapter = personajesAdapter(createPersonajes())
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = personajesAdapter
        personajesAdapter. notifyDataSetChanged()
    }

    fun createPersonajes(): List<Personaje>{
        val personajes = mutableListOf<Personaje>()
        personajes.add(
            Personaje(
                R.drawable.ic_crash,
                "Crash Bandicoot",
                "Es un Bandicoot que vive en N. Sanity Island, fue capturado por el Doctor Neo Cortex, para convertirse en el general de las Tropas Mutantes del Comando de Cortex como parte de su malvado plan para conquistar el mundo. Pero la maquina lo rechazo y asi logro escapar."
            )
        )
        personajes.add(
            Personaje(
                R.drawable.ic_akuaku,
                "Aku Aku",
                "Después de que Crash huye de Cortex y regresa a N. Sanity Beach, libera a Aku Aku, quien proporciona sus servicios mágicos durante toda su aventura."
            )
        )
        personajes.add(
            Personaje(
                R.drawable.ic_dr_neo_cortex,
                "Dr. Neo Cortex",
                "Es un cientifico malvado que busca conquistar el mundo con un ejercito de animales mutados de la fauna australiana."
            )
        )
        return personajes
    }
}