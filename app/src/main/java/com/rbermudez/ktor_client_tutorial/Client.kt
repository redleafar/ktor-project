package com.rbermudez.ktortutorial

import io.ktor.client.*
import io.ktor.client.request.*
import io.ktor.client.statement.*

class Client {

    suspend fun main() {
        val client = HttpClient()
        val response: HttpResponse = client.get("https://ktor.io")
        println(response.status)
        client.close()
    }
}