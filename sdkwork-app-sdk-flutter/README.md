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
final result = await client.user.getUserSettings();
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
- `client.voiceSpeaker` - voice_speaker API
- `client.video` - video API
- `client.user` - user API
- `client.tool` - tool API
- `client.tenant` - tenant API
- `client.social` - social API
- `client.skill` - skill API
- `client.shops` - shops API
- `client.share` - share API
- `client.settings` - settings API
- `client.ai` - ai API
- `client.projects` - projects API
- `client.products` - products API
- `client.partner` - partner API
- `client.notification` - notification API
- `client.notes` - notes API
- `client.news` - news API
- `client.music` - music API
- `client.knowledgeDocuments` - knowledge_documents API
- `client.invoice` - invoice API
- `client.image` - image API
- `client.style` - style API
- `client.fileSystem` - file_system API
- `client.feedback` - feedback API
- `client.favorite` - favorite API
- `client.drive` - drive API
- `client.documents` - documents API
- `client.dashboard` - dashboard API
- `client.collection` - collection API
- `client.chat` - chat API
- `client.character` - character API
- `client.category` - category API
- `client.cart` - cart API
- `client.assets` - assets API
- `client.app` - app API
- `client.announcement` - announcement API
- `client.agent` - agent API
- `client.advert` - advert API
- `client.wallet` - wallet API
- `client.vote` - vote API
- `client.vip` - vip API
- `client.upload` - upload API
- `client.search` - search API
- `client.rtc` - rtc API
- `client.payments` - payments API
- `client.organization` - organization API
- `client.orders` - orders API
- `client.model` - model API
- `client.history` - history API
- `client.soundEffect` - sound_effect API
- `client.generation` - generation API
- `client.audio` - audio API
- `client.feed` - feed API
- `client.currency` - currency API
- `client.coupons` - coupons API
- `client.comments` - comments API
- `client.auth` - auth API
- `client.audit` - audit API
- `client.analytics` - analytics API
- `client.agentMemory` - agent_memory API
- `client.activity` - activity API
- `client.account` - account API
- `client.ab` - ab API
- `client.sku` - sku API

## Usage Examples

### workspaces

```dart
// 获取工作空间详情
final result = await client.workspaces.getWorkspaceDetail();
print(result);
```

### voice_speaker

```dart
// 获取发音人详情
final result = await client.voiceSpeaker.getSpeakerDetail();
print(result);
```

### video

```dart
// 获取视频详情
final result = await client.video.getVideo();
print(result);
```

### user

```dart
// 获取用户设置
final result = await client.user.getUserSettings();
print(result);
```

### tool

```dart
// Update tool credentials
final result = await client.tool.updateCredentials();
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

### skill

```dart
// Get skill detail
final result = await client.skill.detail();
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

### settings

```dart
// 获取模块设置
final result = await client.settings.getModule();
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

### products

```dart
// 更新商品属性
final result = await client.products.updateProductAttribute();
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
// Mark notification as unread
final result = await client.notification.markAsUnread();
print(result);
```

### notes

```dart
// 获取笔记详情
final result = await client.notes.getNoteDetail();
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

### knowledge_documents

```dart
// Restore knowledge document
final result = await client.knowledgeDocuments.restoreKnowledgeDocument();
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
// Restore drive item
final result = await client.drive.restoreItem();
print(result);
```

### documents

```dart
// Get document detail
final result = await client.documents.getDocumentDetail();
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

### app

```dart
// 获取应用详情
final result = await client.app.getApp();
print(result);
```

### announcement

```dart
// 标记已读
final result = await client.announcement.markAsRead();
print(result);
```

### agent

```dart
// Get agent
final result = await client.agent.get();
print(result);
```

### advert

```dart
// 广告设置
final result = await client.advert.getAdvertSettings();
print(result);
```

### wallet

```dart
// 钱包提现
final result = await client.wallet.withdraw();
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

### rtc

```dart
// Create RTC room
final result = await client.rtc.createRoom();
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

### orders

```dart
// 获取订单列表
final result = await client.orders.listOrders();
print(result);
```

### model

```dart
// Batch get model prices
final result = await client.model.getModelPrices();
print(result);
```

### history

```dart
// 浏览历史
final result = await client.history.listBrowse();
print(result);
```

### sound_effect

```dart
// 创建音效生成任务
final result = await client.soundEffect.createGeneration();
print(result);
```

### generation

```dart
// Enhance generation prompt
final result = await client.generation.enhanceGenerationPrompt();
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
// Create feed
final result = await client.feed.create();
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

### auth

```dart
// 验证验证码
final result = await client.auth.verifySmsCode();
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

### agent_memory

```dart
// List memories
final result = await client.agentMemory.list();
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

## Error Handling

```dart
try {
  final result = await client.user.getUserSettings();
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
