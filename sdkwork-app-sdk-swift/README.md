# sdkwork-app-sdk (Swift)

Professional Swift SDK for SDKWork API.

## Installation

Add to `Package.swift`:

```swift
dependencies: [
    .package(url: "https://github.com/sdkwork/app-sdk-swift", from: "1.0.1")
]
```

## Quick Start

```swift
import SdkworkApp
import SDKworkCommon

let config = SdkConfig(baseUrl: "http://localhost:8080")
let client = SdkworkAppClient(config: config)
client.setApiKey("your-api-key")

// Use the SDK
let result = try await client.tenant.getTenantTypes()
print(result)
```

## Authentication Modes (Mutually Exclusive)

Choose exactly one mode for the same client instance.

### Mode A: API Key

```swift
let config = SdkConfig(baseUrl: "http://localhost:8080")
let client = SdkworkAppClient(config: config)
client.setApiKey("your-api-key")
// Sends: Authorization: Bearer <apiKey>
```

### Mode B: Dual Token

```swift
let config = SdkConfig(baseUrl: "http://localhost:8080")
let client = SdkworkAppClient(config: config)
client.setAuthToken("your-auth-token")
client.setAccessToken("your-access-token")
// Sends:
// Authorization: Bearer <authToken>
// Access-Token: <accessToken>
```

> Do not call `setApiKey(...)` together with `setAuthToken(...)` + `setAccessToken(...)` on the same client.

## Configuration (Non-Auth)

```swift
let config = SdkConfig(baseUrl: "http://localhost:8080")
let client = SdkworkAppClient(config: config)

// Set custom headers
client.setHeader("X-Custom-Header", value: "value")
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
- `client.auth` - auth API
- `client.generation` - generation API

## Usage Examples

### workspaces

```swift
// 获取工作空间详情
let result = try await client.workspaces.getWorkspaceDetail()
print(result)
```

### voice_speakers

```swift
// 获取发音人详情
let result = try await client.voiceSpeakers.getSpeakerDetail()
print(result)
```

### video

```swift
// 获取视频详情
let result = try await client.video.getVideo()
print(result)
```

### settings

```swift
// 获取用户设置
let result = try await client.settings.getUser()
print(result)
```

### profile

```swift
// 获取用户信息
let result = try await client.profile.getUser()
print(result)
```

### password

```swift
// 修改密码
let result = try await client.password.change()
print(result)
```

### address

```swift
// 获取地址详情
let result = try await client.address.getAddressDetail()
print(result)
```

### tenant

```swift
// 获取租户详情
let result = try await client.tenant.getTenant()
print(result)
```

### social

```swift
// 标记消息已读
let result = try await client.social.markMessagesAsRead()
print(result)
```

### shops

```swift
// 获取店铺详情
let result = try await client.shops.getShopDetail()
print(result)
```

### share

```swift
// 更新分享设置
let result = try await client.share.updateShareSettings()
print(result)
```

### ai

```swift
// 获取提示语详情
let result = try await client.ai.getPromptDetail()
print(result)
```

### projects

```swift
// 获取项目详情
let result = try await client.projects.getProjectDetail()
print(result)
```

### partner

```swift
// 获取合作伙伴详情
let result = try await client.partner.getPartner()
print(result)
```

### notification

```swift
// 标记已读
let result = try await client.notification.markAsRead()
print(result)
```

### app

```swift
// 获取笔记详情
let result = try await client.app.getNoteDetail()
print(result)
```

### news

```swift
// 获取新闻详情
let result = try await client.news.getNews()
print(result)
```

### music

```swift
// 获取音乐详情
let result = try await client.music.getMusic()
print(result)
```

### invoice

```swift
// 获取发票详情
let result = try await client.invoice.getInvoice()
print(result)
```

### image

```swift
// 获取图片详情
let result = try await client.image.getImage()
print(result)
```

### style

```swift
// 获取风格详情
let result = try await client.style.getStyle()
print(result)
```

### file_system

```swift
// Rename node
let result = try await client.fileSystem.renameNode()
print(result)
```

### feedback

```swift
// 关闭反馈
let result = try await client.feedback.close()
print(result)
```

### favorite

```swift
// 移动收藏
let result = try await client.favorite.moveFavoriteToFolder()
print(result)
```

### drive

```swift
// Rename drive item
let result = try await client.drive.renameItem()
print(result)
```

### app_documents

```swift
// Get document detail
let result = try await client.appDocuments.getDocumentDetail()
print(result)
```

### dashboard

```swift
// 完成待办
let result = try await client.dashboard.completeTodoItem()
print(result)
```

### collection

```swift
// 获取合集详情
let result = try await client.collection.getCollection()
print(result)
```

### chat

```swift
// 获取会话详情
let result = try await client.chat.getSessionDetail()
print(result)
```

### character

```swift
// 获取角色详情
let result = try await client.character.getCharacter()
print(result)
```

### category

```swift
// 获取分类详情
let result = try await client.category.getCategoryDetail()
print(result)
```

### cart

```swift
// 更新购物车商品数量
let result = try await client.cart.updateItemQuantity()
print(result)
```

### assets

```swift
// 重命名资产
let result = try await client.assets.renameAsset()
print(result)
```

### announcement

```swift
// 标记已读
let result = try await client.announcement.markAsRead()
print(result)
```

### advert

```swift
// 广告设置
let result = try await client.advert.getAdvertSettings()
print(result)
```

### vote

```swift
// 投票
let result = try await client.vote.vote()
print(result)
```

### vip

```swift
// 购买VIP
let result = try await client.vip.purchase()
print(result)
```

### deactivate

```swift
// 注销账号
let result = try await client.deactivate.account()
print(result)
```

### bind

```swift
// 绑定第三方账号
let result = try await client.bind.thirdPartyAccount()
print(result)
```

### avatar

```swift
// 上传头像
let result = try await client.avatar.upload()
print(result)
```

### upload

```swift
// 获取上传策略
let result = try await client.upload.getUploadPolicy()
print(result)
```

### search

```swift
// 搜索历史
let result = try await client.search.getSearchHistory()
print(result)
```

### payments

```swift
// 创建支付
let result = try await client.payments.createPayment()
print(result)
```

### organization

```swift
// 创建组织
let result = try await client.organization.createOrganization()
print(result)
```

### disable

```swift
// 禁用组织
let result = try await client.disable.organization()
print(result)
```

### activate

```swift
// 激活组织
let result = try await client.activate.organization()
print(result)
```

### position

```swift
// 创建岗位
let result = try await client.position.createPosition()
print(result)
```

### department

```swift
// 创建部门
let result = try await client.department.createDepartment()
print(result)
```

### orders

```swift
// 获取订单列表
let result = try await client.orders.listOrders()
print(result)
```

### models

```swift
// 批量获取模型价格
let result = try await client.models.getModelPrices()
print(result)
```

### history

```swift
// 浏览历史
let result = try await client.history.listBrowse()
print(result)
```

### voice_speaker

```swift
// 创建语音生成任务
let result = try await client.voiceSpeaker.createGeneration()
print(result)
```

### sound_effect

```swift
// 创建音效生成任务
let result = try await client.soundEffect.createGeneration()
print(result)
```

### audio

```swift
// 语音克隆
let result = try await client.audio.voiceClone()
print(result)
```

### feed

```swift
// 取消点赞Feed
let result = try await client.feed.unlike()
print(result)
```

### currency

```swift
// 创建货币
let result = try await client.currency.createCurrency()
print(result)
```

### coupons

```swift
// 领取优惠券
let result = try await client.coupons.receiveCoupon()
print(result)
```

### comments

```swift
// 发表评论
let result = try await client.comments.createComment()
print(result)
```

### sms

```swift
// 验证验证码
let result = try await client.sms.verifySmsCode()
print(result)
```

### register

```swift
// 用户注册
let result = try await client.register.register()
print(result)
```

### refresh

```swift
// 刷新令牌
let result = try await client.refresh.token()
print(result)
```

### qr

```swift
// 生成登录二维码
let result = try await client.qr.generateQrCode()
print(result)
```

### phone

```swift
// 手机号验证码登录
let result = try await client.phone.login()
print(result)
```

### oauth

```swift
// OAuth授权URL
let result = try await client.oauth.getOauthUrl()
print(result)
```

### logout

```swift
// 用户登出
let result = try await client.logout.logout()
print(result)
```

### login

```swift
// 用户登录
let result = try await client.login.login()
print(result)
```

### audit

```swift
// 审核申诉
let result = try await client.audit.submitAppeal()
print(result)
```

### analytics

```swift
// 上报页面访问
let result = try await client.analytics.trackPageView()
print(result)
```

### activity

```swift
// 参与活动
let result = try await client.activity.join()
print(result)
```

### account

```swift
// 积分转账
let result = try await client.account.transfer()
print(result)
```

### ab

```swift
// 实验反馈
let result = try await client.ab.submitExperimentFeedback()
print(result)
```

### sku

```swift
// 获取SKU详情
let result = try await client.sku.getSkuDetail()
print(result)
```

### products

```swift
// 获取商品列表
let result = try await client.products.getProducts()
print(result)
```

### positions

```swift
// 获取组织的岗位列表
let result = try await client.positions.getPositionsByOrg()
print(result)
```

### members

```swift
// 获取组织成员
let result = try await client.members.getMembersByOrg()
print(result)
```

### departments

```swift
// 获取组织的部门列表
let result = try await client.departments.getDepartmentsByOrg()
print(result)
```

### children

```swift
// 获取子组织
let result = try await client.children.getChildOrganizations()
print(result)
```

### statistics

```swift
// 获取组织统计
let result = try await client.statistics.getOrganization()
print(result)
```

### member

```swift
// 获取成员详情
let result = try await client.member.getMember()
print(result)
```

### list

```swift
// 获取组织列表
let result = try await client.list.getOrganization()
print(result)
```

### code

```swift
// 根据编码获取组织
let result = try await client.code.getOrganizationBy()
print(result)
```

### auth

```swift
// Request password reset challenge
let result = try await client.auth.requestPasswordResetChallenge()
print(result)
```

### generation

```swift
// Enhance generation prompt
let result = try await client.generation.enhanceGenerationPrompt()
print(result)
```

## Error Handling

```swift
do {
    let result = try await client.tenant.getTenantTypes()
} catch {
    print("Error: \(error)")
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

> Set `SWIFT_RELEASE_TAG` (or `SDKWORK_RELEASE_TAG`) for tag-based release.

## License

MIT
