from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ErrorTrackForm:
    """错误追踪请求"""
    error_type: str
    error_message: str
    stack_trace: str = None
    device_id: str = None
    user_id: str = None
    app_version: str = None
    device_model: str = None
    os_version: str = None
    context: str = None
    error_time: str = None
