from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class VoiceListQueryForm:
    """语音列表查询请求"""
    language: str = None
    gender: str = None
    style: str = None
    age_range: str = None
