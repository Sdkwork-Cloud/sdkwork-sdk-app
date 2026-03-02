from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class AssetMoveForm:
    """资产移动请求"""
    folder_id: str
