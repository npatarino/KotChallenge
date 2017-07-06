package com.idealista.kotchallenge.domain.repository

import com.idealista.kotchallenge.domain.business.Characters


interface CharacterRepository {

  fun getAll(): Characters

}