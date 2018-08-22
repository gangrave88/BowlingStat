package com.gangrave88.bowlingstat.model

import android.arch.persistence.room.Entity
import android.arch.persistence.room.ForeignKey
import android.arch.persistence.room.PrimaryKey

@Entity(foreignKeys = arrayOf(ForeignKey(entity = Game::class,
        parentColumns = arrayOf("date"),
        childColumns = arrayOf("dateOfGame"),
        onDelete = ForeignKey.CASCADE)))

data class Frame(
        @PrimaryKey(autoGenerate = true) var id: Int,
        var numFrame: Int,
        var dateOfGame: Double,
        var score: Int
)