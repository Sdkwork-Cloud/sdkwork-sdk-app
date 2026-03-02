from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ModelPriceVO:
    """模型价格响应"""
    created_at: str = None
    updated_at: str = None
    model: str = None
    unit: str = None
    currency: str = None
    price: float = None
    input_price: float = None
    output_price: float = None
    batch_input_price: float = None
    batch_output_price: float = None
    cached_input_price: float = None
    batch_cached_input_price: float = None
