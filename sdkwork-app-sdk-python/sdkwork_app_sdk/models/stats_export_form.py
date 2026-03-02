from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class StatsExportForm:
    """统计导出请求"""
    report_type: str
    start_date: str = None
    end_date: str = None
    format: str = None
    email: str = None
    device_type: str = None
    os_type: str = None
