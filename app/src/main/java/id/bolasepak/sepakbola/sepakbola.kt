package id.bolasepak.sepakbola

import android.app.Application


import id.bolasepak.sepakbola.data.db.AppDatabase
import id.bolasepak.sepakbola.data.pref.PrefManager
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.android.x.androidXModule

class sepakbola : Application(), KodeinAware {

    override val kodein = Kodein.lazy {
        import(androidXModule(this@sepakbola))

    }

    companion object {
        @get:Synchronized
        lateinit var instance: sepakbola
        lateinit var prefManager: PrefManager
        lateinit var db: AppDatabase

    }

    override fun onCreate() {
        super.onCreate()
        instance = this
        prefManager = PrefManager(this)
        db = AppDatabase(this)
    }
}