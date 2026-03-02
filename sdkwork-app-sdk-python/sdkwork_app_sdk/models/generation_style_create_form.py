from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class GenerationStyleCreateForm:
    """创建生成风格表单"""
    name: str
    description: str = None
    type: str
    config_params: Dict[str, Any] = None
    is_public: bool = None
