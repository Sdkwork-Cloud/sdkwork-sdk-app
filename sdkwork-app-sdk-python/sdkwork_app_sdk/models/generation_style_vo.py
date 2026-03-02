from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class GenerationStyleVO:
    """生成风格响应"""
    created_at: str = None
    updated_at: str = None
    style_id: str = None
    name: str = None
    description: str = None
    type: str = None
    is_public: bool = None
    status: str = None
    usage_count: int = None
    cover_image_url: str = None
