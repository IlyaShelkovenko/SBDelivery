/**
 * Created by Ilia Shelkovenko on 16.01.2021.
 */

package ru.skillbranch.sbdelivery.database

import androidx.room.Database
import androidx.room.RoomDatabase
import ru.skillbranch.sbdelivery.data.local.Categories

@Database(entities = [Categories::class], version = 1, exportSchema = false)
abstract class SbDeliveryDatabase : RoomDatabase(){
    abstract fun sbDeliveryDao() : SbDeliveryDao

    companion object {
        val DATABASE_NAME = "sb_delivery_db"
    }
}
