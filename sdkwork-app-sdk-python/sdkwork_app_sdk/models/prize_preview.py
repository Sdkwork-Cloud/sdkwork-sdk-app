from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PrizePreview:
    """奖品预览"""
    name: str = None
    image: str = None
    is_grand_prize: bool = None
