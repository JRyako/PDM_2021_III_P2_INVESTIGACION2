package hn.edu.ujcv.pdm_2021_iii_p2_investigacion2.ui.main

import androidx.lifecycle.ViewModel
import java.math.BigDecimal
import java.text.DecimalFormat
import kotlin.math.roundToInt

class MainViewModel : ViewModel() {
    val VALOR = 0.30
    private var valorText1 = ""
    private var valorText2 = ""
    private var total1: Double = 0.0
    var total2: Double = 0.0


    fun setValor1(valor1:String){
        this.valorText1 = valor1
        total1 = (valor1.toDouble().roundToInt() / VALOR)
    }
    fun getTotal1(): Int {
        return total1.toInt()
    }


    fun setValor2(valor2:String){
        this.valorText2 = valor2
        total2 = (valor2.toDouble().roundToInt() * VALOR)
    }
    fun getTotal2(): BigDecimal {
        return total2.toBigDecimal()
    }
}