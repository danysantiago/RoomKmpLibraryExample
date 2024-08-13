package com.example.data

import androidx.room.ConstructedBy
import androidx.room.Database
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.RoomDatabase
import androidx.room.RoomDatabaseConstructor

@Database(entities = [MyEntity::class], version = 1, exportSchema = true)
@ConstructedBy(MyDatabaseCtor::class)
abstract class MyDatabase : RoomDatabase()

@Entity
data class MyEntity(
    @PrimaryKey val id: Int,
)

expect object MyDatabaseCtor : RoomDatabaseConstructor<MyDatabase>