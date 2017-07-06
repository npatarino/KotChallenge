package com.idealista.kotchallenge.domain.business

data class Characters(private val characters: List<Character> = listOf()) : Iterable<Character> {
  override fun iterator() = characters.iterator()
}