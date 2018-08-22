package com.gangrave88.bowlingstat.model

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity
data class Game(
        @PrimaryKey(autoGenerate = true) var date: Double,
        var totalScore: Int
)