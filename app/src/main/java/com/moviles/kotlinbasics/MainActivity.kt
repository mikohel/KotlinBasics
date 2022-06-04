package com.moviles.kotlinbasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val const : String = "es una constante"
        val a: Int = 1
        var b = 2
        b = 3
        Log.i("basics", "el valor de b es = $b ")
        Log.i("basics", const)
        Log.d("basics", "d")
        Log.w("basics", "w")
        Log.e("basics", "e")
        ejemploSwitch()
        ejemploIf(1)
        ejemploFor()
        ejemploWhile()
    }

    fun ejemploSwitch(){

        val x = 1
        when (x){

            1 -> {  Log.i("basics", "Es un uno")  }
            2 -> {
                val algo = "miko"
                val otro = "chido"
                Log.i("basics",algo + otro)
            }
            else -> Log.i("basics","No coincide")
        }

    }

    fun ejemploIf(a: Int): Boolean{
        var array= arrayOf(1,2,3,4,5)
        if (a in array)
            return true
        else
            return false
    }

    fun ejemploFor(){
        var array= arrayOf(1,2,3,4,5)
        for (numero in array){
            Log.i("basics", numero.toString())
        }
    }

    fun ejemploWhile(){
        var x = 0
        while(x < 5){
            Log.i("basics", x.toString())
            x++
        }
        do{
            Log.i("basics", x.toString())
            x++
        }
        while (x < 5)
    }
}