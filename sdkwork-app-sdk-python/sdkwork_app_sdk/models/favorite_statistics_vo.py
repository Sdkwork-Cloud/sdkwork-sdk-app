from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class FavoriteStatisticsVO:
    created_at: str = None
    updated_at: str = None
    total_count: int = None
    folder_count: int = None
    monthly_added: int = None
    last_favorited_time: str = None
    count_by_type: Dict[str, int] = None
