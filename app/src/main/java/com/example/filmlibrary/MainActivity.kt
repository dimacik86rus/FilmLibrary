package com.example.filmlibrary

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_man)

    }

    fun OnKlicButtonMeny(view: View) {
        Toast.makeText(this, "Тут скоро будет меню", Toast.LENGTH_SHORT).show()
    }

    fun OnKlicButtonLike(view: View) {
        Toast.makeText(this, "Тут скоро будет избранное", Toast.LENGTH_SHORT).show()
    }

    fun OnKlicButtonViewed(view: View) {
        Toast.makeText(this, "Тут скоро будет просмотренное", Toast.LENGTH_SHORT).show()
    }
}
