from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class AdvertReportForm:
    """广告举报请求"""
    advert_id: str
    report_type: str
    reason: str
    screenshot_url: str = None
    device_id: str = None
    ip_address: str = None
