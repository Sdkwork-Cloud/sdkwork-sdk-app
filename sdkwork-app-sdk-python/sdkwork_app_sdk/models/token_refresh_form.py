from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class TokenRefreshForm:
    """令牌刷新表单"""
    refresh_token: str
