package com.sdkwork.app

data class SceneContent(
    val scenes: List<String>? = null,
    val children: List<SceneContent>? = null
)
