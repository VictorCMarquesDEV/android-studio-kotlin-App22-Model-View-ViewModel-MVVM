package com.example.app22

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private val personRepository = PersonRepository()
    private var login = MutableLiveData<String>()

    fun login(): LiveData<String> {
        return login
    }

    fun doLogin(email: String, password: String) {
        if (email.isNotEmpty() && password.isNotEmpty()) {
            if (personRepository.login(email, password)) {
                login.value = "Login OK"
            } else {
                login.value = "Login ERROR"
            }
        } else {
            login.value = "Campos não preenchidos corretamente"
        }
    }
}