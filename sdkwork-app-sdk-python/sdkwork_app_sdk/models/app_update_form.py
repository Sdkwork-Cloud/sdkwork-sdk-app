from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class AppUpdateForm:
    """更新应用表单"""
    name: str = None
    description: str = None
    access_url: str = None
