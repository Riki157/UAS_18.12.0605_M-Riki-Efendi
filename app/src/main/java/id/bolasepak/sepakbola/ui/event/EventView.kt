package id.bolasepak.sepakbola.ui.event

import id.bolasepak.sepakbola.data.model.Event


interface EventView{
    fun showLoading()
    fun hideLoading()
    fun showEventList(data: List<Event>)
}