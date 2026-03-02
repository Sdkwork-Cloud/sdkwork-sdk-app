from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class VoiceSpeakerListQueryForm:
    """说话人列表查询请求"""
    gender: str = None
    language: str = None
    style: str = None
    age_range: str = None
    page_num: int = None
    page_size: int = None
    only_favorite: bool = None
