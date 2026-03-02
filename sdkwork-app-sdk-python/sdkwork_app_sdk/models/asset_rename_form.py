from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class AssetRenameForm:
    """资产重命名请求"""
    name: str
