from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class SettingsUpdateForm:
    """更新模块设置请求"""
    settings: Dict[str, Any] = None
    module: str = None
    overwrite: bool = None
