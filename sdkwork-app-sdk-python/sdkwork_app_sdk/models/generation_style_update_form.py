from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class GenerationStyleUpdateForm:
    """更新生成风格表单"""
    name: str = None
    description: str = None
    config_params: Dict[str, Any] = None
