from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusApiResultFavoriteDetailVO:
    """API调用结果"""
    data: FavoriteDetailVO
    code: str
    msg: str
    request_id: str
    ip: str = None
    hostname: str = None
    error_name: str
