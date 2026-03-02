package com.sdkwork.app

data class TreeNodePath(
    val nodes: List<PathNode>? = null,
    val level: Int? = null,
    val depth: Int? = null,
    val pathName: String? = null,
    val rootNode: PathNode? = null,
    val parentNode: PathNode? = null,
    val pathIds: List<Int>? = null,
    val currentNode: PathNode? = null
)
