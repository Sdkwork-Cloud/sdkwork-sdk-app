# sdkwork-app-sdk (Java)

Professional Java SDK for SDKWork API.

## Installation

Add to your `pom.xml`:

```xml
<dependency>
    <groupId>com.sdkwork</groupId>
    <artifactId>app-sdk</artifactId>
    <version>1.0.0</version>
</dependency>
```

Or with Gradle:

```groovy
implementation 'com.sdkwork:app-sdk:1.0.0'
```

## Quick Start

```java
import com.sdkwork.app.SdkworkAppClient;
import com.sdkwork.common.core.Types;

public class Main {
    public static void main(String[] args) throws Exception {
        Types.SdkConfig config = new Types.SdkConfig("http://localhost:8080");
        SdkworkAppClient client = new SdkworkAppClient(config);
        client.setApiKey("your-api-key");
        
        // Use the SDK
        Object result = client.getUser().getUserSettings();
        System.out.println(result);
    }
}
```

## Authentication Modes (Mutually Exclusive)

Choose exactly one mode for the same client instance.

### Mode A: API Key

```java
Types.SdkConfig config = new Types.SdkConfig("http://localhost:8080");
SdkworkAppClient client = new SdkworkAppClient(config);
client.setApiKey("your-api-key");
// Sends: Authorization: Bearer <apiKey>
```

### Mode B: Dual Token

```java
Types.SdkConfig config = new Types.SdkConfig("http://localhost:8080");
SdkworkAppClient client = new SdkworkAppClient(config);
client.setAuthToken("your-auth-token");
client.setAccessToken("your-access-token");
// Sends:
// Authorization: Bearer <authToken>
// Access-Token: <accessToken>
```

> Do not call `setApiKey(...)` together with `setAuthToken(...)` + `setAccessToken(...)` on the same client.

## Configuration (Non-Auth)

```java
Types.SdkConfig config = new Types.SdkConfig("http://localhost:8080");
SdkworkAppClient client = new SdkworkAppClient(config);

// Set custom headers
client.getHttpClient().setHeader("X-Custom-Header", "value");
```

## API Modules

- `client.getWorkspaces()` - workspaces API
- `client.getVoiceSpeaker()` - voice_speaker API
- `client.getVideo()` - video API
- `client.getUser()` - user API
- `client.getTool()` - tool API
- `client.getTenant()` - tenant API
- `client.getSocial()` - social API
- `client.getSkill()` - skill API
- `client.getShops()` - shops API
- `client.getShare()` - share API
- `client.getSettings()` - settings API
- `client.getAi()` - ai API
- `client.getProjects()` - projects API
- `client.getProducts()` - products API
- `client.getPartner()` - partner API
- `client.getNotification()` - notification API
- `client.getNotes()` - notes API
- `client.getNews()` - news API
- `client.getMusic()` - music API
- `client.getKnowledgeDocuments()` - knowledge_documents API
- `client.getInvoice()` - invoice API
- `client.getImage()` - image API
- `client.getStyle()` - style API
- `client.getFileSystem()` - file_system API
- `client.getFeedback()` - feedback API
- `client.getFavorite()` - favorite API
- `client.getDrive()` - drive API
- `client.getDocuments()` - documents API
- `client.getDashboard()` - dashboard API
- `client.getCollection()` - collection API
- `client.getChat()` - chat API
- `client.getCharacter()` - character API
- `client.getCategory()` - category API
- `client.getCart()` - cart API
- `client.getAssets()` - assets API
- `client.getApp()` - app API
- `client.getAnnouncement()` - announcement API
- `client.getAgent()` - agent API
- `client.getAdvert()` - advert API
- `client.getWallet()` - wallet API
- `client.getVote()` - vote API
- `client.getVip()` - vip API
- `client.getUpload()` - upload API
- `client.getSearch()` - search API
- `client.getRtc()` - rtc API
- `client.getPayments()` - payments API
- `client.getOrganization()` - organization API
- `client.getOrders()` - orders API
- `client.getModel()` - model API
- `client.getHistory()` - history API
- `client.getSoundEffect()` - sound_effect API
- `client.getGeneration()` - generation API
- `client.getAudio()` - audio API
- `client.getFeed()` - feed API
- `client.getCurrency()` - currency API
- `client.getCoupons()` - coupons API
- `client.getComments()` - comments API
- `client.getAuth()` - auth API
- `client.getAudit()` - audit API
- `client.getAnalytics()` - analytics API
- `client.getAgentMemory()` - agent_memory API
- `client.getActivity()` - activity API
- `client.getAccount()` - account API
- `client.getAb()` - ab API
- `client.getSku()` - sku API

## Usage Examples

### workspaces

```java
// 获取工作空间详情
Object result = client.getWorkspaces().getWorkspaceDetail();
System.out.println(result);
```

### voice_speaker

```java
// 获取发音人详情
Object result = client.getVoiceSpeaker().getSpeakerDetail();
System.out.println(result);
```

### video

```java
// 获取视频详情
Object result = client.getVideo().getVideo();
System.out.println(result);
```

### user

```java
// 获取用户设置
Object result = client.getUser().getUserSettings();
System.out.println(result);
```

### tool

```java
// Update tool credentials
Object result = client.getTool().updateCredentials();
System.out.println(result);
```

### tenant

```java
// 获取租户详情
Object result = client.getTenant().getTenant();
System.out.println(result);
```

### social

```java
// 标记消息已读
Object result = client.getSocial().markMessagesAsRead();
System.out.println(result);
```

### skill

```java
// Get skill detail
Object result = client.getSkill().detail();
System.out.println(result);
```

### shops

```java
// 获取店铺详情
Object result = client.getShops().getShopDetail();
System.out.println(result);
```

### share

```java
// 更新分享设置
Object result = client.getShare().updateShareSettings();
System.out.println(result);
```

### settings

```java
// 获取模块设置
Object result = client.getSettings().getModule();
System.out.println(result);
```

### ai

```java
// 获取提示语详情
Object result = client.getAi().getPromptDetail();
System.out.println(result);
```

### projects

```java
// 获取项目详情
Object result = client.getProjects().getProjectDetail();
System.out.println(result);
```

### products

```java
// 更新商品属性
Object result = client.getProducts().updateProductAttribute();
System.out.println(result);
```

### partner

```java
// 获取合作伙伴详情
Object result = client.getPartner().getPartner();
System.out.println(result);
```

### notification

```java
// Mark notification as unread
Object result = client.getNotification().markAsUnread();
System.out.println(result);
```

### notes

```java
// 获取笔记详情
Object result = client.getNotes().getNoteDetail();
System.out.println(result);
```

### news

```java
// 获取新闻详情
Object result = client.getNews().getNews();
System.out.println(result);
```

### music

```java
// 获取音乐详情
Object result = client.getMusic().getMusic();
System.out.println(result);
```

### knowledge_documents

```java
// Restore knowledge document
Object result = client.getKnowledgeDocuments().restoreKnowledgeDocument();
System.out.println(result);
```

### invoice

```java
// 获取发票详情
Object result = client.getInvoice().getInvoice();
System.out.println(result);
```

### image

```java
// 获取图片详情
Object result = client.getImage().getImage();
System.out.println(result);
```

### style

```java
// 获取风格详情
Object result = client.getStyle().getStyle();
System.out.println(result);
```

### file_system

```java
// Rename node
Object result = client.getFileSystem().renameNode();
System.out.println(result);
```

### feedback

```java
// 关闭反馈
Object result = client.getFeedback().close();
System.out.println(result);
```

### favorite

```java
// 移动收藏
Object result = client.getFavorite().moveFavoriteToFolder();
System.out.println(result);
```

### drive

```java
// Restore drive item
Object result = client.getDrive().restoreItem();
System.out.println(result);
```

### documents

```java
// Get document detail
Object result = client.getDocuments().getDocumentDetail();
System.out.println(result);
```

### dashboard

```java
// 完成待办
Object result = client.getDashboard().completeTodoItem();
System.out.println(result);
```

### collection

```java
// 获取合集详情
Object result = client.getCollection().getCollection();
System.out.println(result);
```

### chat

```java
// 获取会话详情
Object result = client.getChat().getSessionDetail();
System.out.println(result);
```

### character

```java
// 获取角色详情
Object result = client.getCharacter().getCharacter();
System.out.println(result);
```

### category

```java
// 获取分类详情
Object result = client.getCategory().getCategoryDetail();
System.out.println(result);
```

### cart

```java
// 更新购物车商品数量
Object result = client.getCart().updateItemQuantity();
System.out.println(result);
```

### assets

```java
// 重命名资产
Object result = client.getAssets().renameAsset();
System.out.println(result);
```

### app

```java
// 获取应用详情
Object result = client.getApp().getApp();
System.out.println(result);
```

### announcement

```java
// 标记已读
Object result = client.getAnnouncement().markAsRead();
System.out.println(result);
```

### agent

```java
// Get agent
Object result = client.getAgent().get();
System.out.println(result);
```

### advert

```java
// 广告设置
Object result = client.getAdvert().getAdvertSettings();
System.out.println(result);
```

### wallet

```java
// 钱包提现
Object result = client.getWallet().withdraw();
System.out.println(result);
```

### vote

```java
// 投票
Object result = client.getVote().vote();
System.out.println(result);
```

### vip

```java
// 购买VIP
Object result = client.getVip().purchase();
System.out.println(result);
```

### upload

```java
// 获取上传策略
Object result = client.getUpload().getUploadPolicy();
System.out.println(result);
```

### search

```java
// 搜索历史
Object result = client.getSearch().getSearchHistory();
System.out.println(result);
```

### rtc

```java
// Create RTC room
Object result = client.getRtc().createRoom();
System.out.println(result);
```

### payments

```java
// 创建支付
Object result = client.getPayments().createPayment();
System.out.println(result);
```

### organization

```java
// 创建组织
Object result = client.getOrganization().createOrganization();
System.out.println(result);
```

### orders

```java
// 获取订单列表
Object result = client.getOrders().listOrders();
System.out.println(result);
```

### model

```java
// Batch get model prices
Object result = client.getModel().getModelPrices();
System.out.println(result);
```

### history

```java
// 浏览历史
Object result = client.getHistory().listBrowse();
System.out.println(result);
```

### sound_effect

```java
// 创建音效生成任务
Object result = client.getSoundEffect().createGeneration();
System.out.println(result);
```

### generation

```java
// Enhance generation prompt
Object result = client.getGeneration().enhanceGenerationPrompt();
System.out.println(result);
```

### audio

```java
// 语音克隆
Object result = client.getAudio().voiceClone();
System.out.println(result);
```

### feed

```java
// Create feed
Object result = client.getFeed().create();
System.out.println(result);
```

### currency

```java
// 创建货币
Object result = client.getCurrency().createCurrency();
System.out.println(result);
```

### coupons

```java
// 领取优惠券
Object result = client.getCoupons().receiveCoupon();
System.out.println(result);
```

### comments

```java
// 发表评论
Object result = client.getComments().createComment();
System.out.println(result);
```

### auth

```java
// 验证验证码
Object result = client.getAuth().verifySmsCode();
System.out.println(result);
```

### audit

```java
// 审核申诉
Object result = client.getAudit().submitAppeal();
System.out.println(result);
```

### analytics

```java
// 上报页面访问
Object result = client.getAnalytics().trackPageView();
System.out.println(result);
```

### agent_memory

```java
// List memories
Object result = client.getAgentMemory().list();
System.out.println(result);
```

### activity

```java
// 参与活动
Object result = client.getActivity().join();
System.out.println(result);
```

### account

```java
// 积分转账
Object result = client.getAccount().transfer();
System.out.println(result);
```

### ab

```java
// 实验反馈
Object result = client.getAb().submitExperimentFeedback();
System.out.println(result);
```

### sku

```java
// 获取SKU详情
Object result = client.getSku().getSkuDetail();
System.out.println(result);
```

## Error Handling

```java
try {
    Object result = client.getUser().getUserSettings();
} catch (Exception e) {
    System.err.println("Error: " + e.getMessage());
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

> Use Maven `settings.xml` credentials and optional `MAVEN_PUBLISH_PROFILE`.

## License

MIT
