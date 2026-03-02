from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class AppDetailVO:
    """应用详情响应"""
    created_at: str = None
    updated_at: str = None
    app_id: str = None
    name: str = None
    description: str = None
    icon: ImageMediaResource = None
    icon_url: str = None
    access_url: str = None
    version: str = None
    app_type: str = None
    status: str = None
    project_id: int = None
    platforms: AppPlatforms = None
    package_name: str = None
    bundle_id: str = None
    store_url: str = None
    download_url: str = None
