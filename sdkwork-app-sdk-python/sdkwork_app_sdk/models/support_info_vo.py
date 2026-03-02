from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class SupportInfoVO:
    """支持信息"""
    created_at: str = None
    updated_at: str = None
    hotline: str = None
    email: str = None
    working_hours: str = None
    wechat_qrcode: str = None
    online_support_url: str = None
    faq_url: str = None
    help_center_url: str = None
