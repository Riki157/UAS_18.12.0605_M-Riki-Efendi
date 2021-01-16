package id.bolasepak.sepakbola.ui.detail

import com.google.gson.Gson
import id.bolasepak.sepakbola.data.api.ApiRepository
import id.bolasepak.sepakbola.data.api.TheSportDBApi
import id.bolasepak.sepakbola.data.model.EventDetailResponse


import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread

class EventDetailPresenter(private val view: EventDetailView,
                           private val apiRepository: ApiRepository,
                           private val gson: Gson){

    fun getEventDetail(eventId: String?){
        view.showLoading()
        doAsync {
            val data = gson.fromJson(apiRepository
                    .doRequest(TheSportDBApi.getEventDetail(eventId)),
                    EventDetailResponse::class.java
            )

            uiThread {
                view.run {
                    hideLoading()
                    showEventDetail(data.events)
                }
            }
        }
    }
}