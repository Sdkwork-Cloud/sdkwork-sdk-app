package com.sdkwork.app

data class TreeNodePath(
    val nodes: List<PathNode>? = null,
    val level: Int? = null,
    val depth: Int? = null,
    val pathIds: List<Int>? = null,
    val pathName: String? = null,
    val parentNode: PathNode? = null,
    val rootNode: PathNode? = null,
    val currentNode: PathNode? = null
)
