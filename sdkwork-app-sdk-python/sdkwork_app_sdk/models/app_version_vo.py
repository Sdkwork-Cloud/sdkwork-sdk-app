from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class AppVersionVO:
    """应用版本响应"""
    created_at: str = None
    updated_at: str = None
    current_version: str = None
    latest_version: str = None
    update_required: bool = None
    force_update: bool = None
    update_description: str = None
    update_url: str = None
    update_size: str = None
    release_date: int = None
