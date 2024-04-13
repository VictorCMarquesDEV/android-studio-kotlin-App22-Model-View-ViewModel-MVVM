package com.example.app22

class PersonRepository {

    fun login(email: String, password: String): Boolean {
        return (email == "admin" && password == "1234")
    }

}