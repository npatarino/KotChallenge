package com.idealista.kotchallenge.usecase

import com.idealista.kotchallenge.domain.business.Characters
import com.idealista.kotchallenge.domain.repository.CharacterRepository

class GetCharactersUseCase(private val characterRepository: CharacterRepository) {

  fun execute(): Characters = characterRepository.getAll()

}