from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class DataExportForm:
    """导出用户数据请求"""
    format: str = None
    data_type: str = None
    include_media: bool = None
    start_time: str = None
    end_time: str = None
    email: str = None
