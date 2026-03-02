from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class LoginHistoryVO:
    created_at: str = None
    updated_at: str = None
    id: str = None
    login_time: str = None
    ip_address: str = None
    location: str = None
    device: str = None
    browser: str = None
    os: str = None
    login_method: str = None
    status: str = None
    result: str = None
    failure_reason: str = None
