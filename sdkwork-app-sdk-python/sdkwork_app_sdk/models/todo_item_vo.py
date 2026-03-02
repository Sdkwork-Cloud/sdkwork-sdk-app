from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class TodoItemVO:
    """待办事项响应"""
    created_at: str = None
    updated_at: str = None
    id: str = None
    title: str = None
    description: str = None
    status: str = None
    priority: str = None
    due_date: str = None
    create_time: str = None
    update_time: str = None
    completed_at: str = None
    creator: str = None
    assignee: str = None
    resource_id: str = None
    resource_type: str = None
    tags: List[str] = None
    progress: int = None
    reminder_time: str = None
