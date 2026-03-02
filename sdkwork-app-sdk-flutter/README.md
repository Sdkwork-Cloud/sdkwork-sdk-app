# sdkwork-app-sdk (Flutter)

Professional Flutter SDK for SDKWork API.

## Installation

Add to `pubspec.yaml`:

```yaml
dependencies:
  app_sdk: ^1.0.0
```

## Quick Start

```dart
import 'package:app_sdk/app_sdk.dart';
import 'package:sdkwork_common_flutter/sdkwork_common_flutter.dart';

final client = SdkworkAppClient(
  config: SdkConfig(
    baseUrl: 'http://localhost:8080',
  ),
);
client.setApiKey('your-api-key');

// Use the SDK
final result = await client.tenant.getTenantTypes();
print(result);
```

## Authentication Modes (Mutually Exclusive)

Choose exactly one mode for the same client instance.

### Mode A: API Key

```dart
final client = SdkworkAppClient.withBaseUrl(baseUrl: 'http://localhost:8080');
client.setApiKey('your-api-key');
// Sends: Authorization: Bearer <apiKey>
```

### Mode B: Dual Token

```dart
final client = SdkworkAppClient.withBaseUrl(baseUrl: 'http://localhost:8080');
client.setAuthToken('your-auth-token');
client.setAccessToken('your-access-token');
// Sends:
// Authorization: Bearer <authToken>
// Access-Token: <accessToken>
```

> Do not call `setApiKey(...)` together with `setAuthToken(...)` + `setAccessToken(...)` on the same client.

## Configuration (Non-Auth)

```dart
final client = SdkworkAppClient.withBaseUrl(baseUrl: 'http://localhost:8080');

// Set custom headers
client.setHeader('X-Custom-Header', 'value');
```

## API Modules

- `client.workspaces` - workspaces API
- `client.voiceSpeakers` - voice_speakers API
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
- `client.fileSystem` - file_system API
- `client.feedback` - feedback API
- `client.favorite` - favorite API
- `client.drive` - drive API
- `client.appDocuments` - app_documents API
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
- `client.voiceSpeaker` - voice_speaker API
- `client.soundEffect` - sound_effect API
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

## Usage Examples

### workspaces

```dart
// 获取工作空间详情
final result = await client.workspaces.getWorkspaceDetail();
print(result);
```

### voice_speakers

```dart
// 获取发音人详情
final result = await client.voiceSpeakers.getSpeakerDetail();
print(result);
```

### video

```dart
// 获取视频详情
final result = await client.video.getVideo();
print(result);
```

### settings

```dart
// 获取用户设置
final result = await client.settings.getUser();
print(result);
```

### profile

```dart
// 获取用户信息
final result = await client.profile.getUser();
print(result);
```

### password

```dart
// 修改密码
final result = await client.password.change();
print(result);
```

### address

```dart
// 获取地址详情
final result = await client.address.getAddressDetail();
print(result);
```

### tenant

```dart
// 获取租户详情
final result = await client.tenant.getTenant();
print(result);
```

### social

```dart
// 标记消息已读
final result = await client.social.markMessagesAsRead();
print(result);
```

### shops

```dart
// 获取店铺详情
final result = await client.shops.getShopDetail();
print(result);
```

### share

```dart
// 更新分享设置
final result = await client.share.updateShareSettings();
print(result);
```

### ai

```dart
// 获取提示语详情
final result = await client.ai.getPromptDetail();
print(result);
```

### projects

```dart
// 获取项目详情
final result = await client.projects.getProjectDetail();
print(result);
```

### partner

```dart
// 获取合作伙伴详情
final result = await client.partner.getPartner();
print(result);
```

### notification

```dart
// 标记已读
final result = await client.notification.markAsRead();
print(result);
```

### app

```dart
// 获取笔记详情
final result = await client.app.getNoteDetail();
print(result);
```

### news

```dart
// 获取新闻详情
final result = await client.news.getNews();
print(result);
```

### music

```dart
// 获取音乐详情
final result = await client.music.getMusic();
print(result);
```

### invoice

```dart
// 获取发票详情
final result = await client.invoice.getInvoice();
print(result);
```

### image

```dart
// 获取图片详情
final result = await client.image.getImage();
print(result);
```

### style

```dart
// 获取风格详情
final result = await client.style.getStyle();
print(result);
```

### file_system

```dart
// Rename node
final result = await client.fileSystem.renameNode();
print(result);
```

### feedback

```dart
// 关闭反馈
final result = await client.feedback.close();
print(result);
```

### favorite

```dart
// 移动收藏
final result = await client.favorite.moveFavoriteToFolder();
print(result);
```

### drive

```dart
// Rename drive item
final result = await client.drive.renameItem();
print(result);
```

### app_documents

```dart
// Get document detail
final result = await client.appDocuments.getDocumentDetail();
print(result);
```

### dashboard

```dart
// 完成待办
final result = await client.dashboard.completeTodoItem();
print(result);
```

### collection

```dart
// 获取合集详情
final result = await client.collection.getCollection();
print(result);
```

### chat

```dart
// 获取会话详情
final result = await client.chat.getSessionDetail();
print(result);
```

### character

```dart
// 获取角色详情
final result = await client.character.getCharacter();
print(result);
```

### category

```dart
// 获取分类详情
final result = await client.category.getCategoryDetail();
print(result);
```

### cart

```dart
// 更新购物车商品数量
final result = await client.cart.updateItemQuantity();
print(result);
```

### assets

```dart
// 重命名资产
final result = await client.assets.renameAsset();
print(result);
```

### announcement

```dart
// 标记已读
final result = await client.announcement.markAsRead();
print(result);
```

### advert

```dart
// 广告设置
final result = await client.advert.getAdvertSettings();
print(result);
```

### vote

```dart
// 投票
final result = await client.vote.vote();
print(result);
```

### vip

```dart
// 购买VIP
final result = await client.vip.purchase();
print(result);
```

### deactivate

```dart
// 注销账号
final result = await client.deactivate.account();
print(result);
```

### bind

```dart
// 绑定第三方账号
final result = await client.bind.thirdPartyAccount();
print(result);
```

### avatar

```dart
// 上传头像
final result = await client.avatar.upload();
print(result);
```

### upload

```dart
// 获取上传策略
final result = await client.upload.getUploadPolicy();
print(result);
```

### search

```dart
// 搜索历史
final result = await client.search.getSearchHistory();
print(result);
```

### payments

```dart
// 创建支付
final result = await client.payments.createPayment();
print(result);
```

### organization

```dart
// 创建组织
final result = await client.organization.createOrganization();
print(result);
```

### disable

```dart
// 禁用组织
final result = await client.disable.organization();
print(result);
```

### activate

```dart
// 激活组织
final result = await client.activate.organization();
print(result);
```

### position

```dart
// 创建岗位
final result = await client.position.createPosition();
print(result);
```

### department

```dart
// 创建部门
final result = await client.department.createDepartment();
print(result);
```

### orders

```dart
// 获取订单列表
final result = await client.orders.listOrders();
print(result);
```

### models

```dart
// 批量获取模型价格
final result = await client.models.getModelPrices();
print(result);
```

### history

```dart
// 浏览历史
final result = await client.history.listBrowse();
print(result);
```

### voice_speaker

```dart
// 创建语音生成任务
final result = await client.voiceSpeaker.createGeneration();
print(result);
```

### sound_effect

```dart
// 创建音效生成任务
final result = await client.soundEffect.createGeneration();
print(result);
```

### audio

```dart
// 语音克隆
final result = await client.audio.voiceClone();
print(result);
```

### feed

```dart
// 取消点赞Feed
final result = await client.feed.unlike();
print(result);
```

### currency

```dart
// 创建货币
final result = await client.currency.createCurrency();
print(result);
```

### coupons

```dart
// 领取优惠券
final result = await client.coupons.receiveCoupon();
print(result);
```

### comments

```dart
// 发表评论
final result = await client.comments.createComment();
print(result);
```

### sms

```dart
// 验证验证码
final result = await client.sms.verifySmsCode();
print(result);
```

### register

```dart
// 用户注册
final result = await client.register.register();
print(result);
```

### refresh

```dart
// 刷新令牌
final result = await client.refresh.token();
print(result);
```

### qr

```dart
// 生成登录二维码
final result = await client.qr.generateQrCode();
print(result);
```

### phone

```dart
// 手机号验证码登录
final result = await client.phone.login();
print(result);
```

### oauth

```dart
// OAuth授权URL
final result = await client.oauth.getOauthUrl();
print(result);
```

### logout

```dart
// 用户登出
final result = await client.logout.logout();
print(result);
```

### login

```dart
// 用户登录
final result = await client.login.login();
print(result);
```

### audit

```dart
// 审核申诉
final result = await client.audit.submitAppeal();
print(result);
```

### analytics

```dart
// 上报页面访问
final result = await client.analytics.trackPageView();
print(result);
```

### activity

```dart
// 参与活动
final result = await client.activity.join();
print(result);
```

### account

```dart
// 积分转账
final result = await client.account.transfer();
print(result);
```

### ab

```dart
// 实验反馈
final result = await client.ab.submitExperimentFeedback();
print(result);
```

### sku

```dart
// 获取SKU详情
final result = await client.sku.getSkuDetail();
print(result);
```

### products

```dart
// 获取商品列表
final result = await client.products.getProducts();
print(result);
```

### positions

```dart
// 获取组织的岗位列表
final result = await client.positions.getPositionsByOrg();
print(result);
```

### members

```dart
// 获取组织成员
final result = await client.members.getMembersByOrg();
print(result);
```

### departments

```dart
// 获取组织的部门列表
final result = await client.departments.getDepartmentsByOrg();
print(result);
```

### children

```dart
// 获取子组织
final result = await client.children.getChildOrganizations();
print(result);
```

### statistics

```dart
// 获取组织统计
final result = await client.statistics.getOrganization();
print(result);
```

### member

```dart
// 获取成员详情
final result = await client.member.getMember();
print(result);
```

### list

```dart
// 获取组织列表
final result = await client.list.getOrganization();
print(result);
```

### code

```dart
// 根据编码获取组织
final result = await client.code.getOrganizationBy();
print(result);
```

## Error Handling

```dart
try {
  final result = await client.tenant.getTenantTypes();
} catch (e) {
  print('Error: $e');
}
```


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

> Ensure `dart pub publish --dry-run` passes before release publish.

## License

MIT
