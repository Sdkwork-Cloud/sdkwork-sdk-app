from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ExperimentFeedbackForm:
    """实验反馈请求"""
    experiment_key: str
    feedback_type: str = None
    feedback_content: str = None
    rating: int = None
