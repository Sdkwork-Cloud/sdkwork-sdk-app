from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class SharePosterForm:
    """生成分享海报请求"""
    share_type: str = None
    share_id: str = None
    template: str = None
    background_color: str = None
    text_color: str = None
    include_qr_code: bool = None
    custom_text: str = None
