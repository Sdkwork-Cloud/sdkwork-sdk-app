from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class MemberRoleUpdateForm:
    """成员角色更新请求"""
    workspace_id: str = None
    member_id: str = None
    user_id: str = None
    new_role_id: str = None
    new_role_name: str = None
    permissions: List[str] = None
    update_reason: str = None
    need_notify: bool = None
