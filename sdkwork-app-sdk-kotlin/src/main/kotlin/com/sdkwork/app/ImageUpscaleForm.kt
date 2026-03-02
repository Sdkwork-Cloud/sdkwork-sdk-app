package com.sdkwork.app

data class ImageUpscaleForm(
    val title: String? = null,
    val prompt: String? = null,
    val negativePrompt: String? = null,
    val model: String? = null,
    val channel: String? = null,
    val referenceAssets: List<AssetMediaResource>? = null,
    val n: Int? = null,
    val seed: Int? = null,
    val async: Boolean? = null,
    val callbackUrl: String? = null,
    val extraParams: Map<String, Any>? = null,
    val bizScene: String? = null,
    val bizId: Int? = null,
    val conversationId: Int? = null,
    val messageId: Int? = null,
    val scale: Int? = null,
    val targetWidth: Int? = null,
    val targetHeight: Int? = null,
    val format: String? = null,
    val type: String? = null,
    val referenceAssetCount: Int? = null
)
