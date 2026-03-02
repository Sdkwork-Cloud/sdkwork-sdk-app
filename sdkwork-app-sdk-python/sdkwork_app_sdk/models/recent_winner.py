from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class RecentWinner:
    """最近中奖者"""
    nickname: str = None
    prize_name: str = None
    win_time: str = None
