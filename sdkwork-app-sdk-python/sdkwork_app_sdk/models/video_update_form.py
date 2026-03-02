from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class VideoUpdateForm:
    """更新视频表单"""
    title: str = None
    description: str = None
