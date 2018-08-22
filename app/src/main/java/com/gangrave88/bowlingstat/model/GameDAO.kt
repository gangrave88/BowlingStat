package com.gangrave88.bowlingstat.model

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy
import android.arch.persistence.room.Query
import io.reactivex.Observable

@Dao
interface GameDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(gane: Game)

    @Query("SELECT * from Game")
    fun getGames(): Observable<List<Game>>

    @Query("SELECT * FROM GAME WHERE date = :date")
    fun getGame(date: Double): Observable<Game>
}