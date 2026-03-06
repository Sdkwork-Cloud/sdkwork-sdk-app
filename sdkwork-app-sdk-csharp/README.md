# sdkwork-app-sdk (C#)

Professional C# SDK for SDKWork API.

## Installation

```bash
dotnet add package App
```

Or add to your `.csproj`:

```xml
<PackageReference Include="App" Version="1.0.0" />
```

## Quick Start

```csharp
using App;
using SDKwork.Common.Core;

var config = new SdkConfig("http://localhost:8080");
var client = new SdkworkAppClient(config);
client.SetApiKey("your-api-key");

// Use the SDK
var result = await client.User.GetUserSettingsAsync();
Console.WriteLine(result);
```

## Authentication Modes (Mutually Exclusive)

Choose exactly one mode for the same client instance.

### Mode A: API Key

```csharp
var config = new SdkConfig("http://localhost:8080");
var client = new SdkworkAppClient(config);
client.SetApiKey("your-api-key");
// Sends: Authorization: Bearer <apiKey>
```

### Mode B: Dual Token

```csharp
var config = new SdkConfig("http://localhost:8080");
var client = new SdkworkAppClient(config);
client.SetAuthToken("your-auth-token");
client.SetAccessToken("your-access-token");
// Sends:
// Authorization: Bearer <authToken>
// Access-Token: <accessToken>
```

> Do not call `SetApiKey(...)` together with `SetAuthToken(...)` + `SetAccessToken(...)` on the same client.

## Configuration (Non-Auth)

```csharp
var config = new SdkConfig("http://localhost:8080");
var client = new SdkworkAppClient(config);

// Set custom headers
client.SetHeader("X-Custom-Header", "value");
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

```csharp
// 获取工作空间详情
var result = await client.Workspaces.GetWorkspaceDetailAsync();
Console.WriteLine(result);
```

### voice_speaker

```csharp
// 获取发音人详情
var result = await client.VoiceSpeaker.GetSpeakerDetailAsync();
Console.WriteLine(result);
```

### video

```csharp
// 获取视频详情
var result = await client.Video.GetVideoAsync();
Console.WriteLine(result);
```

### user

```csharp
// 获取用户设置
var result = await client.User.GetUserSettingsAsync();
Console.WriteLine(result);
```

### tool

```csharp
// Update tool credentials
var result = await client.Tool.UpdateCredentialsAsync();
Console.WriteLine(result);
```

### tenant

```csharp
// 获取租户详情
var result = await client.Tenant.GetTenantAsync();
Console.WriteLine(result);
```

### social

```csharp
// 标记消息已读
var result = await client.Social.MarkMessagesAsReadAsync();
Console.WriteLine(result);
```

### skill

```csharp
// Get skill detail
var result = await client.Skill.DetailAsync();
Console.WriteLine(result);
```

### shops

```csharp
// 获取店铺详情
var result = await client.Shops.GetShopDetailAsync();
Console.WriteLine(result);
```

### share

```csharp
// 更新分享设置
var result = await client.Share.UpdateShareSettingsAsync();
Console.WriteLine(result);
```

### settings

```csharp
// 获取模块设置
var result = await client.Settings.GetModuleAsync();
Console.WriteLine(result);
```

### ai

```csharp
// 获取提示语详情
var result = await client.Ai.GetPromptDetailAsync();
Console.WriteLine(result);
```

### projects

```csharp
// 获取项目详情
var result = await client.Projects.GetProjectDetailAsync();
Console.WriteLine(result);
```

### products

```csharp
// 更新商品属性
var result = await client.Products.UpdateProductAttributeAsync();
Console.WriteLine(result);
```

### partner

```csharp
// 获取合作伙伴详情
var result = await client.Partner.GetPartnerAsync();
Console.WriteLine(result);
```

### notification

```csharp
// Mark notification as unread
var result = await client.Notification.MarkAsUnreadAsync();
Console.WriteLine(result);
```

### notes

```csharp
// 获取笔记详情
var result = await client.Notes.GetNoteDetailAsync();
Console.WriteLine(result);
```

### news

```csharp
// 获取新闻详情
var result = await client.News.GetNewsAsync();
Console.WriteLine(result);
```

### music

```csharp
// 获取音乐详情
var result = await client.Music.GetMusicAsync();
Console.WriteLine(result);
```

### knowledge_documents

```csharp
// Restore knowledge document
var result = await client.KnowledgeDocuments.RestoreKnowledgeDocumentAsync();
Console.WriteLine(result);
```

### invoice

```csharp
// 获取发票详情
var result = await client.Invoice.GetInvoiceAsync();
Console.WriteLine(result);
```

### image

```csharp
// 获取图片详情
var result = await client.Image.GetImageAsync();
Console.WriteLine(result);
```

### style

```csharp
// 获取风格详情
var result = await client.Style.GetStyleAsync();
Console.WriteLine(result);
```

### file_system

```csharp
// Rename node
var result = await client.FileSystem.RenameNodeAsync();
Console.WriteLine(result);
```

### feedback

```csharp
// 关闭反馈
var result = await client.Feedback.CloseAsync();
Console.WriteLine(result);
```

### favorite

```csharp
// 移动收藏
var result = await client.Favorite.MoveFavoriteToFolderAsync();
Console.WriteLine(result);
```

### drive

```csharp
// Restore drive item
var result = await client.Drive.RestoreItemAsync();
Console.WriteLine(result);
```

### documents

```csharp
// Get document detail
var result = await client.Documents.GetDocumentDetailAsync();
Console.WriteLine(result);
```

### dashboard

```csharp
// 完成待办
var result = await client.Dashboard.CompleteTodoItemAsync();
Console.WriteLine(result);
```

### collection

```csharp
// 获取合集详情
var result = await client.Collection.GetCollectionAsync();
Console.WriteLine(result);
```

### chat

```csharp
// 获取会话详情
var result = await client.Chat.GetSessionDetailAsync();
Console.WriteLine(result);
```

### character

```csharp
// 获取角色详情
var result = await client.Character.GetCharacterAsync();
Console.WriteLine(result);
```

### category

```csharp
// 获取分类详情
var result = await client.Category.GetCategoryDetailAsync();
Console.WriteLine(result);
```

### cart

```csharp
// 更新购物车商品数量
var result = await client.Cart.UpdateItemQuantityAsync();
Console.WriteLine(result);
```

### assets

```csharp
// 重命名资产
var result = await client.Assets.RenameAssetAsync();
Console.WriteLine(result);
```

### app

```csharp
// 获取应用详情
var result = await client.App.GetAppAsync();
Console.WriteLine(result);
```

### announcement

```csharp
// 标记已读
var result = await client.Announcement.MarkAsReadAsync();
Console.WriteLine(result);
```

### agent

```csharp
// Get agent
var result = await client.Agent.GetAsync();
Console.WriteLine(result);
```

### advert

```csharp
// 广告设置
var result = await client.Advert.GetAdvertSettingsAsync();
Console.WriteLine(result);
```

### wallet

```csharp
// 钱包提现
var result = await client.Wallet.WithdrawAsync();
Console.WriteLine(result);
```

### vote

```csharp
// 投票
var result = await client.Vote.VoteAsync();
Console.WriteLine(result);
```

### vip

```csharp
// 购买VIP
var result = await client.Vip.PurchaseAsync();
Console.WriteLine(result);
```

### upload

```csharp
// 获取上传策略
var result = await client.Upload.GetUploadPolicyAsync();
Console.WriteLine(result);
```

### search

```csharp
// 搜索历史
var result = await client.Search.GetSearchHistoryAsync();
Console.WriteLine(result);
```

### rtc

```csharp
// Create RTC room
var result = await client.Rtc.CreateRoomAsync();
Console.WriteLine(result);
```

### payments

```csharp
// 创建支付
var result = await client.Payments.CreatePaymentAsync();
Console.WriteLine(result);
```

### organization

```csharp
// 创建组织
var result = await client.Organization.CreateOrganizationAsync();
Console.WriteLine(result);
```

### orders

```csharp
// 获取订单列表
var result = await client.Orders.ListOrdersAsync();
Console.WriteLine(result);
```

### model

```csharp
// Batch get model prices
var result = await client.Model.GetModelPricesAsync();
Console.WriteLine(result);
```

### history

```csharp
// 浏览历史
var result = await client.History.ListBrowseAsync();
Console.WriteLine(result);
```

### sound_effect

```csharp
// 创建音效生成任务
var result = await client.SoundEffect.CreateGenerationAsync();
Console.WriteLine(result);
```

### generation

```csharp
// Enhance generation prompt
var result = await client.Generation.EnhanceGenerationPromptAsync();
Console.WriteLine(result);
```

### audio

```csharp
// 语音克隆
var result = await client.Audio.VoiceCloneAsync();
Console.WriteLine(result);
```

### feed

```csharp
// Create feed
var result = await client.Feed.CreateAsync();
Console.WriteLine(result);
```

### currency

```csharp
// 创建货币
var result = await client.Currency.CreateCurrencyAsync();
Console.WriteLine(result);
```

### coupons

```csharp
// 领取优惠券
var result = await client.Coupons.ReceiveCouponAsync();
Console.WriteLine(result);
```

### comments

```csharp
// 发表评论
var result = await client.Comments.CreateCommentAsync();
Console.WriteLine(result);
```

### auth

```csharp
// 验证验证码
var result = await client.Auth.VerifySmsCodeAsync();
Console.WriteLine(result);
```

### audit

```csharp
// 审核申诉
var result = await client.Audit.SubmitAppealAsync();
Console.WriteLine(result);
```

### analytics

```csharp
// 上报页面访问
var result = await client.Analytics.TrackPageViewAsync();
Console.WriteLine(result);
```

### agent_memory

```csharp
// List memories
var result = await client.AgentMemory.ListAsync();
Console.WriteLine(result);
```

### activity

```csharp
// 参与活动
var result = await client.Activity.JoinAsync();
Console.WriteLine(result);
```

### account

```csharp
// 积分转账
var result = await client.Account.TransferAsync();
Console.WriteLine(result);
```

### ab

```csharp
// 实验反馈
var result = await client.Ab.SubmitExperimentFeedbackAsync();
Console.WriteLine(result);
```

### sku

```csharp
// 获取SKU详情
var result = await client.Sku.GetSkuDetailAsync();
Console.WriteLine(result);
```

## Error Handling

```csharp
try
{
    var result = await client.User.GetUserSettingsAsync();
}
catch (HttpRequestException ex)
{
    Console.WriteLine($"Error: {ex.Message}");
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

> Set `NUGET_API_KEY` for release (or `NUGET_TEST_API_KEY` for test channel).

## License

MIT
