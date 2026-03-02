from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class MusicSimilarForm:
    """生成相似音乐请求"""
    reference_url: str
    duration: int = None
    model: str = None
