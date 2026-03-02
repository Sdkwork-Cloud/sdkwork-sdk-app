from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class LoginHistoryQueryForm:
    """登录历史查询请求"""
    page_num: int = None
    page_size: int = None
    sort_field: str = None
    sort_direction: str = None
    login_type: str = None
    device_type: str = None
    status: str = None
    ip_address: str = None
    start_time: str = None
    end_time: str = None
    size: int = None
    page: int = None
