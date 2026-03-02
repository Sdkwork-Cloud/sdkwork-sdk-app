from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ExperimentAssignmentVO:
    """实验分组响应"""
    created_at: str = None
    updated_at: str = None
    experiment_key: str = None
    variant_key: str = None
    variant_name: str = None
    assignment_reason: str = None
    assignment_params: Dict[str, Any] = None
