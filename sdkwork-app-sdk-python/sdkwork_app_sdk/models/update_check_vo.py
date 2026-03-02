from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class UpdateCheckVO:
    created_at: str = None
    updated_at: str = None
    has_update: bool = None
    latest_version: str = None
    current_version: str = None
    download_url: str = None
    update_type: str = None
    title: str = None
    description: str = None
    file_size: int = None
    force_update: bool = None
