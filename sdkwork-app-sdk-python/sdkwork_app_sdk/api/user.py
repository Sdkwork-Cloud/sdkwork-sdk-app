from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import AccountDeactivateForm, PasswordChangeForm, PlusApiResultListUserAddressVO, PlusApiResultMapStringString, PlusApiResultPageMapStringObject, PlusApiResultUserAddressVO, PlusApiResultUserProfileVO, PlusApiResultUserSettingsVO, PlusApiResultVoid, ThirdPartyBindForm, UploadAvatarRequest, UserAddressCreateForm, UserAddressUpdateForm, UserProfileUpdateForm, UserSettingsUpdateForm

class UserApi:
    """user API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def get_user_settings(self) -> PlusApiResultUserSettingsVO:
        """获取用户设置"""
        return self._client.get(f"/app/v3/api/user/settings")

    def update_user_settings(self, body: UserSettingsUpdateForm) -> PlusApiResultUserSettingsVO:
        """更新用户设置"""
        return self._client.put(f"/app/v3/api/user/settings", json=body)

    def get_user_profile(self) -> PlusApiResultUserProfileVO:
        """获取用户信息"""
        return self._client.get(f"/app/v3/api/user/profile")

    def update_user_profile(self, body: UserProfileUpdateForm) -> PlusApiResultUserProfileVO:
        """更新用户信息"""
        return self._client.put(f"/app/v3/api/user/profile", json=body)

    def change_password(self, body: PasswordChangeForm) -> PlusApiResultVoid:
        """修改密码"""
        return self._client.put(f"/app/v3/api/user/password", json=body)

    def get_address_detail(self, addressId: str) -> PlusApiResultUserAddressVO:
        """获取地址详情"""
        return self._client.get(f"/app/v3/api/user/address/{addressId}")

    def update_address(self, addressId: str, body: UserAddressUpdateForm) -> PlusApiResultUserAddressVO:
        """更新地址"""
        return self._client.put(f"/app/v3/api/user/address/{addressId}", json=body)

    def delete_address(self, addressId: str) -> PlusApiResultVoid:
        """删除地址"""
        return self._client.delete(f"/app/v3/api/user/address/{addressId}")

    def set_default_address(self, addressId: str) -> PlusApiResultUserAddressVO:
        """设置默认地址"""
        return self._client.put(f"/app/v3/api/user/address/{addressId}/default")

    def deactivate_account(self, body: AccountDeactivateForm) -> PlusApiResultVoid:
        """注销账号"""
        return self._client.post(f"/app/v3/api/user/deactivate", json=body)

    def bind_third_party_account(self, platform: str, body: ThirdPartyBindForm) -> PlusApiResultVoid:
        """绑定第三方账号"""
        return self._client.post(f"/app/v3/api/user/bind/{platform}", json=body)

    def unbind_third_party_account(self, platform: str) -> PlusApiResultVoid:
        """解绑第三方账号"""
        return self._client.delete(f"/app/v3/api/user/bind/{platform}")

    def upload_avatar(self, body: Optional[UploadAvatarRequest] = None) -> PlusApiResultMapStringString:
        """上传头像"""
        return self._client.post(f"/app/v3/api/user/avatar", json=body)

    def list_addresses(self) -> PlusApiResultListUserAddressVO:
        """获取地址列表"""
        return self._client.get(f"/app/v3/api/user/address")

    def create_address(self, body: UserAddressCreateForm) -> PlusApiResultUserAddressVO:
        """创建地址"""
        return self._client.post(f"/app/v3/api/user/address", json=body)

    def get_login_history(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageMapStringObject:
        """获取登录历史"""
        return self._client.get(f"/app/v3/api/user/history/login", params=params)

    def get_generation_history(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageMapStringObject:
        """获取生成历史"""
        return self._client.get(f"/app/v3/api/user/history/generations", params=params)

    def get_default_address(self) -> PlusApiResultUserAddressVO:
        """获取默认地址"""
        return self._client.get(f"/app/v3/api/user/address/default")
