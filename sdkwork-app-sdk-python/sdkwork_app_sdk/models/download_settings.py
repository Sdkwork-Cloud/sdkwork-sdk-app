from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class DownloadSettings:
    """下载设置"""
    download_path: str = None
    wifi_only: bool = None
    auto_download: bool = None
    max_concurrent: int = None
