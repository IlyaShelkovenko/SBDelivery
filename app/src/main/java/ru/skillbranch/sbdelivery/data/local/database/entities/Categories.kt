/**
 * Created by Ilia Shelkovenko on 17.01.2021.
 */

package ru.skillbranch.sbdelivery.data.local.database.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Categories(
    @PrimaryKey
    val id: String,
    val active: Boolean,
    @ColumnInfo(name = "created_at")
    val createdAt: Long,
    val icon: String,
    val name: String,
    val order: Int,
    val parent: Int,
    @ColumnInfo(name = "updated_at")
    val updatedAt: Long
)