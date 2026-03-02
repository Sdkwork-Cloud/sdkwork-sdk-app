# sdkwork-app-sdk (Kotlin)

Professional Kotlin SDK for SDKWork API.

## Installation

Add to your `build.gradle.kts`:

```kotlin
implementation("com.sdkwork:app-sdk:1.0.0")
```

Or with Gradle Groovy:

```groovy
implementation 'com.sdkwork:app-sdk:1.0.0'
```

## Quick Start

```kotlin
import com.sdkwork.app.SdkworkAppClient
import com.sdkwork.common.core.SdkConfig

suspend fun main() {
    val config = SdkConfig(baseUrl = "http://localhost:8080")
    val client = SdkworkAppClient(config)
    client.setApiKey("your-api-key")
    
    // Use the SDK
    val result = client.tenant.getTenantTypes()
    println(result)
}
```

## Authentication Modes (Mutually Exclusive)

Choose exactly one mode for the same client instance.

### Mode A: API Key

```kotlin
val config = SdkConfig(baseUrl = "http://localhost:8080")
val client = SdkworkAppClient(config)
client.setApiKey("your-api-key")
// Sends: Authorization: Bearer <apiKey>
```

### Mode B: Dual Token

```kotlin
val config = SdkConfig(baseUrl = "http://localhost:8080")
val client = SdkworkAppClient(config)
client.setAuthToken("your-auth-token")
client.setAccessToken("your-access-token")
// Sends:
// Authorization: Bearer <authToken>
// Access-Token: <accessToken>
```

> Do not call `setApiKey(...)` together with `setAuthToken(...)` + `setAccessToken(...)` on the same client.

## Configuration (Non-Auth)

```kotlin
val config = SdkConfig(baseUrl = "http://localhost:8080")
val client = SdkworkAppClient(config)
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

```kotlin
// 获取工作空间详情
val result = client.workspaces.getWorkspaceDetail()
println(result)
```

### voice_speakers

```kotlin
// 获取发音人详情
val result = client.voiceSpeakers.getSpeakerDetail()
println(result)
```

### video

```kotlin
// 获取视频详情
val result = client.video.getVideo()
println(result)
```

### settings

```kotlin
// 获取用户设置
val result = client.settings.getUser()
println(result)
```

### profile

```kotlin
// 获取用户信息
val result = client.profile.getUser()
println(result)
```

### password

```kotlin
// 修改密码
val result = client.password.change()
println(result)
```

### address

```kotlin
// 获取地址详情
val result = client.address.getAddressDetail()
println(result)
```

### tenant

```kotlin
// 获取租户详情
val result = client.tenant.getTenant()
println(result)
```

### social

```kotlin
// 标记消息已读
val result = client.social.markMessagesAsRead()
println(result)
```

### shops

```kotlin
// 获取店铺详情
val result = client.shops.getShopDetail()
println(result)
```

### share

```kotlin
// 更新分享设置
val result = client.share.updateShareSettings()
println(result)
```

### ai

```kotlin
// 获取提示语详情
val result = client.ai.getPromptDetail()
println(result)
```

### projects

```kotlin
// 获取项目详情
val result = client.projects.getProjectDetail()
println(result)
```

### partner

```kotlin
// 获取合作伙伴详情
val result = client.partner.getPartner()
println(result)
```

### notification

```kotlin
// 标记已读
val result = client.notification.markAsRead()
println(result)
```

### app

```kotlin
// 获取笔记详情
val result = client.app.getNoteDetail()
println(result)
```

### news

```kotlin
// 获取新闻详情
val result = client.news.getNews()
println(result)
```

### music

```kotlin
// 获取音乐详情
val result = client.music.getMusic()
println(result)
```

### invoice

```kotlin
// 获取发票详情
val result = client.invoice.getInvoice()
println(result)
```

### image

```kotlin
// 获取图片详情
val result = client.image.getImage()
println(result)
```

### style

```kotlin
// 获取风格详情
val result = client.style.getStyle()
println(result)
```

### file_system

```kotlin
// Rename node
val result = client.fileSystem.renameNode()
println(result)
```

### feedback

```kotlin
// 关闭反馈
val result = client.feedback.close()
println(result)
```

### favorite

```kotlin
// 移动收藏
val result = client.favorite.moveFavoriteToFolder()
println(result)
```

### drive

```kotlin
// Rename drive item
val result = client.drive.renameItem()
println(result)
```

### app_documents

```kotlin
// Get document detail
val result = client.appDocuments.getDocumentDetail()
println(result)
```

### dashboard

```kotlin
// 完成待办
val result = client.dashboard.completeTodoItem()
println(result)
```

### collection

```kotlin
// 获取合集详情
val result = client.collection.getCollection()
println(result)
```

### chat

```kotlin
// 获取会话详情
val result = client.chat.getSessionDetail()
println(result)
```

### character

```kotlin
// 获取角色详情
val result = client.character.getCharacter()
println(result)
```

### category

```kotlin
// 获取分类详情
val result = client.category.getCategoryDetail()
println(result)
```

### cart

```kotlin
// 更新购物车商品数量
val result = client.cart.updateItemQuantity()
println(result)
```

### assets

```kotlin
// 重命名资产
val result = client.assets.renameAsset()
println(result)
```

### announcement

```kotlin
// 标记已读
val result = client.announcement.markAsRead()
println(result)
```

### advert

```kotlin
// 广告设置
val result = client.advert.getAdvertSettings()
println(result)
```

### vote

```kotlin
// 投票
val result = client.vote.vote()
println(result)
```

### vip

```kotlin
// 购买VIP
val result = client.vip.purchase()
println(result)
```

### deactivate

```kotlin
// 注销账号
val result = client.deactivate.account()
println(result)
```

### bind

```kotlin
// 绑定第三方账号
val result = client.bind.thirdPartyAccount()
println(result)
```

### avatar

```kotlin
// 上传头像
val result = client.avatar.upload()
println(result)
```

### upload

```kotlin
// 获取上传策略
val result = client.upload.getUploadPolicy()
println(result)
```

### search

```kotlin
// 搜索历史
val result = client.search.getSearchHistory()
println(result)
```

### payments

```kotlin
// 创建支付
val result = client.payments.createPayment()
println(result)
```

### organization

```kotlin
// 创建组织
val result = client.organization.createOrganization()
println(result)
```

### disable

```kotlin
// 禁用组织
val result = client.disable.organization()
println(result)
```

### activate

```kotlin
// 激活组织
val result = client.activate.organization()
println(result)
```

### position

```kotlin
// 创建岗位
val result = client.position.createPosition()
println(result)
```

### department

```kotlin
// 创建部门
val result = client.department.createDepartment()
println(result)
```

### orders

```kotlin
// 获取订单列表
val result = client.orders.listOrders()
println(result)
```

### models

```kotlin
// 批量获取模型价格
val result = client.models.getModelPrices()
println(result)
```

### history

```kotlin
// 浏览历史
val result = client.history.listBrowse()
println(result)
```

### voice_speaker

```kotlin
// 创建语音生成任务
val result = client.voiceSpeaker.createGeneration()
println(result)
```

### sound_effect

```kotlin
// 创建音效生成任务
val result = client.soundEffect.createGeneration()
println(result)
```

### audio

```kotlin
// 语音克隆
val result = client.audio.voiceClone()
println(result)
```

### feed

```kotlin
// 取消点赞Feed
val result = client.feed.unlike()
println(result)
```

### currency

```kotlin
// 创建货币
val result = client.currency.createCurrency()
println(result)
```

### coupons

```kotlin
// 领取优惠券
val result = client.coupons.receiveCoupon()
println(result)
```

### comments

```kotlin
// 发表评论
val result = client.comments.createComment()
println(result)
```

### sms

```kotlin
// 验证验证码
val result = client.sms.verifySmsCode()
println(result)
```

### register

```kotlin
// 用户注册
val result = client.register.register()
println(result)
```

### refresh

```kotlin
// 刷新令牌
val result = client.refresh.token()
println(result)
```

### qr

```kotlin
// 生成登录二维码
val result = client.qr.generateQrCode()
println(result)
```

### phone

```kotlin
// 手机号验证码登录
val result = client.phone.login()
println(result)
```

### oauth

```kotlin
// OAuth授权URL
val result = client.oauth.getOauthUrl()
println(result)
```

### logout

```kotlin
// 用户登出
val result = client.logout.logout()
println(result)
```

### login

```kotlin
// 用户登录
val result = client.login.login()
println(result)
```

### audit

```kotlin
// 审核申诉
val result = client.audit.submitAppeal()
println(result)
```

### analytics

```kotlin
// 上报页面访问
val result = client.analytics.trackPageView()
println(result)
```

### activity

```kotlin
// 参与活动
val result = client.activity.join()
println(result)
```

### account

```kotlin
// 积分转账
val result = client.account.transfer()
println(result)
```

### ab

```kotlin
// 实验反馈
val result = client.ab.submitExperimentFeedback()
println(result)
```

### sku

```kotlin
// 获取SKU详情
val result = client.sku.getSkuDetail()
println(result)
```

### products

```kotlin
// 获取商品列表
val result = client.products.getProducts()
println(result)
```

### positions

```kotlin
// 获取组织的岗位列表
val result = client.positions.getPositionsByOrg()
println(result)
```

### members

```kotlin
// 获取组织成员
val result = client.members.getMembersByOrg()
println(result)
```

### departments

```kotlin
// 获取组织的部门列表
val result = client.departments.getDepartmentsByOrg()
println(result)
```

### children

```kotlin
// 获取子组织
val result = client.children.getChildOrganizations()
println(result)
```

### statistics

```kotlin
// 获取组织统计
val result = client.statistics.getOrganization()
println(result)
```

### member

```kotlin
// 获取成员详情
val result = client.member.getMember()
println(result)
```

### list

```kotlin
// 获取组织列表
val result = client.list.getOrganization()
println(result)
```

### code

```kotlin
// 根据编码获取组织
val result = client.code.getOrganizationBy()
println(result)
```

## Error Handling

```kotlin
try {
    val result = client.tenant.getTenantTypes()
} catch (e: Exception) {
    println("Error: ${e.message}")
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

> Configure Gradle publishing credentials and optional `GRADLE_PUBLISH_TASK`.

## License

MIT
