from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class DetectionTypeConfig:
    """检测类型配置"""
    type: str = None
    name: str = None
    enabled: bool = None
    sensitivity: str = None
    threshold: float = None
