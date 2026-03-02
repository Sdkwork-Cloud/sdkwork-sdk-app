package com.sdkwork.app

data class TodoItemVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: String? = null,
    val title: String? = null,
    val description: String? = null,
    val status: String? = null,
    val priority: String? = null,
    val dueDate: String? = null,
    val createTime: String? = null,
    val updateTime: String? = null,
    val completedAt: String? = null,
    val creator: String? = null,
    val assignee: String? = null,
    val resourceId: String? = null,
    val resourceType: String? = null,
    val tags: List<String>? = null,
    val progress: Int? = null,
    val reminderTime: String? = null
)
