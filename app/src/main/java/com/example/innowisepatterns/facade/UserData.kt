package com.example.innowisepatterns.facade

data class UserData(val name: String, val email: String){
    override fun toString(): String {
        return "$name, email: $email"
    }
}