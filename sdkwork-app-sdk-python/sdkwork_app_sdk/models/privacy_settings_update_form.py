from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PrivacySettingsUpdateForm:
    """更新隐私设置请求"""
    data_collection_enabled: bool = None
    personalized_recommendations_enabled: bool = None
    third_party_analytics_enabled: bool = None
    notifications_enabled: bool = None
    usage_data_sharing_enabled: bool = None
    auto_save_enabled: bool = None
    data_retention_days: int = None
    ai_learning_enabled: bool = None
