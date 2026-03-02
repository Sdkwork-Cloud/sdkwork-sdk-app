from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ExportVO:
    """导出响应"""
    created_at: str = None
    updated_at: str = None
    task_id: str = None
    file_url: str = None
    file_name: str = None
    file_size: int = None
    status: str = None
    format: str = None
    export_count: int = None
    expire_time: str = None
