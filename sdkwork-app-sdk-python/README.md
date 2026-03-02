# sdkwork-app-sdk (Python)

Professional Python SDK for SDKWork API.

## Installation

```bash
pip install sdkwork-app-sdk
```

## Quick Start

```python
from sdkwork_app_sdk import SdkworkAppClient, SdkConfig

config = SdkConfig(
    base_url="http://localhost:8080",
)

client = SdkworkAppClient(config)
client.set_api_key("your-api-key")

# Use the SDK
result = client.tenant.get_tenant_types()
```

## Authentication Modes (Mutually Exclusive)

Choose exactly one mode for the same client instance.

### Mode A: API Key

```python
config = SdkConfig(base_url="http://localhost:8080")
client = SdkworkAppClient(config)
client.set_api_key("your-api-key")
# Sends: Authorization: Bearer <apiKey>
```

### Mode B: Dual Token

```python
config = SdkConfig(base_url="http://localhost:8080")
client = SdkworkAppClient(config)
client.set_auth_token("your-auth-token")
client.set_access_token("your-access-token")
# Sends:
# Authorization: Bearer <authToken>
# Access-Token: <accessToken>
```

> Do not call `set_api_key(...)` together with `set_auth_token(...)` + `set_access_token(...)` on the same client.

## API Modules

- `client.workspaces` - workspaces API
- `client.voice_speakers` - voice_speakers API
- `client.video` - video API
- `client.settings` - settings API
- `client.profile` - profile API
- `client.password` - password API
- `client.address` - address API
- `client.tenant` - tenant API
- `client.social` - social API
- `client.shops` - shops API
- `client.share` - share API
- `client.ai` - ai API
- `client.projects` - projects API
- `client.partner` - partner API
- `client.notification` - notification API
- `client.app` - app API
- `client.news` - news API
- `client.music` - music API
- `client.invoice` - invoice API
- `client.image` - image API
- `client.style` - style API
- `client.file_system` - file_system API
- `client.feedback` - feedback API
- `client.favorite` - favorite API
- `client.drive` - drive API
- `client.app_documents` - app_documents API
- `client.dashboard` - dashboard API
- `client.collection` - collection API
- `client.chat` - chat API
- `client.character` - character API
- `client.category` - category API
- `client.cart` - cart API
- `client.assets` - assets API
- `client.announcement` - announcement API
- `client.advert` - advert API
- `client.vote` - vote API
- `client.vip` - vip API
- `client.deactivate` - deactivate API
- `client.bind` - bind API
- `client.avatar` - avatar API
- `client.upload` - upload API
- `client.search` - search API
- `client.payments` - payments API
- `client.organization` - organization API
- `client.disable` - disable API
- `client.activate` - activate API
- `client.position` - position API
- `client.department` - department API
- `client.orders` - orders API
- `client.models` - models API
- `client.history` - history API
- `client.voice_speaker` - voice_speaker API
- `client.sound_effect` - sound_effect API
- `client.audio` - audio API
- `client.feed` - feed API
- `client.currency` - currency API
- `client.coupons` - coupons API
- `client.comments` - comments API
- `client.sms` - sms API
- `client.register` - register API
- `client.refresh` - refresh API
- `client.qr` - qr API
- `client.phone` - phone API
- `client.oauth` - oauth API
- `client.logout` - logout API
- `client.login` - login API
- `client.audit` - audit API
- `client.analytics` - analytics API
- `client.activity` - activity API
- `client.account` - account API
- `client.ab` - ab API
- `client.sku` - sku API
- `client.products` - products API
- `client.positions` - positions API
- `client.members` - members API
- `client.departments` - departments API
- `client.children` - children API
- `client.statistics` - statistics API
- `client.member` - member API
- `client.list` - list API
- `client.code` - code API


## Publishing

This SDK includes cross-platform publish scripts in `bin/`:
- `bin/publish-core.mjs`
- `bin/publish.sh`
- `bin/publish.ps1`

### Check

```bash
./bin/publish.sh --action check
```

### Publish

```bash
./bin/publish.sh --action publish --channel release
```

```powershell
.\bin\publish.ps1 --action publish --channel test --dry-run
```

> Set `PYPI_TOKEN` for release (or `TEST_PYPI_TOKEN` for test channel).

## License

MIT
