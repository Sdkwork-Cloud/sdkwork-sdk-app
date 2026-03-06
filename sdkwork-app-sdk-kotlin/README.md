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
    val result = client.user.getUserSettings()
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

```kotlin
// 获取工作空间详情
val result = client.workspaces.getWorkspaceDetail()
println(result)
```

### voice_speaker

```kotlin
// 获取发音人详情
val result = client.voiceSpeaker.getSpeakerDetail()
println(result)
```

### video

```kotlin
// 获取视频详情
val result = client.video.getVideo()
println(result)
```

### user

```kotlin
// 获取用户设置
val result = client.user.getUserSettings()
println(result)
```

### tool

```kotlin
// Update tool credentials
val result = client.tool.updateCredentials()
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

### skill

```kotlin
// Get skill detail
val result = client.skill.detail()
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

### settings

```kotlin
// 获取模块设置
val result = client.settings.getModule()
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

### products

```kotlin
// 更新商品属性
val result = client.products.updateProductAttribute()
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
// Mark notification as unread
val result = client.notification.markAsUnread()
println(result)
```

### notes

```kotlin
// 获取笔记详情
val result = client.notes.getNoteDetail()
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

### knowledge_documents

```kotlin
// Restore knowledge document
val result = client.knowledgeDocuments.restoreKnowledgeDocument()
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
// Restore drive item
val result = client.drive.restoreItem()
println(result)
```

### documents

```kotlin
// Get document detail
val result = client.documents.getDocumentDetail()
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

### app

```kotlin
// 获取应用详情
val result = client.app.getApp()
println(result)
```

### announcement

```kotlin
// 标记已读
val result = client.announcement.markAsRead()
println(result)
```

### agent

```kotlin
// Get agent
val result = client.agent.get()
println(result)
```

### advert

```kotlin
// 广告设置
val result = client.advert.getAdvertSettings()
println(result)
```

### wallet

```kotlin
// 钱包提现
val result = client.wallet.withdraw()
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

### rtc

```kotlin
// Create RTC room
val result = client.rtc.createRoom()
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

### orders

```kotlin
// 获取订单列表
val result = client.orders.listOrders()
println(result)
```

### model

```kotlin
// Batch get model prices
val result = client.model.getModelPrices()
println(result)
```

### history

```kotlin
// 浏览历史
val result = client.history.listBrowse()
println(result)
```

### sound_effect

```kotlin
// 创建音效生成任务
val result = client.soundEffect.createGeneration()
println(result)
```

### generation

```kotlin
// Enhance generation prompt
val result = client.generation.enhanceGenerationPrompt()
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
// Create feed
val result = client.feed.create()
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

### auth

```kotlin
// 验证验证码
val result = client.auth.verifySmsCode()
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

### agent_memory

```kotlin
// List memories
val result = client.agentMemory.list()
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

## Error Handling

```kotlin
try {
    val result = client.user.getUserSettings()
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
