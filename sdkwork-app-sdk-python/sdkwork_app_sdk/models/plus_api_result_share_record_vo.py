from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusApiResultShareRecordVO:
    """API调用结果"""
    data: ShareRecordVO
    code: str
    msg: str
    request_id: str
    ip: str = None
    hostname: str = None
    error_name: str
