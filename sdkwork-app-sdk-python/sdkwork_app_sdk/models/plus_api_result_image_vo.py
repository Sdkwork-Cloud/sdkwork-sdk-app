from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusApiResultImageVO:
    """API调用结果"""
    data: ImageVO
    code: str
    msg: str
    request_id: str
    ip: str = None
    hostname: str = None
    error_name: str
