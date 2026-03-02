from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PromptHistoryVO:
    """AI提示语使用历史响应"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    prompt_id: int = None
    prompt_title: str = None
    prompt_content: str = None
    used_content: str = None
    response_content: str = None
    model: str = None
    duration: int = None
    input_tokens: int = None
    output_tokens: int = None
    success: bool = None
    error_message: str = None
