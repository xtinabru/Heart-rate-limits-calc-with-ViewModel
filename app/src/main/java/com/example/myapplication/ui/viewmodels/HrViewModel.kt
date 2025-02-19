package com.example.myapplication.ui.viewmodels

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class HrViewModel: ViewModel() {
    var ageInput by mutableStateOf("")

    private val age: Int
        get() {
            return ageInput.toIntOrNull()?:0
        }

    val upper: Float
        get() {
            val result: Float =
                if (age >= 0) {
                    (220 - age) * 0.85f
                } else {
                    0.0f
                }
            return result
        }

    val lower: Float
        get() {
            val result: Float =
                if (age >= 0) {
                    (220 - age) * 0.65f
                } else {
                    0.0f
                }
            return result
        }
}
