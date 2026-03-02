from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class VipUpgradeVO:
    """VIP升级信息"""
    price: str = None
    target_level: str = None
    upgrade_url: str = None
    discount: str = None
