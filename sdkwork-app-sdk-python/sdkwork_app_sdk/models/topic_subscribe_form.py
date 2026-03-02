from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class TopicSubscribeForm:
    """主题订阅表单"""
    topic: str
    subscribe: bool = None
    device_id: str = None
