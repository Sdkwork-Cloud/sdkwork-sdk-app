from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PasswordResetRequestForm:
    account: str
    channel: str
    device_id: str = None
    locale: str = None
    redirect_uri: str = None
