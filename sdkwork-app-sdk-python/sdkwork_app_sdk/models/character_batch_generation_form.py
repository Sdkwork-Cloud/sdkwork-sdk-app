from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class CharacterBatchGenerationForm:
    """批量角色生成请求"""
    characters: List[CharacterItem]
    model: str = None
