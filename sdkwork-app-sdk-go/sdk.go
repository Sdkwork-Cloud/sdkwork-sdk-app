package app

import (
    "github.com/sdkwork/app-sdk/api"
    sdkhttp "github.com/sdkwork/app-sdk/http"
)

type SdkworkAppClient struct {
    http *sdkhttp.Client
    Workspaces *api.WorkspacesApi
    VoiceSpeaker *api.VoiceSpeakerApi
    Video *api.VideoApi
    User *api.UserApi
    Tool *api.ToolApi
    Tenant *api.TenantApi
    Social *api.SocialApi
    Skill *api.SkillApi
    Shops *api.ShopsApi
    Share *api.ShareApi
    Settings *api.SettingsApi
    Ai *api.AiApi
    Projects *api.ProjectsApi
    Products *api.ProductsApi
    Partner *api.PartnerApi
    Notification *api.NotificationApi
    Notes *api.NotesApi
    News *api.NewsApi
    Music *api.MusicApi
    KnowledgeDocuments *api.KnowledgeDocumentsApi
    Invoice *api.InvoiceApi
    Image *api.ImageApi
    Style *api.StyleApi
    FileSystem *api.FileSystemApi
    Feedback *api.FeedbackApi
    Favorite *api.FavoriteApi
    Drive *api.DriveApi
    Documents *api.DocumentsApi
    Dashboard *api.DashboardApi
    Collection *api.CollectionApi
    Chat *api.ChatApi
    Character *api.CharacterApi
    Category *api.CategoryApi
    Cart *api.CartApi
    Assets *api.AssetsApi
    App *api.AppApi
    Announcement *api.AnnouncementApi
    Agent *api.AgentApi
    Advert *api.AdvertApi
    Wallet *api.WalletApi
    Vote *api.VoteApi
    Vip *api.VipApi
    Upload *api.UploadApi
    Search *api.SearchApi
    Rtc *api.RtcApi
    Payments *api.PaymentsApi
    Organization *api.OrganizationApi
    Orders *api.OrdersApi
    Model *api.ModelApi
    History *api.HistoryApi
    SoundEffect *api.SoundEffectApi
    Generation *api.GenerationApi
    Audio *api.AudioApi
    Feed *api.FeedApi
    Currency *api.CurrencyApi
    Coupons *api.CouponsApi
    Comments *api.CommentsApi
    Auth *api.AuthApi
    Audit *api.AuditApi
    Analytics *api.AnalyticsApi
    AgentMemory *api.AgentMemoryApi
    Activity *api.ActivityApi
    Account *api.AccountApi
    Ab *api.AbApi
    Sku *api.SkuApi
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
        VoiceSpeaker: api.NewVoiceSpeakerApi(client),
        Video: api.NewVideoApi(client),
        User: api.NewUserApi(client),
        Tool: api.NewToolApi(client),
        Tenant: api.NewTenantApi(client),
        Social: api.NewSocialApi(client),
        Skill: api.NewSkillApi(client),
        Shops: api.NewShopsApi(client),
        Share: api.NewShareApi(client),
        Settings: api.NewSettingsApi(client),
        Ai: api.NewAiApi(client),
        Projects: api.NewProjectsApi(client),
        Products: api.NewProductsApi(client),
        Partner: api.NewPartnerApi(client),
        Notification: api.NewNotificationApi(client),
        Notes: api.NewNotesApi(client),
        News: api.NewNewsApi(client),
        Music: api.NewMusicApi(client),
        KnowledgeDocuments: api.NewKnowledgeDocumentsApi(client),
        Invoice: api.NewInvoiceApi(client),
        Image: api.NewImageApi(client),
        Style: api.NewStyleApi(client),
        FileSystem: api.NewFileSystemApi(client),
        Feedback: api.NewFeedbackApi(client),
        Favorite: api.NewFavoriteApi(client),
        Drive: api.NewDriveApi(client),
        Documents: api.NewDocumentsApi(client),
        Dashboard: api.NewDashboardApi(client),
        Collection: api.NewCollectionApi(client),
        Chat: api.NewChatApi(client),
        Character: api.NewCharacterApi(client),
        Category: api.NewCategoryApi(client),
        Cart: api.NewCartApi(client),
        Assets: api.NewAssetsApi(client),
        App: api.NewAppApi(client),
        Announcement: api.NewAnnouncementApi(client),
        Agent: api.NewAgentApi(client),
        Advert: api.NewAdvertApi(client),
        Wallet: api.NewWalletApi(client),
        Vote: api.NewVoteApi(client),
        Vip: api.NewVipApi(client),
        Upload: api.NewUploadApi(client),
        Search: api.NewSearchApi(client),
        Rtc: api.NewRtcApi(client),
        Payments: api.NewPaymentsApi(client),
        Organization: api.NewOrganizationApi(client),
        Orders: api.NewOrdersApi(client),
        Model: api.NewModelApi(client),
        History: api.NewHistoryApi(client),
        SoundEffect: api.NewSoundEffectApi(client),
        Generation: api.NewGenerationApi(client),
        Audio: api.NewAudioApi(client),
        Feed: api.NewFeedApi(client),
        Currency: api.NewCurrencyApi(client),
        Coupons: api.NewCouponsApi(client),
        Comments: api.NewCommentsApi(client),
        Auth: api.NewAuthApi(client),
        Audit: api.NewAuditApi(client),
        Analytics: api.NewAnalyticsApi(client),
        AgentMemory: api.NewAgentMemoryApi(client),
        Activity: api.NewActivityApi(client),
        Account: api.NewAccountApi(client),
        Ab: api.NewAbApi(client),
        Sku: api.NewSkuApi(client),
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
