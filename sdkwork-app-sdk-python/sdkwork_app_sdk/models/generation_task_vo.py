from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class GenerationTaskVO:
    """生成任务响应"""
    created_at: str = None
    updated_at: str = None
    task_id: int = None
    request_id: str = None
    type: str = None
    model: str = None
    channel: str = None
    status: str = None
    progress: int = None
    input_params: GenerationInput = None
    output_result: GenerationOutput = None
    cost: float = None
    error_code: str = None
    error_message: str = None
    retry_count: int = None
    max_retry: int = None
    started_at: str = None
    completed_at: str = None
    conversation_id: int = None
    message_id: int = None
    parent_id: int = None
    batch_id: str = None
    biz_scene: str = None
    biz_id: int = None
    done: bool = None
