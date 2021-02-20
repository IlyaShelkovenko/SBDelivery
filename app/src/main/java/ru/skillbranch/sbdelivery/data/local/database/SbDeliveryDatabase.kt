/**
 * Created by Ilia Shelkovenko on 16.01.2021.
 */

package ru.skillbranch.sbdelivery.data.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import ru.skillbranch.sbdelivery.data.local.database.entities.Categories
import ru.skillbranch.sbdelivery.data.local.database.dao.SbDeliveryDao

@Database(entities = [Categories::class], version = 1, exportSchema = false)
abstract class SbDeliveryDatabase : RoomDatabase(){
    abstract fun sbDeliveryDao() : SbDeliveryDao

    companion object {
        val DATABASE_NAME = "sb_delivery_db"
    }
}
