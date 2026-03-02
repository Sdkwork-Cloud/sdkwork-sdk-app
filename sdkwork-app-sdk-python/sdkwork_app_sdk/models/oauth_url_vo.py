from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class OAuthUrlVO:
    """OAuth授权URL响应"""
    created_at: str = None
    updated_at: str = None
    auth_url: str = None
