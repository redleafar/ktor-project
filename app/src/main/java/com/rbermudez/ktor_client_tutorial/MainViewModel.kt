package com.rbermudez.ktor_client_tutorial

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.rbermudez.ktortutorial.Client
import kotlinx.coroutines.launch

class MainViewModel: ViewModel() {

    fun makeCall() {
        val client = Client()

        viewModelScope.launch {
            client.main()
        }
    }
}