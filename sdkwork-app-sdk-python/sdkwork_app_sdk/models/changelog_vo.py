from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ChangelogVO:
    """更新日志响应"""
    created_at: str = None
    updated_at: str = None
    version: str = None
    release_date: str = None
    title: str = None
    features: List[str] = None
    bug_fixes: List[str] = None
    improvements: List[str] = None
    status: str = None
    download_url: str = None
