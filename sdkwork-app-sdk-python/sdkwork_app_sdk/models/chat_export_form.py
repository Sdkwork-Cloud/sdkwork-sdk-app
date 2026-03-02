from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ChatExportForm:
    """导出对话请求"""
    format: str
    scope: str = None
    count: int = None
    include_thinking: bool = None
    include_system_messages: bool = None
    include_attachments: bool = None
    file_name: str = None
