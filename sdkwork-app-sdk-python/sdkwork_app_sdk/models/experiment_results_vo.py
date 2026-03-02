from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ExperimentResultsVO:
    """实验结果响应"""
    created_at: str = None
    updated_at: str = None
    experiment_key: str = None
    results: List[Dict[str, Any]] = None
    statistics: Dict[str, Any] = None
    status: str = None
    generated_at: str = None
