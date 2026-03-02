from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ChannelAnalysisVO:
    """渠道分析VO"""
    created_at: str = None
    updated_at: str = None
    channel_id: str = None
    channel_name: str = None
    channel_type: str = None
    click_count: int = None
    install_count: int = None
    active_count: int = None
    conversion_rate: float = None
    cost_per_install: float = None
    roi: float = None
