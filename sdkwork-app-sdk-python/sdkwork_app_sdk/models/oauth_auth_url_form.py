from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class OAuthAuthUrlForm:
    """获取OAuth授权URL请求"""
    provider: str
    redirect_uri: str = None
    scope: str = None
    state: str = None
