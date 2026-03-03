# sdkwork-app-sdk (C#)

Professional C# SDK for SDKWork API.

## Installation

```bash
dotnet add package App
```

Or add to your `.csproj`:

```xml
<PackageReference Include="App" Version="1.0.1" />
```

## Quick Start

```csharp
using App;
using SDKwork.Common.Core;

var config = new SdkConfig("http://localhost:8080");
var client = new SdkworkAppClient(config);
client.SetApiKey("your-api-key");

// Use the SDK
var result = await client.Tenant.GetTenantTypesAsync();
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
- `client.VoiceSpeakers` - voice_speakers API
- `client.Video` - video API
- `client.Settings` - settings API
- `client.Profile` - profile API
- `client.Password` - password API
- `client.Address` - address API
- `client.Tenant` - tenant API
- `client.Social` - social API
- `client.Shops` - shops API
- `client.Share` - share API
- `client.Ai` - ai API
- `client.Projects` - projects API
- `client.Partner` - partner API
- `client.Notification` - notification API
- `client.App` - app API
- `client.News` - news API
- `client.Music` - music API
- `client.Invoice` - invoice API
- `client.Image` - image API
- `client.Style` - style API
- `client.FileSystem` - file_system API
- `client.Feedback` - feedback API
- `client.Favorite` - favorite API
- `client.Drive` - drive API
- `client.AppDocuments` - app_documents API
- `client.Dashboard` - dashboard API
- `client.Collection` - collection API
- `client.Chat` - chat API
- `client.Character` - character API
- `client.Category` - category API
- `client.Cart` - cart API
- `client.Assets` - assets API
- `client.Announcement` - announcement API
- `client.Advert` - advert API
- `client.Vote` - vote API
- `client.Vip` - vip API
- `client.Deactivate` - deactivate API
- `client.Bind` - bind API
- `client.Avatar` - avatar API
- `client.Upload` - upload API
- `client.Search` - search API
- `client.Payments` - payments API
- `client.Organization` - organization API
- `client.Disable` - disable API
- `client.Activate` - activate API
- `client.Position` - position API
- `client.Department` - department API
- `client.Orders` - orders API
- `client.Models` - models API
- `client.History` - history API
- `client.VoiceSpeaker` - voice_speaker API
- `client.SoundEffect` - sound_effect API
- `client.Audio` - audio API
- `client.Feed` - feed API
- `client.Currency` - currency API
- `client.Coupons` - coupons API
- `client.Comments` - comments API
- `client.Sms` - sms API
- `client.Register` - register API
- `client.Refresh` - refresh API
- `client.Qr` - qr API
- `client.Phone` - phone API
- `client.Oauth` - oauth API
- `client.Logout` - logout API
- `client.Login` - login API
- `client.Audit` - audit API
- `client.Analytics` - analytics API
- `client.Activity` - activity API
- `client.Account` - account API
- `client.Ab` - ab API
- `client.Sku` - sku API
- `client.Products` - products API
- `client.Positions` - positions API
- `client.Members` - members API
- `client.Departments` - departments API
- `client.Children` - children API
- `client.Statistics` - statistics API
- `client.Member` - member API
- `client.List` - list API
- `client.Code` - code API
- `client.Auth` - auth API
- `client.Generation` - generation API

## Usage Examples

### workspaces

```csharp
// 获取工作空间详情
var result = await client.Workspaces.GetWorkspaceDetailAsync();
Console.WriteLine(result);
```

### voice_speakers

```csharp
// 获取发音人详情
var result = await client.VoiceSpeakers.GetSpeakerDetailAsync();
Console.WriteLine(result);
```

### video

```csharp
// 获取视频详情
var result = await client.Video.GetVideoAsync();
Console.WriteLine(result);
```

### settings

```csharp
// 获取用户设置
var result = await client.Settings.GetUserAsync();
Console.WriteLine(result);
```

### profile

```csharp
// 获取用户信息
var result = await client.Profile.GetUserAsync();
Console.WriteLine(result);
```

### password

```csharp
// 修改密码
var result = await client.Password.ChangeAsync();
Console.WriteLine(result);
```

### address

```csharp
// 获取地址详情
var result = await client.Address.GetAddressDetailAsync();
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

### partner

```csharp
// 获取合作伙伴详情
var result = await client.Partner.GetPartnerAsync();
Console.WriteLine(result);
```

### notification

```csharp
// 标记已读
var result = await client.Notification.MarkAsReadAsync();
Console.WriteLine(result);
```

### app

```csharp
// 获取笔记详情
var result = await client.App.GetNoteDetailAsync();
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
// Rename drive item
var result = await client.Drive.RenameItemAsync();
Console.WriteLine(result);
```

### app_documents

```csharp
// Get document detail
var result = await client.AppDocuments.GetDocumentDetailAsync();
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

### announcement

```csharp
// 标记已读
var result = await client.Announcement.MarkAsReadAsync();
Console.WriteLine(result);
```

### advert

```csharp
// 广告设置
var result = await client.Advert.GetAdvertSettingsAsync();
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

### deactivate

```csharp
// 注销账号
var result = await client.Deactivate.AccountAsync();
Console.WriteLine(result);
```

### bind

```csharp
// 绑定第三方账号
var result = await client.Bind.ThirdPartyAccountAsync();
Console.WriteLine(result);
```

### avatar

```csharp
// 上传头像
var result = await client.Avatar.UploadAsync();
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

### disable

```csharp
// 禁用组织
var result = await client.Disable.OrganizationAsync();
Console.WriteLine(result);
```

### activate

```csharp
// 激活组织
var result = await client.Activate.OrganizationAsync();
Console.WriteLine(result);
```

### position

```csharp
// 创建岗位
var result = await client.Position.CreatePositionAsync();
Console.WriteLine(result);
```

### department

```csharp
// 创建部门
var result = await client.Department.CreateDepartmentAsync();
Console.WriteLine(result);
```

### orders

```csharp
// 获取订单列表
var result = await client.Orders.ListOrdersAsync();
Console.WriteLine(result);
```

### models

```csharp
// 批量获取模型价格
var result = await client.Models.GetModelPricesAsync();
Console.WriteLine(result);
```

### history

```csharp
// 浏览历史
var result = await client.History.ListBrowseAsync();
Console.WriteLine(result);
```

### voice_speaker

```csharp
// 创建语音生成任务
var result = await client.VoiceSpeaker.CreateGenerationAsync();
Console.WriteLine(result);
```

### sound_effect

```csharp
// 创建音效生成任务
var result = await client.SoundEffect.CreateGenerationAsync();
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
// 取消点赞Feed
var result = await client.Feed.UnlikeAsync();
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

### sms

```csharp
// 验证验证码
var result = await client.Sms.VerifySmsCodeAsync();
Console.WriteLine(result);
```

### register

```csharp
// 用户注册
var result = await client.Register.RegisterAsync();
Console.WriteLine(result);
```

### refresh

```csharp
// 刷新令牌
var result = await client.Refresh.TokenAsync();
Console.WriteLine(result);
```

### qr

```csharp
// 生成登录二维码
var result = await client.Qr.GenerateQrCodeAsync();
Console.WriteLine(result);
```

### phone

```csharp
// 手机号验证码登录
var result = await client.Phone.LoginAsync();
Console.WriteLine(result);
```

### oauth

```csharp
// OAuth授权URL
var result = await client.Oauth.GetOauthUrlAsync();
Console.WriteLine(result);
```

### logout

```csharp
// 用户登出
var result = await client.Logout.LogoutAsync();
Console.WriteLine(result);
```

### login

```csharp
// 用户登录
var result = await client.Login.LoginAsync();
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

### products

```csharp
// 获取商品列表
var result = await client.Products.GetProductsAsync();
Console.WriteLine(result);
```

### positions

```csharp
// 获取组织的岗位列表
var result = await client.Positions.GetPositionsByOrgAsync();
Console.WriteLine(result);
```

### members

```csharp
// 获取组织成员
var result = await client.Members.GetMembersByOrgAsync();
Console.WriteLine(result);
```

### departments

```csharp
// 获取组织的部门列表
var result = await client.Departments.GetDepartmentsByOrgAsync();
Console.WriteLine(result);
```

### children

```csharp
// 获取子组织
var result = await client.Children.GetChildOrganizationsAsync();
Console.WriteLine(result);
```

### statistics

```csharp
// 获取组织统计
var result = await client.Statistics.GetOrganizationAsync();
Console.WriteLine(result);
```

### member

```csharp
// 获取成员详情
var result = await client.Member.GetMemberAsync();
Console.WriteLine(result);
```

### list

```csharp
// 获取组织列表
var result = await client.List.GetOrganizationAsync();
Console.WriteLine(result);
```

### code

```csharp
// 根据编码获取组织
var result = await client.Code.GetOrganizationByAsync();
Console.WriteLine(result);
```

### auth

```csharp
// Request password reset challenge
var result = await client.Auth.RequestPasswordResetChallengeAsync();
Console.WriteLine(result);
```

### generation

```csharp
// Enhance generation prompt
var result = await client.Generation.EnhanceGenerationPromptAsync();
Console.WriteLine(result);
```

## Error Handling

```csharp
try
{
    var result = await client.Tenant.GetTenantTypesAsync();
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
