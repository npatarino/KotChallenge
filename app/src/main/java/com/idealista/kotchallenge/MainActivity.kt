package com.idealista.kotchallenge

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.idealista.kotchallenge.adapter.CharacterAdapter
import com.idealista.kotchallenge.data.NetCharacterDatasource
import com.idealista.kotchallenge.data.repository.CharacterDataRepository
import com.idealista.kotchallenge.usecase.GetCharactersUseCase
import kotlinx.android.synthetic.main.activity_main.recyclerView
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.toast
import org.jetbrains.anko.uiThread


class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    recyclerView.layoutManager = LinearLayoutManager(this)
    doAsync {
      val netCharacterDatasource = NetCharacterDatasource()
      val characterDataRepository = CharacterDataRepository(netCharacterDatasource)
      val getCharactersUsecase = GetCharactersUseCase(characterDataRepository)
      val characters = getCharactersUsecase.execute()
      uiThread {
        recyclerView.adapter = CharacterAdapter(characters)
      }
    }
  }

}
