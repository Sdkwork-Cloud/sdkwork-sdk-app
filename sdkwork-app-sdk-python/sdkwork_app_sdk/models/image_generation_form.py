from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ImageGenerationForm:
    """图片生成请求"""
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
    width: int = None
    height: int = None
    size: str = None
    quality: str = None
    style: str = None
    format: str = None
    cfg_scale: float = None
    steps: int = None
    sampler: str = None
    strength: float = None
    mask_assets: List[AssetMediaResource] = None
    safety_checker: bool = None
    aspect_ratio: str = None
    type: str = None
    reference_asset_count: int = None
