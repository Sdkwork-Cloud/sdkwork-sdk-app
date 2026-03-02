from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class DownloadUrlVO:
    """下载链接响应"""
    created_at: str = None
    updated_at: str = None
    resource: AssetMediaResource = None
    expires_in: int = None
