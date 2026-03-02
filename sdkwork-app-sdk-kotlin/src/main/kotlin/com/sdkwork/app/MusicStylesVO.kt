package com.sdkwork.app

data class MusicStylesVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val genres: List<GenreVO>? = null,
    val styles: List<StyleVO>? = null,
    val moods: List<MoodVO>? = null,
    val instruments: List<InstrumentVO>? = null
)
