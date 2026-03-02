from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class OperationHistoryVO:
    created_at: str = None
    updated_at: str = None
    id: str = None
    action: str = None
    description: str = None
    target_type: str = None
    target_id: str = None
    target_name: str = None
    result: str = None
    operation_time: str = None
    ip_address: str = None
    user_agent: str = None
