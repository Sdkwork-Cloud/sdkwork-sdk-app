# sdkwork-app-sdk (Java)

Professional Java SDK for SDKWork API.

## Installation

Add to your `pom.xml`:

```xml
<dependency>
    <groupId>com.sdkwork</groupId>
    <artifactId>app-sdk</artifactId>
    <version>1.0.1</version>
</dependency>
```

Or with Gradle:

```groovy
implementation 'com.sdkwork:app-sdk:1.0.1'
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
        Object result = client.getTenant().getTenantTypes();
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
- `client.getVoiceSpeakers()` - voice_speakers API
- `client.getVideo()` - video API
- `client.getSettings()` - settings API
- `client.getProfile()` - profile API
- `client.getPassword()` - password API
- `client.getAddress()` - address API
- `client.getTenant()` - tenant API
- `client.getSocial()` - social API
- `client.getShops()` - shops API
- `client.getShare()` - share API
- `client.getAi()` - ai API
- `client.getProjects()` - projects API
- `client.getPartner()` - partner API
- `client.getNotification()` - notification API
- `client.getApp()` - app API
- `client.getNews()` - news API
- `client.getMusic()` - music API
- `client.getInvoice()` - invoice API
- `client.getImage()` - image API
- `client.getStyle()` - style API
- `client.getFileSystem()` - file_system API
- `client.getFeedback()` - feedback API
- `client.getFavorite()` - favorite API
- `client.getDrive()` - drive API
- `client.getAppDocuments()` - app_documents API
- `client.getDashboard()` - dashboard API
- `client.getCollection()` - collection API
- `client.getChat()` - chat API
- `client.getCharacter()` - character API
- `client.getCategory()` - category API
- `client.getCart()` - cart API
- `client.getAssets()` - assets API
- `client.getAnnouncement()` - announcement API
- `client.getAdvert()` - advert API
- `client.getVote()` - vote API
- `client.getVip()` - vip API
- `client.getDeactivate()` - deactivate API
- `client.getBind()` - bind API
- `client.getAvatar()` - avatar API
- `client.getUpload()` - upload API
- `client.getSearch()` - search API
- `client.getPayments()` - payments API
- `client.getOrganization()` - organization API
- `client.getDisable()` - disable API
- `client.getActivate()` - activate API
- `client.getPosition()` - position API
- `client.getDepartment()` - department API
- `client.getOrders()` - orders API
- `client.getModels()` - models API
- `client.getHistory()` - history API
- `client.getVoiceSpeaker()` - voice_speaker API
- `client.getSoundEffect()` - sound_effect API
- `client.getAudio()` - audio API
- `client.getFeed()` - feed API
- `client.getCurrency()` - currency API
- `client.getCoupons()` - coupons API
- `client.getComments()` - comments API
- `client.getSms()` - sms API
- `client.getRegister()` - register API
- `client.getRefresh()` - refresh API
- `client.getQr()` - qr API
- `client.getPhone()` - phone API
- `client.getOauth()` - oauth API
- `client.getLogout()` - logout API
- `client.getLogin()` - login API
- `client.getAudit()` - audit API
- `client.getAnalytics()` - analytics API
- `client.getActivity()` - activity API
- `client.getAccount()` - account API
- `client.getAb()` - ab API
- `client.getSku()` - sku API
- `client.getProducts()` - products API
- `client.getPositions()` - positions API
- `client.getMembers()` - members API
- `client.getDepartments()` - departments API
- `client.getChildren()` - children API
- `client.getStatistics()` - statistics API
- `client.getMember()` - member API
- `client.getList()` - list API
- `client.getCode()` - code API
- `client.getAuth()` - auth API
- `client.getGeneration()` - generation API

## Usage Examples

### workspaces

```java
// 获取工作空间详情
Object result = client.getWorkspaces().getWorkspaceDetail();
System.out.println(result);
```

### voice_speakers

```java
// 获取发音人详情
Object result = client.getVoiceSpeakers().getSpeakerDetail();
System.out.println(result);
```

### video

```java
// 获取视频详情
Object result = client.getVideo().getVideo();
System.out.println(result);
```

### settings

```java
// 获取用户设置
Object result = client.getSettings().getUser();
System.out.println(result);
```

### profile

```java
// 获取用户信息
Object result = client.getProfile().getUser();
System.out.println(result);
```

### password

```java
// 修改密码
Object result = client.getPassword().change();
System.out.println(result);
```

### address

```java
// 获取地址详情
Object result = client.getAddress().getAddressDetail();
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

### partner

```java
// 获取合作伙伴详情
Object result = client.getPartner().getPartner();
System.out.println(result);
```

### notification

```java
// 标记已读
Object result = client.getNotification().markAsRead();
System.out.println(result);
```

### app

```java
// 获取笔记详情
Object result = client.getApp().getNoteDetail();
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
// Rename drive item
Object result = client.getDrive().renameItem();
System.out.println(result);
```

### app_documents

```java
// Get document detail
Object result = client.getAppDocuments().getDocumentDetail();
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

### announcement

```java
// 标记已读
Object result = client.getAnnouncement().markAsRead();
System.out.println(result);
```

### advert

```java
// 广告设置
Object result = client.getAdvert().getAdvertSettings();
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

### deactivate

```java
// 注销账号
Object result = client.getDeactivate().account();
System.out.println(result);
```

### bind

```java
// 绑定第三方账号
Object result = client.getBind().thirdPartyAccount();
System.out.println(result);
```

### avatar

```java
// 上传头像
Object result = client.getAvatar().upload();
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

### disable

```java
// 禁用组织
Object result = client.getDisable().organization();
System.out.println(result);
```

### activate

```java
// 激活组织
Object result = client.getActivate().organization();
System.out.println(result);
```

### position

```java
// 创建岗位
Object result = client.getPosition().createPosition();
System.out.println(result);
```

### department

```java
// 创建部门
Object result = client.getDepartment().createDepartment();
System.out.println(result);
```

### orders

```java
// 获取订单列表
Object result = client.getOrders().listOrders();
System.out.println(result);
```

### models

```java
// 批量获取模型价格
Object result = client.getModels().getModelPrices();
System.out.println(result);
```

### history

```java
// 浏览历史
Object result = client.getHistory().listBrowse();
System.out.println(result);
```

### voice_speaker

```java
// 创建语音生成任务
Object result = client.getVoiceSpeaker().createGeneration();
System.out.println(result);
```

### sound_effect

```java
// 创建音效生成任务
Object result = client.getSoundEffect().createGeneration();
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
// 取消点赞Feed
Object result = client.getFeed().unlike();
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

### sms

```java
// 验证验证码
Object result = client.getSms().verifySmsCode();
System.out.println(result);
```

### register

```java
// 用户注册
Object result = client.getRegister().register();
System.out.println(result);
```

### refresh

```java
// 刷新令牌
Object result = client.getRefresh().token();
System.out.println(result);
```

### qr

```java
// 生成登录二维码
Object result = client.getQr().generateQrCode();
System.out.println(result);
```

### phone

```java
// 手机号验证码登录
Object result = client.getPhone().login();
System.out.println(result);
```

### oauth

```java
// OAuth授权URL
Object result = client.getOauth().getOauthUrl();
System.out.println(result);
```

### logout

```java
// 用户登出
Object result = client.getLogout().logout();
System.out.println(result);
```

### login

```java
// 用户登录
Object result = client.getLogin().login();
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

### products

```java
// 获取商品列表
Object result = client.getProducts().getProducts();
System.out.println(result);
```

### positions

```java
// 获取组织的岗位列表
Object result = client.getPositions().getPositionsByOrg();
System.out.println(result);
```

### members

```java
// 获取组织成员
Object result = client.getMembers().getMembersByOrg();
System.out.println(result);
```

### departments

```java
// 获取组织的部门列表
Object result = client.getDepartments().getDepartmentsByOrg();
System.out.println(result);
```

### children

```java
// 获取子组织
Object result = client.getChildren().getChildOrganizations();
System.out.println(result);
```

### statistics

```java
// 获取组织统计
Object result = client.getStatistics().getOrganization();
System.out.println(result);
```

### member

```java
// 获取成员详情
Object result = client.getMember().getMember();
System.out.println(result);
```

### list

```java
// 获取组织列表
Object result = client.getList().getOrganization();
System.out.println(result);
```

### code

```java
// 根据编码获取组织
Object result = client.getCode().getOrganizationBy();
System.out.println(result);
```

### auth

```java
// Request password reset challenge
Object result = client.getAuth().requestPasswordResetChallenge();
System.out.println(result);
```

### generation

```java
// Enhance generation prompt
Object result = client.getGeneration().enhanceGenerationPrompt();
System.out.println(result);
```

## Error Handling

```java
try {
    Object result = client.getTenant().getTenantTypes();
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
