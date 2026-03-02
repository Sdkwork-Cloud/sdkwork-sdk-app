from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ExperimentVO:
    """实验响应"""
    created_at: str = None
    updated_at: str = None
    experiment_key: str = None
    experiment_name: str = None
    experiment_description: str = None
    status: str = None
