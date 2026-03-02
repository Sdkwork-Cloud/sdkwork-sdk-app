from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class InviteRulesVO:
    title: str = None
    description: str = None
    inviter_reward: int = None
    invitee_reward: int = None
    rules: List[str] = None
