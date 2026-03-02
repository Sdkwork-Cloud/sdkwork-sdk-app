from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ImageToVideoForm:
    """图生视频请求"""
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
    duration: int = None
    width: int = None
    height: int = None
    format: str = None
    motion_strength: int = None
    camera_motion: str = None
    audio_urls: List[str] = None
    type: str = None
    reference_asset_count: int = None
