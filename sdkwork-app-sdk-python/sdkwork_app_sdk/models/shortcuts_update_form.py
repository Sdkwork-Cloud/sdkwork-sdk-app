from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ShortcutsUpdateForm:
    """更新快捷方式请求"""
    shortcuts: List[ShortcutItemForm]
