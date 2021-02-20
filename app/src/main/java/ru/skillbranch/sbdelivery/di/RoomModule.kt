package ru.skillbranch.sbdelivery.di

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import ru.skillbranch.sbdelivery.data.local.database.dao.SbDeliveryDao
import ru.skillbranch.sbdelivery.data.local.database.SbDeliveryDatabase
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object RoomModule {

    @Singleton
    @Provides
    fun provideSBDeliveryDb(@ApplicationContext context: Context): SbDeliveryDatabase {
        return Room.databaseBuilder(
            context,
            SbDeliveryDatabase::class.java,
            SbDeliveryDatabase.DATABASE_NAME
        )
            .fallbackToDestructiveMigration()
            .build()
    }

    @Singleton
    @Provides
    fun provideSBDeliveryDao(sbDeliveryDb: SbDeliveryDatabase): SbDeliveryDao {
        return sbDeliveryDb.sbDeliveryDao()
    }
}
