from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusApiResultSkuStatisticsVO:
    """API调用结果"""
    data: SkuStatisticsVO
    code: str
    msg: str
    request_id: str
    ip: str = None
    hostname: str = None
    error_name: str
