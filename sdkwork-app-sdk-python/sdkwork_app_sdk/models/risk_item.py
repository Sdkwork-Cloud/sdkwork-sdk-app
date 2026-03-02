from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class RiskItem:
    """风险项"""
    type: str = None
    name: str = None
    description: str = None
    level: str = None
    confidence: float = None
