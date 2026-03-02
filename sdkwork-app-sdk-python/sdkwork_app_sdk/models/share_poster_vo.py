from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class SharePosterVO:
    """分享海报响应"""
    created_at: str = None
    updated_at: str = None
    poster_url: str = None
    width: int = None
    height: int = None
    file_size: str = None
