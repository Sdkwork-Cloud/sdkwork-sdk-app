from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class FrequencyStats:
    """频率统计"""
    current_frequency: int = None
    avg_frequency: int = None
    limit: int = None
    excess_ratio: float = None
