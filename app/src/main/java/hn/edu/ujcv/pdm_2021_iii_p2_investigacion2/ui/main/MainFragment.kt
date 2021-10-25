package hn.edu.ujcv.pdm_2021_iii_p2_investigacion2.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.util.rangeTo
import hn.edu.ujcv.pdm_2021_iii_p2_investigacion2.R
import kotlinx.android.synthetic.main.main_fragment.*

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        // TODO: Use the ViewModel

        txvResultado1.text = viewModel.getTotal1().toString()
        btnNota.setOnClickListener {
            cerotothirty()
        }

        txvResultado2.text = viewModel.getTotal2().toString()
        btnPromedio.setOnClickListener {
            cerotohundred()
        }
    }


    fun cerotothirty(){
        if ( txtNota.text.toString() >= 0.toString() && txtNota.text.toString() <= 30.toString() ) {
            viewModel.setValor1(txtNota.text.toString())
            txvResultado1.text = viewModel.getTotal1().toString()
        } else if ( txtNota.text.toString().isEmpty()){
            txtNota.setError("No puede Calcular un campo vacio")
        } else {
            txtNota.setError("Rango invalido, debe ser un valor entre 0 y 30")
            txtNota.setText("")
        }
    }

    fun cerotohundred(){
        if ( txtPromedio.text.toString() >= 0.toString() && txtPromedio.text.toString() <= 100.toString()) {
            viewModel.setValor2(txtPromedio.text.toString())
            txvResultado2.text = viewModel.getTotal2().toString()
        } else if ( txtPromedio.text.toString().isEmpty()){
            txtPromedio.setError("No puede Calcular un campo vacio")
        } else {
            txtPromedio.setError("Rango invalido, debe ser un valor entre 0 y 100")
            txtPromedio.setText("")
        }
    }

}
