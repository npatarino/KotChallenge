package com.idealista.kotchallenge.data

import com.idealista.kotchallenge.domain.business.Character
import java.net.URL
import com.google.gson.Gson

class NetCharacterDatasource {

  private val URL_CHARACTERS = "https://project-8424324399725905479.firebaseio.com/characters.json?print=pretty"

  fun getAll() : List<Character>{
    val readText = URL(URL_CHARACTERS).readText()
    val characters: List<Character> = Gson().fromJson(readText, genericType<List<Character>>())
    return characters
  }

}