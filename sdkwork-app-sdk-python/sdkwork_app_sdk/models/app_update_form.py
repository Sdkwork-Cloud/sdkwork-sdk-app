from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class AppUpdateForm:
    """更新应用表单"""
    name: str = None
    description: str = None
    access_url: str = None
    version: str = None
    icon_url: str = None
    config: AppConfig = None
    platforms: AppPlatforms = None
    install_platforms: AppPlatforms = None
    install_skill: AppInstallSkill = None
    install_config: AppInstallConfig = None
    package_name: str = None
    bundle_id: str = None
    store_url: str = None
    download_url: str = None
