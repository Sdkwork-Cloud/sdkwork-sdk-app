package app

import (
    "github.com/sdkwork/app-sdk/api"
    sdkhttp "github.com/sdkwork/app-sdk/http"
)

type SdkworkAppClient struct {
    http *sdkhttp.Client
    Workspaces *api.WorkspacesApi
    VoiceSpeakers *api.VoiceSpeakersApi
    Video *api.VideoApi
    Settings *api.SettingsApi
    Profile *api.ProfileApi
    Password *api.PasswordApi
    Address *api.AddressApi
    Tenant *api.TenantApi
    Social *api.SocialApi
    Shops *api.ShopsApi
    Share *api.ShareApi
    Ai *api.AiApi
    Projects *api.ProjectsApi
    Partner *api.PartnerApi
    Notification *api.NotificationApi
    App *api.AppApi
    News *api.NewsApi
    Music *api.MusicApi
    Invoice *api.InvoiceApi
    Image *api.ImageApi
    Style *api.StyleApi
    FileSystem *api.FileSystemApi
    Feedback *api.FeedbackApi
    Favorite *api.FavoriteApi
    Drive *api.DriveApi
    AppDocuments *api.AppDocumentsApi
    Dashboard *api.DashboardApi
    Collection *api.CollectionApi
    Chat *api.ChatApi
    Character *api.CharacterApi
    Category *api.CategoryApi
    Cart *api.CartApi
    Assets *api.AssetsApi
    Announcement *api.AnnouncementApi
    Advert *api.AdvertApi
    Vote *api.VoteApi
    Vip *api.VipApi
    Deactivate *api.DeactivateApi
    Bind *api.BindApi
    Avatar *api.AvatarApi
    Upload *api.UploadApi
    Search *api.SearchApi
    Payments *api.PaymentsApi
    Organization *api.OrganizationApi
    Disable *api.DisableApi
    Activate *api.ActivateApi
    Position *api.PositionApi
    Department *api.DepartmentApi
    Orders *api.OrdersApi
    Models *api.ModelsApi
    History *api.HistoryApi
    VoiceSpeaker *api.VoiceSpeakerApi
    SoundEffect *api.SoundEffectApi
    Audio *api.AudioApi
    Feed *api.FeedApi
    Currency *api.CurrencyApi
    Coupons *api.CouponsApi
    Comments *api.CommentsApi
    Sms *api.SmsApi
    Register *api.RegisterApi
    Refresh *api.RefreshApi
    Qr *api.QrApi
    Phone *api.PhoneApi
    Oauth *api.OauthApi
    Logout *api.LogoutApi
    Login *api.LoginApi
    Audit *api.AuditApi
    Analytics *api.AnalyticsApi
    Activity *api.ActivityApi
    Account *api.AccountApi
    Ab *api.AbApi
    Sku *api.SkuApi
    Products *api.ProductsApi
    Positions *api.PositionsApi
    Members *api.MembersApi
    Departments *api.DepartmentsApi
    Children *api.ChildrenApi
    Statistics *api.StatisticsApi
    Member *api.MemberApi
    List *api.ListApi
    Code *api.CodeApi
}

func NewSdkworkAppClient(baseURL string) *SdkworkAppClient {
    cfg := sdkhttp.NewDefaultConfig(baseURL)
    return NewSdkworkAppClientWithConfig(cfg)
}

func NewSdkworkAppClientWithConfig(config sdkhttp.Config) *SdkworkAppClient {
    client := sdkhttp.NewClient(config)
    return &SdkworkAppClient{
        http: client,
        Workspaces: api.NewWorkspacesApi(client),
        VoiceSpeakers: api.NewVoiceSpeakersApi(client),
        Video: api.NewVideoApi(client),
        Settings: api.NewSettingsApi(client),
        Profile: api.NewProfileApi(client),
        Password: api.NewPasswordApi(client),
        Address: api.NewAddressApi(client),
        Tenant: api.NewTenantApi(client),
        Social: api.NewSocialApi(client),
        Shops: api.NewShopsApi(client),
        Share: api.NewShareApi(client),
        Ai: api.NewAiApi(client),
        Projects: api.NewProjectsApi(client),
        Partner: api.NewPartnerApi(client),
        Notification: api.NewNotificationApi(client),
        App: api.NewAppApi(client),
        News: api.NewNewsApi(client),
        Music: api.NewMusicApi(client),
        Invoice: api.NewInvoiceApi(client),
        Image: api.NewImageApi(client),
        Style: api.NewStyleApi(client),
        FileSystem: api.NewFileSystemApi(client),
        Feedback: api.NewFeedbackApi(client),
        Favorite: api.NewFavoriteApi(client),
        Drive: api.NewDriveApi(client),
        AppDocuments: api.NewAppDocumentsApi(client),
        Dashboard: api.NewDashboardApi(client),
        Collection: api.NewCollectionApi(client),
        Chat: api.NewChatApi(client),
        Character: api.NewCharacterApi(client),
        Category: api.NewCategoryApi(client),
        Cart: api.NewCartApi(client),
        Assets: api.NewAssetsApi(client),
        Announcement: api.NewAnnouncementApi(client),
        Advert: api.NewAdvertApi(client),
        Vote: api.NewVoteApi(client),
        Vip: api.NewVipApi(client),
        Deactivate: api.NewDeactivateApi(client),
        Bind: api.NewBindApi(client),
        Avatar: api.NewAvatarApi(client),
        Upload: api.NewUploadApi(client),
        Search: api.NewSearchApi(client),
        Payments: api.NewPaymentsApi(client),
        Organization: api.NewOrganizationApi(client),
        Disable: api.NewDisableApi(client),
        Activate: api.NewActivateApi(client),
        Position: api.NewPositionApi(client),
        Department: api.NewDepartmentApi(client),
        Orders: api.NewOrdersApi(client),
        Models: api.NewModelsApi(client),
        History: api.NewHistoryApi(client),
        VoiceSpeaker: api.NewVoiceSpeakerApi(client),
        SoundEffect: api.NewSoundEffectApi(client),
        Audio: api.NewAudioApi(client),
        Feed: api.NewFeedApi(client),
        Currency: api.NewCurrencyApi(client),
        Coupons: api.NewCouponsApi(client),
        Comments: api.NewCommentsApi(client),
        Sms: api.NewSmsApi(client),
        Register: api.NewRegisterApi(client),
        Refresh: api.NewRefreshApi(client),
        Qr: api.NewQrApi(client),
        Phone: api.NewPhoneApi(client),
        Oauth: api.NewOauthApi(client),
        Logout: api.NewLogoutApi(client),
        Login: api.NewLoginApi(client),
        Audit: api.NewAuditApi(client),
        Analytics: api.NewAnalyticsApi(client),
        Activity: api.NewActivityApi(client),
        Account: api.NewAccountApi(client),
        Ab: api.NewAbApi(client),
        Sku: api.NewSkuApi(client),
        Products: api.NewProductsApi(client),
        Positions: api.NewPositionsApi(client),
        Members: api.NewMembersApi(client),
        Departments: api.NewDepartmentsApi(client),
        Children: api.NewChildrenApi(client),
        Statistics: api.NewStatisticsApi(client),
        Member: api.NewMemberApi(client),
        List: api.NewListApi(client),
        Code: api.NewCodeApi(client),
    }
}

func (c *SdkworkAppClient) SetApiKey(apiKey string) *SdkworkAppClient {
    c.http.SetApiKey(apiKey)
    return c
}

func (c *SdkworkAppClient) SetAuthToken(token string) *SdkworkAppClient {
    c.http.SetAuthToken(token)
    return c
}

func (c *SdkworkAppClient) SetAccessToken(token string) *SdkworkAppClient {
    c.http.SetAccessToken(token)
    return c
}

func (c *SdkworkAppClient) SetHeader(key string, value string) *SdkworkAppClient {
    c.http.SetHeader(key, value)
    return c
}

func (c *SdkworkAppClient) Http() *sdkhttp.Client {
    return c.http
}
