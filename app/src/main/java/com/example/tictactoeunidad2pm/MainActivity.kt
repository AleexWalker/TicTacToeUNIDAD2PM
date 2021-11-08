package com.example.tictactoeunidad2pm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintSet
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var turnoJugador : Int = 0
        button10.isEnabled = false

        button.setOnClickListener {
            if (turnoJugador % 2 == 0) {
                button.setText("X")
                comprobarTresEnRayaX()
            }
            if (turnoJugador % 2 != 0) {
                button.setText("O")
                comprobarTresEnRayaY()
            }
            turnoJugador++
            button.isClickable = false
        }

        button2.setOnClickListener {
            if (turnoJugador % 2 == 0) {
                button2.setText("X")
                comprobarTresEnRayaX()
            }
            if (turnoJugador % 2 != 0) {
                button2.setText("O")
                comprobarTresEnRayaY()
            }
            turnoJugador++
            button2.isClickable = false
        }

        button3.setOnClickListener {
            if (turnoJugador % 2 == 0) {
                button3.setText("X")
                comprobarTresEnRayaX()
            }
            if (turnoJugador % 2 != 0) {
                button3.setText("O")
                comprobarTresEnRayaY()
            }
            turnoJugador++
            button3.isClickable = false
        }

        button4.setOnClickListener {
            if (turnoJugador % 2 == 0) {
                button4.setText("X")
                comprobarTresEnRayaX()
            }
            if (turnoJugador % 2 != 0) {
                button4.setText("O")
                comprobarTresEnRayaY()
            }
            turnoJugador++
            button4.isClickable = false
        }

        button5.setOnClickListener {
            if (turnoJugador % 2 == 0) {
                button5.setText("X")
                comprobarTresEnRayaX()
            }
            if (turnoJugador % 2 != 0) {
                button5.setText("O")
                comprobarTresEnRayaY()
            }
            turnoJugador++
            button5.isClickable = false
        }

        button6.setOnClickListener {
            if (turnoJugador % 2 == 0) {
                button6.setText("X")
                comprobarTresEnRayaX() }
            if (turnoJugador % 2 != 0) {
                button6.setText("O")
                comprobarTresEnRayaY()
            }
            turnoJugador++
            button6.isClickable = false
        }

        button7.setOnClickListener {
            if (turnoJugador % 2 == 0) {
                button7.setText("X")
                comprobarTresEnRayaX()
            }
            if (turnoJugador % 2 != 0) {
                button7.setText("O")
                comprobarTresEnRayaY() }
            turnoJugador++
            button7.isClickable = false
        }

        button8.setOnClickListener {
            if (turnoJugador % 2 == 0) {
                button8.setText("X")
                comprobarTresEnRayaX()
            }
            if (turnoJugador % 2 != 0) {
                button8.setText("O")
                comprobarTresEnRayaY()
            }
            turnoJugador++
            button8.isClickable = false
        }

        button9.setOnClickListener {
            if (turnoJugador % 2 == 0) {
                button9.text = "X"
                comprobarTresEnRayaX() }
            if (turnoJugador % 2 != 0) {
                button9.text = "O"
                comprobarTresEnRayaY() }
            turnoJugador++
            button9.isClickable = false
        }

        button10.setOnClickListener {
            button.text = "" ; button2.text = "" ; button3.text = "" ; button4.text = "" ; button5.text = "" ; button6.text = "" ; button7.text = "" ; button8.text = "" ; button9.text = "" ;
            button.isClickable = true ; button2.isClickable = true ; button3.isClickable = true ; button4.isClickable = true ; button5.isClickable = true ; button6.isClickable = true ; button7.isClickable = true ; button8.isClickable = true ; button9.isClickable = true ;
            Toast.makeText(this, "¡Partida Nueva!", Toast.LENGTH_SHORT).show()
            textView2.text = ""
        }
    }

    private fun comprobarTresEnRayaX() {
            if (button.text == "X" && button2.text == "X" && button3.text == "X" || button4.text == "X" && button5.text == "X" && button6.text == "X" || button7.text == "X" && button8.text == "X" && button9.text == "X") {
                textView2.text = "¡Enhorabuena ha ganado el JUGADOR 1!"
                disableButtons()
                button10.isEnabled = true
            }
            if (button.text == "X" && button4.text == "X" && button7.text == "X" || button2.text == "X" && button5.text == "X" && button8.text == "X" || button3.text == "X" && button6.text == "X" && button9.text == "X") {
                textView2.text = "¡Enhorabuena ha ganado el JUGADOR 1!"
                disableButtons()
                button10.isEnabled = true
            }
            if (button.text == "X" && button5.text == "X" && button9.text == "X" || button3.text == "X" && button5.text == "X" && button6.text == "X") {
                textView2.text = "¡Enhorabuena ha ganado el JUGADOR 1!"
                disableButtons()
                button10.isEnabled = true
            }
    }

    private fun comprobarTresEnRayaY() {
            if (button.text == "O" && button2.text == "O" && button3.text == "O" || button4.text == "O" && button5.text == "O" && button6.text == "O" || button7.text == "O" && button8.text == "O" && button9.text == "O") {
                textView2.text = "¡Enhorabuena ha ganado el JUGADOR 2!"
                disableButtons()
                button10.isEnabled = true
            }

            if (button.text == "O" && button4.text == "O" && button7.text == "O" || button2.text == "O" && button5.text == "O" && button8.text == "O" || button3.text == "O" && button6.text == "O" && button9.text == "O") {
                textView2.text = "¡Enhorabuena ha ganado el JUGADOR 2!"
                disableButtons()
                button10.isEnabled = true
            }

            if (button.text == "O" && button5.text == "O" && button9.text == "O" || button3.text == "O" && button5.text == "O" && button6.text == "O") {
                textView2.text = "¡Enhorabuena ha ganado el JUGADOR 2!"
                disableButtons()
                button10.isEnabled = true
            }
    }
    fun disableButtons() {
        button.isClickable = false ; button2.isClickable = false ; button3.isClickable = false ;
        button4.isClickable = false ; button5.isClickable = false ; button6.isClickable = false ;
        button7.isClickable = false ; button8.isClickable = false ; button9.isClickable = false ;
    }
}
