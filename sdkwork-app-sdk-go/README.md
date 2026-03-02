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
    result, err := client.Tenant.GetTenantTypes()
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

```go
// 获取工作空间详情
result, err := client.Workspaces.GetWorkspaceDetail()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### voice_speakers

```go
// 获取发音人详情
result, err := client.VoiceSpeakers.GetSpeakerDetail()
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

### settings

```go
// 获取用户设置
result, err := client.Settings.GetUser()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### profile

```go
// 获取用户信息
result, err := client.Profile.GetUser()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### password

```go
// 修改密码
result, err := client.Password.Change()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### address

```go
// 获取地址详情
result, err := client.Address.GetAddressDetail()
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
// 标记已读
result, err := client.Notification.MarkAsRead()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### app

```go
// 获取笔记详情
result, err := client.App.GetNoteDetail()
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
// Rename drive item
result, err := client.Drive.RenameItem()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### app_documents

```go
// Get document detail
result, err := client.AppDocuments.GetDocumentDetail()
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

### announcement

```go
// 标记已读
result, err := client.Announcement.MarkAsRead()
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

### deactivate

```go
// 注销账号
result, err := client.Deactivate.Account()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### bind

```go
// 绑定第三方账号
result, err := client.Bind.ThirdPartyAccount()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### avatar

```go
// 上传头像
result, err := client.Avatar.Upload()
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

### disable

```go
// 禁用组织
result, err := client.Disable.Organization()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### activate

```go
// 激活组织
result, err := client.Activate.Organization()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### position

```go
// 创建岗位
result, err := client.Position.CreatePosition()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### department

```go
// 创建部门
result, err := client.Department.CreateDepartment()
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

### models

```go
// 批量获取模型价格
result, err := client.Models.GetModelPrices()
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

### voice_speaker

```go
// 创建语音生成任务
result, err := client.VoiceSpeaker.CreateGeneration()
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
// 取消点赞Feed
result, err := client.Feed.Unlike()
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

### sms

```go
// 验证验证码
result, err := client.Sms.VerifySmsCode()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### register

```go
// 用户注册
result, err := client.Register.Register()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### refresh

```go
// 刷新令牌
result, err := client.Refresh.Token()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### qr

```go
// 生成登录二维码
result, err := client.Qr.GenerateQrCode()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### phone

```go
// 手机号验证码登录
result, err := client.Phone.Login()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### oauth

```go
// OAuth授权URL
result, err := client.Oauth.GetOauthUrl()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### logout

```go
// 用户登出
result, err := client.Logout.Logout()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### login

```go
// 用户登录
result, err := client.Login.Login()
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

### products

```go
// 获取商品列表
result, err := client.Products.GetProducts()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### positions

```go
// 获取组织的岗位列表
result, err := client.Positions.GetPositionsByOrg()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### members

```go
// 获取组织成员
result, err := client.Members.GetMembersByOrg()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### departments

```go
// 获取组织的部门列表
result, err := client.Departments.GetDepartmentsByOrg()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### children

```go
// 获取子组织
result, err := client.Children.GetChildOrganizations()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### statistics

```go
// 获取组织统计
result, err := client.Statistics.GetOrganization()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### member

```go
// 获取成员详情
result, err := client.Member.GetMember()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### list

```go
// 获取组织列表
result, err := client.List.GetOrganization()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### code

```go
// 根据编码获取组织
result, err := client.Code.GetOrganizationBy()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### auth

```go
// Request password reset challenge
result, err := client.Auth.RequestPasswordResetChallenge()
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

## Error Handling

```go
result, err := client.Tenant.GetTenantTypes()
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
