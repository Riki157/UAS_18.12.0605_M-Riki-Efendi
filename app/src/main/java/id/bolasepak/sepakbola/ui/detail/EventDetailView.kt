package id.bolasepak.sepakbola.ui.detail



import id.bolasepak.sepakbola.data.model.EventDetail as EventDetail1

interface EventDetailView{
    fun showLoading()
    fun hideLoading()
    fun showEventDetail(data: List<EventDetail1>)
}

