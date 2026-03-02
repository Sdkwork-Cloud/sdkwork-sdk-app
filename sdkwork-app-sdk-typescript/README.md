# sdkwork-app-sdk

Professional TypeScript SDK for SDKWork API.

## Installation

```bash
npm install @sdkwork/app-sdk
# or
yarn add @sdkwork/app-sdk
# or
pnpm add @sdkwork/app-sdk
```

## Quick Start

```typescript
import { SdkworkAppClient } from '@sdkwork/app-sdk';

const client = new SdkworkAppClient({
  baseUrl: 'http://localhost:8080',
  timeout: 30000,
});

// Mode A: API Key (recommended for server-to-server calls)
client.setApiKey('your-api-key');

// Use the SDK
const result = await client.tenant.getTenantTypes();
```

## Authentication Modes (Mutually Exclusive)

Choose exactly one mode for the same client instance.

### Mode A: API Key

```typescript
const client = new SdkworkAppClient({ baseUrl: 'http://localhost:8080' });
client.setApiKey('your-api-key');
// Sends: Authorization: Bearer <apiKey>
```

### Mode B: Dual Token

```typescript
const client = new SdkworkAppClient({ baseUrl: 'http://localhost:8080' });
client.setAuthToken('your-auth-token');
client.setAccessToken('your-access-token');
// Sends:
// Authorization: Bearer <authToken>
// Access-Token: <accessToken>
```

> Do not call `setApiKey(...)` together with `setAuthToken(...)` + `setAccessToken(...)` on the same client.

## Configuration (Non-Auth)

```typescript
import { SdkworkAppClient } from '@sdkwork/app-sdk';

const client = new SdkworkAppClient({
  baseUrl: 'http://localhost:8080',
  timeout: 30000, // Request timeout in ms
  headers: {      // Custom headers
    'X-Custom-Header': 'value',
  },
});
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

```typescript
// 获取工作空间列表
const result = await client.workspaces.listWorkspaces();
```

### voice_speakers

```typescript
// 获取发音人统计
const result = await client.voiceSpeakers.getStatistics();
```

### video

```typescript
// 获取视频统计
const result = await client.video.getVideoStatistics();
```

### settings

```typescript
// 获取用户设置
const result = await client.settings.getUser();
```

### profile

```typescript
// 获取用户信息
const result = await client.profile.getUser();
```

### password

```typescript
// 修改密码
const body = {} as any;
const result = await client.password.change(body);
```

### address

```typescript
// 获取地址列表
const result = await client.address.listAddresses();
```

### tenant

```typescript
// 获取租户类型列表
const result = await client.tenant.getTenantTypes();
```

### social

```typescript
// 获取关注统计
const result = await client.social.getFollowStats();
```

### shops

```typescript
// 获取店铺统计
const result = await client.shops.getStatistics();
```

### share

```typescript
// 获取分享平台配置
const result = await client.share.getSharePlatforms();
```

### ai

```typescript
// 获取热门提示语
const params = {} as Record<string, any>;
const result = await client.ai.getPopularPrompts(params);
```

### projects

```typescript
// 最近访问项目
const params = {} as Record<string, any>;
const result = await client.projects.listRecent(params);
```

### partner

```typescript
// 获取合作伙伴统计
const result = await client.partner.getPartnerStatistics();
```

### notification

```typescript
// 获取推送设置
const result = await client.notification.getNotificationSettings();
```

### app

```typescript
// 获取文件夹列表
const result = await client.app.listFolders();
```

### news

```typescript
// 获取我的新闻
const params = {} as Record<string, any>;
const result = await client.news.getMy(params);
```

### music

```typescript
// 获取音乐统计
const result = await client.music.getMusicStatistics();
```

### invoice

```typescript
// 获取发票统计
const result = await client.invoice.getInvoiceStatistics();
```

### image

```typescript
// 获取图片统计
const result = await client.image.getImageStatistics();
```

### style

```typescript
// 获取风格类型列表
const result = await client.style.getStyleTypes();
```

### file_system

```typescript
// List disks
const result = await client.fileSystem.listDisks();
```

### feedback

```typescript
// 客服信息
const result = await client.feedback.getSupportInfo();
```

### favorite

```typescript
// 收藏夹列表
const result = await client.favorite.listFavoriteFolders();
```

### drive

```typescript
// List drive items
const params = {} as Record<string, any>;
const result = await client.drive.listItems(params);
```

### app_documents

```typescript
// List documents
const params = {} as Record<string, any>;
const result = await client.appDocuments.listDocuments(params);
```

### dashboard

```typescript
// 快捷入口
const result = await client.dashboard.getShortcuts();
```

### collection

```typescript
// 获取合集树
const params = {} as Record<string, any>;
const result = await client.collection.getCollectionTree(params);
```

### chat

```typescript
// 获取会话列表
const params = {} as Record<string, any>;
const result = await client.chat.listSessions(params);
```

### character

```typescript
// 获取热门角色
const params = {} as Record<string, any>;
const result = await client.character.getPopularCharacters(params);
```

### category

```typescript
// 获取分类类型
const result = await client.category.getCategoryTypes();
```

### cart

```typescript
// 获取购物车商品列表
const result = await client.cart.getCartItems();
```

### assets

```typescript
// 获取文件夹列表
const result = await client.assets.listFolders();
```

### announcement

```typescript
// 未读公告
const result = await client.announcement.getUnreadAnnouncements();
```

### advert

```typescript
// 广告设置
const result = await client.advert.getAdvertSettings();
```

### vote

```typescript
// 获取我的投票历史
const params = {} as Record<string, any>;
const result = await client.vote.getMyVotes(params);
```

### vip

```typescript
// 获取VIP状态
const result = await client.vip.getVipStatus();
```

### deactivate

```typescript
// 注销账号
const body = {} as any;
const result = await client.deactivate.account(body);
```

### bind

```typescript
// 解绑第三方账号
const platform = 'platform';
const result = await client.bind.unbindThirdPartyAccount(platform);
```

### avatar

```typescript
// 上传头像
const body = {} as any;
const result = await client.avatar.upload(body);
```

### upload

```typescript
// 获取存储使用情况
const result = await client.upload.getStorageUsage();
```

### search

```typescript
// 搜索统计
const result = await client.search.getSearchStatistics();
```

### payments

```typescript
// 获取支付统计
const result = await client.payments.getPaymentStatistics();
```

### organization

```typescript
// 创建组织
const body = {} as any;
const result = await client.organization.createOrganization(body);
```

### disable

```typescript
// 禁用组织
const orgId = 1;
const result = await client.disable.organization(orgId);
```

### activate

```typescript
// 激活组织
const orgId = 1;
const result = await client.activate.organization(orgId);
```

### position

```typescript
// 创建岗位
const body = {} as any;
const result = await client.position.createPosition(body);
```

### department

```typescript
// 创建部门
const body = {} as any;
const result = await client.department.createDepartment(body);
```

### orders

```typescript
// 获取订单统计
const result = await client.orders.getOrderStatistics();
```

### models

```typescript
// 获取模型类型列表
const result = await client.models.getModelTypes();
```

### history

```typescript
// 历史统计
const result = await client.history.getHistoryStatistics();
```

### voice_speaker

```typescript
// 获取任务列表
const params = {} as Record<string, any>;
const result = await client.voiceSpeaker.listTasks(params);
```

### sound_effect

```typescript
// 获取任务列表
const params = {} as Record<string, any>;
const result = await client.soundEffect.listTasks(params);
```

### audio

```typescript
// 获取语音列表
const params = {} as Record<string, any>;
const result = await client.audio.getVoiceList(params);
```

### feed

```typescript
// 获取置顶Feed
const params = {} as Record<string, any>;
const result = await client.feed.getTopFeeds(params);
```

### currency

```typescript
// 获取货币类型列表
const result = await client.currency.getCurrencyTypes();
```

### coupons

```typescript
// 获取优惠券统计
const result = await client.coupons.getStatistics();
```

### comments

```typescript
// 获取我的评论
const params = {} as Record<string, any>;
const result = await client.comments.getMy(params);
```

### sms

```typescript
// 验证验证码
const body = {} as any;
const result = await client.sms.verifySmsCode(body);
```

### register

```typescript
// 用户注册
const body = {} as any;
const result = await client.register.register(body);
```

### refresh

```typescript
// 刷新令牌
const body = {} as any;
const result = await client.refresh.token(body);
```

### qr

```typescript
// 生成登录二维码
const result = await client.qr.generateQrCode();
```

### phone

```typescript
// 手机号验证码登录
const body = {} as any;
const result = await client.phone.login(body);
```

### oauth

```typescript
// OAuth授权URL
const body = {} as any;
const result = await client.oauth.getOauthUrl(body);
```

### logout

```typescript
// 用户登出
const result = await client.logout.logout();
```

### login

```typescript
// 用户登录
const body = {} as any;
const result = await client.login.login(body);
```

### audit

```typescript
// 敏感词库
const result = await client.audit.listSensitiveWord();
```

### analytics

```typescript
// 使用统计
const result = await client.analytics.getUserUsageStats();
```

### activity

```typescript
// 获取抽奖列表
const result = await client.activity.listLotteryActivities();
```

### account

```typescript
// 获取积分账户信息
const result = await client.account.getPoints();
```

### ab

```typescript
// 所有特性开关
const result = await client.ab.listFeatureFlags();
```

### sku

```typescript
// 检查SKU编码是否存在
const params = {} as Record<string, any>;
const result = await client.sku.checkSkuCodeExists(params);
```

### products

```typescript
// 获取最新商品
const params = {} as Record<string, any>;
const result = await client.products.getLatest(params);
```

### positions

```typescript
// 获取组织的岗位列表
const orgId = 1;
const result = await client.positions.getPositionsByOrg(orgId);
```

### members

```typescript
// 获取组织成员
const orgId = 1;
const params = {} as Record<string, any>;
const result = await client.members.getMembersByOrg(orgId, params);
```

### departments

```typescript
// 获取组织的部门列表
const orgId = 1;
const result = await client.departments.getDepartmentsByOrg(orgId);
```

### children

```typescript
// 获取子组织
const orgId = 1;
const result = await client.children.getChildOrganizations(orgId);
```

### statistics

```typescript
// 获取组织统计
const result = await client.statistics.getOrganization();
```

### member

```typescript
// 获取成员详情
const memberId = 1;
const result = await client.member.getMember(memberId);
```

### list

```typescript
// 获取组织列表
const params = {} as Record<string, any>;
const result = await client.list.getOrganization(params);
```

### code

```typescript
// 根据编码获取组织
const code = 'code';
const result = await client.code.getOrganizationBy(code);
```

## Error Handling

```typescript
import { SdkworkAppClient, NetworkError, TimeoutError, AuthenticationError } from '@sdkwork/app-sdk';

try {
  const result = await client.tenant.getTenantTypes();
} catch (error) {
  if (error instanceof AuthenticationError) {
    console.error('Authentication failed:', error.message);
  } else if (error instanceof TimeoutError) {
    console.error('Request timed out:', error.message);
  } else if (error instanceof NetworkError) {
    console.error('Network error:', error.message);
  } else {
    throw error;
  }
}
```

## License

MIT
