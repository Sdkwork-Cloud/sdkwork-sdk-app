from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class MaintenanceNoticeVO:
    created_at: str = None
    updated_at: str = None
    notice_id: str = None
    title: str = None
    content: str = None
    start_time: str = None
    end_time: str = None
    status: str = None
    maintenance_type: str = None
    affected_services: str = None
    contact_info: str = None
    is_emergency: bool = None
