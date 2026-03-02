from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class GenerationStyleDetailVO:
    """生成风格详情响应"""
    created_at: str = None
    updated_at: str = None
    style_id: str = None
    name: str = None
    description: str = None
    type: str = None
    config_params: Dict[str, Any] = None
    tags: TagsContent = None
    cover_image: ImageMediaResource = None
    assets: AssetMediaResourceList = None
    preview_image: ImageMediaResource = None
    is_public: bool = None
    status: str = None
    usage_count: int = None
