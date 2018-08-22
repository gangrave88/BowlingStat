package com.gangrave88.bowlingstat.model

import android.arch.persistence.room.Entity
import android.arch.persistence.room.ForeignKey
import android.arch.persistence.room.PrimaryKey

@Entity(foreignKeys = arrayOf(ForeignKey(entity = Frame::class,
        parentColumns = arrayOf("id"),
        childColumns = arrayOf("idFrame"),
        onDelete = ForeignKey.CASCADE)))

class Throw(
        @PrimaryKey(autoGenerate = true) var id: Int,
        var idFrame: Int,
        var score: Int
)