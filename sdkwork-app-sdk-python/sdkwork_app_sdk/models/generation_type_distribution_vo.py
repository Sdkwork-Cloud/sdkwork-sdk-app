from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class GenerationTypeDistributionVO:
    """生成类型分布"""
    text: float = None
    image: float = None
    audio: float = None
    video: float = None
    code: float = None
