from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class SkillConfigUpdateForm:
    """技能用户配置更新参数"""
    config: Dict[str, Any] = None
