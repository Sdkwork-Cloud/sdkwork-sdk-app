from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class DataExportVO:
    """数据导出响应"""
    created_at: str = None
    updated_at: str = None
    task_id: str = None
    status: str = None
    download_url: str = None
    file_size: str = None
    estimated_completion_time: str = None
    progress: int = None
    error_message: str = None
