from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusApiResultVideoAuditVO:
    """API调用结果"""
    data: VideoAuditVO
    code: str
    msg: str
    request_id: str
    ip: str = None
    hostname: str = None
    error_name: str
