package id.bolasepak.sepakbola.ui.favorite

import id.bolasepak.sepakbola.data.db.entities.EventFavorite


interface ClickListener {
    fun onClickListener(eventFavorite: EventFavorite)
}