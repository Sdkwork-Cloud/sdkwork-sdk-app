from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PrivilegeVO:
    """等级特权"""
    privilege_id: str = None
    name: str = None
    description: str = None
    icon: str = None
    type: str = None
    status: str = None
