from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ShareVerifyVO:
    """分享验证响应"""
    created_at: str = None
    updated_at: str = None
    valid: bool = None
    error_message: str = None
    share_info: ShareInfoVO = None
