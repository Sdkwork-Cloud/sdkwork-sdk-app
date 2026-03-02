from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultQrCodeStatusVO, PlusApiResultQrCodeVO, PlusApiResultVoid, QrCodeConfirmForm

class QrApi:
    """qr API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def generate_qr_code(self) -> PlusApiResultQrCodeVO:
        """生成登录二维码"""
        return self._client.post(f"/app/v3/api/auth/qr/generate")

    def confirm_qr_code_login(self, body: QrCodeConfirmForm) -> PlusApiResultVoid:
        """确认二维码登录"""
        return self._client.post(f"/app/v3/api/auth/qr/confirm", json=body)

    def check_qr_code_status(self, qrKey: str) -> PlusApiResultQrCodeStatusVO:
        """检查二维码状态"""
        return self._client.get(f"/app/v3/api/auth/qr/status/{qrKey}")
