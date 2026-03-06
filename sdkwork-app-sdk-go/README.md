# sdkwork-app-sdk (Go)

Professional Go SDK for SDKWork API.

## Installation

```bash
go get github.com/sdkwork/app-sdk
```

## Quick Start

```go
package main

import (
    "fmt"
    "github.com/sdkwork/app-sdk"
    sdkhttp "github.com/sdkwork/app-sdk/http"
)

func main() {
    cfg := sdkhttp.NewDefaultConfig("http://localhost:8080")
    client := github.com/sdkwork/app-sdk.NewSdkworkAppClientWithConfig(cfg)
    client.SetApiKey("your-api-key")
    
    // Use the SDK
    result, err := client.User.GetUserSettings()
    if err != nil {
        panic(err)
    }
    fmt.Println(result)
}
```

## Authentication Modes (Mutually Exclusive)

Choose exactly one mode for the same client instance.

### Mode A: API Key

```go
cfg := sdkhttp.NewDefaultConfig("http://localhost:8080")
client := github.com/sdkwork/app-sdk.NewSdkworkAppClientWithConfig(cfg)
client.SetApiKey("your-api-key")
// Sends: Authorization: Bearer <apiKey>
```

### Mode B: Dual Token

```go
cfg := sdkhttp.NewDefaultConfig("http://localhost:8080")
client := github.com/sdkwork/app-sdk.NewSdkworkAppClientWithConfig(cfg)
client.SetAuthToken("your-auth-token")
client.SetAccessToken("your-access-token")
// Sends:
// Authorization: Bearer <authToken>
// Access-Token: <accessToken>
```

> Do not call `SetApiKey(...)` together with `SetAuthToken(...)` + `SetAccessToken(...)` on the same client.

## Configuration (Non-Auth)

```go
cfg := sdkhttp.NewDefaultConfig("http://localhost:8080")
client := github.com/sdkwork/app-sdk.NewSdkworkAppClientWithConfig(cfg)

// Set custom headers
client.SetHeader("X-Custom-Header", "value")
```

## API Modules

- `client.Workspaces` - workspaces API
- `client.VoiceSpeaker` - voice_speaker API
- `client.Video` - video API
- `client.User` - user API
- `client.Tool` - tool API
- `client.Tenant` - tenant API
- `client.Social` - social API
- `client.Skill` - skill API
- `client.Shops` - shops API
- `client.Share` - share API
- `client.Settings` - settings API
- `client.Ai` - ai API
- `client.Projects` - projects API
- `client.Products` - products API
- `client.Partner` - partner API
- `client.Notification` - notification API
- `client.Notes` - notes API
- `client.News` - news API
- `client.Music` - music API
- `client.KnowledgeDocuments` - knowledge_documents API
- `client.Invoice` - invoice API
- `client.Image` - image API
- `client.Style` - style API
- `client.FileSystem` - file_system API
- `client.Feedback` - feedback API
- `client.Favorite` - favorite API
- `client.Drive` - drive API
- `client.Documents` - documents API
- `client.Dashboard` - dashboard API
- `client.Collection` - collection API
- `client.Chat` - chat API
- `client.Character` - character API
- `client.Category` - category API
- `client.Cart` - cart API
- `client.Assets` - assets API
- `client.App` - app API
- `client.Announcement` - announcement API
- `client.Agent` - agent API
- `client.Advert` - advert API
- `client.Wallet` - wallet API
- `client.Vote` - vote API
- `client.Vip` - vip API
- `client.Upload` - upload API
- `client.Search` - search API
- `client.Rtc` - rtc API
- `client.Payments` - payments API
- `client.Organization` - organization API
- `client.Orders` - orders API
- `client.Model` - model API
- `client.History` - history API
- `client.SoundEffect` - sound_effect API
- `client.Generation` - generation API
- `client.Audio` - audio API
- `client.Feed` - feed API
- `client.Currency` - currency API
- `client.Coupons` - coupons API
- `client.Comments` - comments API
- `client.Auth` - auth API
- `client.Audit` - audit API
- `client.Analytics` - analytics API
- `client.AgentMemory` - agent_memory API
- `client.Activity` - activity API
- `client.Account` - account API
- `client.Ab` - ab API
- `client.Sku` - sku API

## Usage Examples

### workspaces

```go
// 获取工作空间详情
result, err := client.Workspaces.GetWorkspaceDetail()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### voice_speaker

```go
// 获取发音人详情
result, err := client.VoiceSpeaker.GetSpeakerDetail()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### video

```go
// 获取视频详情
result, err := client.Video.GetVideo()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### user

```go
// 获取用户设置
result, err := client.User.GetUserSettings()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### tool

```go
// Update tool credentials
result, err := client.Tool.UpdateCredentials()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### tenant

```go
// 获取租户详情
result, err := client.Tenant.GetTenant()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### social

```go
// 标记消息已读
result, err := client.Social.MarkMessagesAsRead()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### skill

```go
// Get skill detail
result, err := client.Skill.Detail()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### shops

```go
// 获取店铺详情
result, err := client.Shops.GetShopDetail()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### share

```go
// 更新分享设置
result, err := client.Share.UpdateShareSettings()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### settings

```go
// 获取模块设置
result, err := client.Settings.GetModule()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### ai

```go
// 获取提示语详情
result, err := client.Ai.GetPromptDetail()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### projects

```go
// 获取项目详情
result, err := client.Projects.GetProjectDetail()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### products

```go
// 更新商品属性
result, err := client.Products.UpdateProductAttribute()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### partner

```go
// 获取合作伙伴详情
result, err := client.Partner.GetPartner()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### notification

```go
// Mark notification as unread
result, err := client.Notification.MarkAsUnread()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### notes

```go
// 获取笔记详情
result, err := client.Notes.GetNoteDetail()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### news

```go
// 获取新闻详情
result, err := client.News.GetNews()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### music

```go
// 获取音乐详情
result, err := client.Music.GetMusic()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### knowledge_documents

```go
// Restore knowledge document
result, err := client.KnowledgeDocuments.RestoreKnowledgeDocument()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### invoice

```go
// 获取发票详情
result, err := client.Invoice.GetInvoice()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### image

```go
// 获取图片详情
result, err := client.Image.GetImage()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### style

```go
// 获取风格详情
result, err := client.Style.GetStyle()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### file_system

```go
// Rename node
result, err := client.FileSystem.RenameNode()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### feedback

```go
// 关闭反馈
result, err := client.Feedback.Close()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### favorite

```go
// 移动收藏
result, err := client.Favorite.MoveFavoriteToFolder()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### drive

```go
// Restore drive item
result, err := client.Drive.RestoreItem()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### documents

```go
// Get document detail
result, err := client.Documents.GetDocumentDetail()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### dashboard

```go
// 完成待办
result, err := client.Dashboard.CompleteTodoItem()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### collection

```go
// 获取合集详情
result, err := client.Collection.GetCollection()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### chat

```go
// 获取会话详情
result, err := client.Chat.GetSessionDetail()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### character

```go
// 获取角色详情
result, err := client.Character.GetCharacter()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### category

```go
// 获取分类详情
result, err := client.Category.GetCategoryDetail()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### cart

```go
// 更新购物车商品数量
result, err := client.Cart.UpdateItemQuantity()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### assets

```go
// 重命名资产
result, err := client.Assets.RenameAsset()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### app

```go
// 获取应用详情
result, err := client.App.GetApp()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### announcement

```go
// 标记已读
result, err := client.Announcement.MarkAsRead()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### agent

```go
// Get agent
result, err := client.Agent.Get()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### advert

```go
// 广告设置
result, err := client.Advert.GetAdvertSettings()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### wallet

```go
// 钱包提现
result, err := client.Wallet.Withdraw()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### vote

```go
// 投票
result, err := client.Vote.Vote()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### vip

```go
// 购买VIP
result, err := client.Vip.Purchase()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### upload

```go
// 获取上传策略
result, err := client.Upload.GetUploadPolicy()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### search

```go
// 搜索历史
result, err := client.Search.GetSearchHistory()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### rtc

```go
// Create RTC room
result, err := client.Rtc.CreateRoom()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### payments

```go
// 创建支付
result, err := client.Payments.CreatePayment()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### organization

```go
// 创建组织
result, err := client.Organization.CreateOrganization()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### orders

```go
// 获取订单列表
result, err := client.Orders.ListOrders()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### model

```go
// Batch get model prices
result, err := client.Model.GetModelPrices()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### history

```go
// 浏览历史
result, err := client.History.ListBrowse()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### sound_effect

```go
// 创建音效生成任务
result, err := client.SoundEffect.CreateGeneration()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### generation

```go
// Enhance generation prompt
result, err := client.Generation.EnhanceGenerationPrompt()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### audio

```go
// 语音克隆
result, err := client.Audio.VoiceClone()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### feed

```go
// Create feed
result, err := client.Feed.Create()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### currency

```go
// 创建货币
result, err := client.Currency.CreateCurrency()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### coupons

```go
// 领取优惠券
result, err := client.Coupons.ReceiveCoupon()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### comments

```go
// 发表评论
result, err := client.Comments.CreateComment()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### auth

```go
// 验证验证码
result, err := client.Auth.VerifySmsCode()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### audit

```go
// 审核申诉
result, err := client.Audit.SubmitAppeal()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### analytics

```go
// 上报页面访问
result, err := client.Analytics.TrackPageView()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### agent_memory

```go
// List memories
result, err := client.AgentMemory.List()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### activity

```go
// 参与活动
result, err := client.Activity.Join()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### account

```go
// 积分转账
result, err := client.Account.Transfer()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### ab

```go
// 实验反馈
result, err := client.Ab.SubmitExperimentFeedback()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### sku

```go
// 获取SKU详情
result, err := client.Sku.GetSkuDetail()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

## Error Handling

```go
result, err := client.User.GetUserSettings()
if err != nil {
    // Handle error
    fmt.Println("Error:", err)
    return
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

> Set `GO_RELEASE_TAG` (or `SDKWORK_RELEASE_TAG`) and push tag if needed.

## License

MIT
