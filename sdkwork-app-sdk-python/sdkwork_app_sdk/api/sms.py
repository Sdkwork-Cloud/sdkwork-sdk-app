from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultVerifyResultVO, PlusApiResultVoid, VerifyCodeCheckForm, VerifyCodeSendForm

class SmsApi:
    """sms API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def verify_sms_code(self, body: VerifyCodeCheckForm) -> PlusApiResultVerifyResultVO:
        """验证验证码"""
        return self._client.post(f"/app/v3/api/auth/sms/verify", json=body)

    def send_sms_code(self, body: VerifyCodeSendForm) -> PlusApiResultVoid:
        """发送验证码"""
        return self._client.post(f"/app/v3/api/auth/sms/send", json=body)
