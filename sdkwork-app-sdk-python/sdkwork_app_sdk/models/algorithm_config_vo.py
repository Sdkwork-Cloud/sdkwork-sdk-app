from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class AlgorithmConfigVO:
    """算法配置响应"""
    created_at: str = None
    updated_at: str = None
    algorithm_type: str = None
    algorithm_params: Any = None
    version: str = None
