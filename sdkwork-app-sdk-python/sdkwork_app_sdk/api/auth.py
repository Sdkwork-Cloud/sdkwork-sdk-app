from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import LoginForm, OAuthAuthUrlForm, OAuthLoginForm, PasswordResetForm, PasswordResetRequestForm, PhoneLoginForm, PlusApiResultLoginVO, PlusApiResultOAuthUrlVO, PlusApiResultQrCodeStatusVO, PlusApiResultQrCodeVO, PlusApiResultUserInfoVO, PlusApiResultVerifyResultVO, PlusApiResultVoid, QrCodeConfirmForm, RegisterForm, TokenRefreshForm, VerifyCodeCheckForm, VerifyCodeSendForm

class AuthApi:
    """auth API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def verify_sms_code(self, body: VerifyCodeCheckForm) -> PlusApiResultVerifyResultVO:
        """验证验证码"""
        return self._client.post(f"/app/v3/api/auth/sms/verify", json=body)

    def send_sms_code(self, body: VerifyCodeSendForm) -> PlusApiResultVoid:
        """发送验证码"""
        return self._client.post(f"/app/v3/api/auth/sms/send", json=body)

    def register(self, body: RegisterForm) -> PlusApiResultUserInfoVO:
        """用户注册"""
        return self._client.post(f"/app/v3/api/auth/register", json=body)

    def refresh_token(self, body: TokenRefreshForm) -> PlusApiResultLoginVO:
        """刷新令牌"""
        return self._client.post(f"/app/v3/api/auth/refresh", json=body)

    def generate_qr_code(self) -> PlusApiResultQrCodeVO:
        """生成登录二维码"""
        return self._client.post(f"/app/v3/api/auth/qr/generate")

    def confirm_qr_code_login(self, body: QrCodeConfirmForm) -> PlusApiResultVoid:
        """确认二维码登录"""
        return self._client.post(f"/app/v3/api/auth/qr/confirm", json=body)

    def phone_login(self, body: PhoneLoginForm) -> PlusApiResultLoginVO:
        """手机号验证码登录"""
        return self._client.post(f"/app/v3/api/auth/phone/login", json=body)

    def reset_password(self, body: PasswordResetForm) -> PlusApiResultVoid:
        """重置密码"""
        return self._client.post(f"/app/v3/api/auth/password/reset", json=body)

    def request_password_reset_challenge(self, body: PasswordResetRequestForm) -> PlusApiResultVoid:
        """Request password reset challenge"""
        return self._client.post(f"/app/v3/api/auth/password/reset/request", json=body)

    def get_oauth_url(self, body: OAuthAuthUrlForm) -> PlusApiResultOAuthUrlVO:
        """OAuth授权URL"""
        return self._client.post(f"/app/v3/api/auth/oauth/url", json=body)

    def oauth_login(self, body: OAuthLoginForm) -> PlusApiResultLoginVO:
        """OAuth登录"""
        return self._client.post(f"/app/v3/api/auth/oauth/login", json=body)

    def logout(self) -> PlusApiResultVoid:
        """用户登出"""
        return self._client.post(f"/app/v3/api/auth/logout")

    def login(self, body: LoginForm) -> PlusApiResultLoginVO:
        """用户登录"""
        return self._client.post(f"/app/v3/api/auth/login", json=body)

    def check_qr_code_status(self, qrKey: str) -> PlusApiResultQrCodeStatusVO:
        """检查二维码状态"""
        return self._client.get(f"/app/v3/api/auth/qr/status/{qrKey}")

    def qr_code_entry(self, qrKey: str) -> None:
        """二维码统一入口"""
        return self._client.get(f"/app/v3/api/auth/qr/entry/{qrKey}")
