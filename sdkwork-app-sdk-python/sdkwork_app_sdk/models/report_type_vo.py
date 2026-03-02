from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ReportTypeVO:
    """报告类型VO"""
    created_at: str = None
    updated_at: str = None
    report_type_id: str = None
    report_name: str = None
    report_type: str = None
    description: str = None
    enabled: bool = None
    icon: str = None
