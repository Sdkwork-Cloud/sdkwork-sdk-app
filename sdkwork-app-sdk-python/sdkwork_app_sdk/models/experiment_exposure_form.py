from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ExperimentExposureForm:
    """实验曝光事件请求"""
    experiment_key: str
    variant_key: str = None
    exposure_context: Any = None
