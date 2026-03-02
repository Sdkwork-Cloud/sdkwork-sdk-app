from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class VipPrivilegeVO:
    """VIP特权"""
    id: str = None
    name: str = None
    description: str = None
    icon: str = None
    status: str = None
    type: str = None
