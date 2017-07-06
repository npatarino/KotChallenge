package com.idealista.kotchallenge.adapter

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import android.widget.TextView
import com.idealista.kotchallenge.adapter.CharacterAdapter.CharacterViewHolder
import com.idealista.kotchallenge.domain.business.Characters

class CharacterAdapter(val characters: Characters) : RecyclerView.Adapter<CharacterViewHolder>() {

  override fun onBindViewHolder(viewHolder: CharacterViewHolder, position: Int) = with(characters.elementAt(position)) {
      viewHolder.tvName.text = name
  }

  override fun getItemCount(): Int = characters.count()

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharacterViewHolder = CharacterViewHolder(TextView(parent.context))

  class CharacterViewHolder(val tvName: TextView) : RecyclerView.ViewHolder(tvName)
}