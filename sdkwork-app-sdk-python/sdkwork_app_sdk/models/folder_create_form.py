from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class FolderCreateForm:
    """文件夹创建请求"""
    name: str
    parent_id: str = None
