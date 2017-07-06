package com.idealista.kotchallenge.data.repository

import com.idealista.kotchallenge.data.NetCharacterDatasource
import com.idealista.kotchallenge.domain.business.Characters
import com.idealista.kotchallenge.domain.repository.CharacterRepository

class CharacterDataRepository (private val datasource: NetCharacterDatasource): CharacterRepository {

  override fun getAll(): Characters {
    val characters = Characters(datasource.getAll())
    return characters
  }
}