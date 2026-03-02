from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ImageEditForm:
    """图片编辑请求"""
    title: str = None
    prompt: str
    negative_prompt: str = None
    model: str
    channel: str = None
    reference_assets: List[AssetMediaResource] = None
    n: int = None
    seed: int = None
    async: bool = None
    callback_url: str = None
    extra_params: Dict[str, Any] = None
    biz_scene: str = None
    biz_id: int = None
    conversation_id: int = None
    message_id: int = None
    mask_assets: List[AssetMediaResource] = None
    strength: float = None
    format: str = None
    type: str = None
    reference_asset_count: int = None
