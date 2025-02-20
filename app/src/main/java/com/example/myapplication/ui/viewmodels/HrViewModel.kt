package com.example.myapplication.ui.viewmodels

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class HrViewModel: ViewModel() {
    var ageInput by mutableStateOf("")

    // Переопределяем геттер для поля age, чтобы избежать пустых значений
    private val age: Int
        get() {
            return ageInput.toIntOrNull() ?: -1 // Если строка пустая или некорректная, будет возвращаться -1
        }

    val upper: Float
        get() {
            // Вычисляем только если возраст валидный и больше -1
            return if (age >= 0) {
                (220 - age) * 0.85f
            } else {
                -1.0f // Возвращаем -1, если возраст некорректный
            }
        }

    val lower: Float
        get() {
            return if (age >= 0) {
                (220 - age) * 0.65f
            } else {
                -1.0f // Возвращаем -1, если возраст некорректный
            }
        }
}
