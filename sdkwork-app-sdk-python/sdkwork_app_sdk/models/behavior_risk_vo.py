from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class BehaviorRiskVO:
    """行为风险检测响应"""
    created_at: str = None
    updated_at: str = None
    user_id: str = None
    behavior_type: str = None
    risk_level: str = None
    risk_score: int = None
    anomalies: List[AnomalyPattern] = None
    frequency_stats: FrequencyStats = None
    suggestion: str = None
    restrictions: List[str] = None
