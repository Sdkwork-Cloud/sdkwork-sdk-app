from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ModelInfoDetailVO:
    """Model detail response"""
    created_at: str = None
    updated_at: str = None
    model_id: str = None
    model_key: str = None
    model: str = None
    vendor_model: str = None
    name: str = None
    description: str = None
    channel: str = None
    vendor: str = None
    model_type: str = None
    family: str = None
    version: str = None
    open_source: bool = None
    api_endpoint: str = None
    owned_by: str = None
    scenes: SceneContent = None
    tags: TagsContent = None
    limit_info: ModelLimitInfo = None
    price_info: ModelPrice = None
    metadata: ModelMetadata = None
    product_support_info: Dict[str, Any] = None
    price_rules: List[ModelPriceVO] = None
    default_temperature: float = None
    default_top_p: float = None
    default_frequency_penalty: float = None
    default_presence_penalty: float = None
    status: str = None
    usage_count: int = None
    total_tokens: int = None
    avg_response_time: int = None
