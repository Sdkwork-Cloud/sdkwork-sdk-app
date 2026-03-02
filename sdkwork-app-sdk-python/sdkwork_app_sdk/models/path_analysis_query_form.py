from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PathAnalysisQueryForm:
    """路径分析查询请求"""
    start_date: str = None
    end_date: str = None
    start_page: str = None
    end_page: str = None
    max_steps: int = None
    device_type: str = None
    os_type: str = None
