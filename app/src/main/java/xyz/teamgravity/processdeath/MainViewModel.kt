package xyz.teamgravity.processdeath

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel

class MainViewModel(
    private val handle: SavedStateHandle
) : ViewModel() {

    var counter by mutableStateOf(handle["counter"] ?: 0)
        private set

    fun onCount() {
        counter++
        handle["counter"] = counter
    }
}