/**
 * Created by Ilia Shelkovenko on 16.01.2021.
 */

package ru.skillbranch.sbdelivery

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber

@HiltAndroidApp
class SBDeliveryApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }
}