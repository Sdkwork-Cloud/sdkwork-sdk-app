using System;
using App.Http;
using SDKwork.Common.Core;
using App.Api;
using App.Api;
using App.Api;
using App.Api;
using App.Api;
using App.Api;
using App.Api;
using App.Api;
using App.Api;
using App.Api;
using App.Api;
using App.Api;
using App.Api;
using App.Api;
using App.Api;
using App.Api;
using App.Api;
using App.Api;
using App.Api;
using App.Api;
using App.Api;
using App.Api;
using App.Api;
using App.Api;
using App.Api;
using App.Api;
using App.Api;
using App.Api;
using App.Api;
using App.Api;
using App.Api;
using App.Api;
using App.Api;
using App.Api;
using App.Api;
using App.Api;
using App.Api;
using App.Api;
using App.Api;
using App.Api;
using App.Api;
using App.Api;
using App.Api;
using App.Api;
using App.Api;
using App.Api;
using App.Api;
using App.Api;
using App.Api;
using App.Api;
using App.Api;
using App.Api;
using App.Api;
using App.Api;
using App.Api;
using App.Api;
using App.Api;
using App.Api;
using App.Api;
using App.Api;
using App.Api;
using App.Api;
using App.Api;
using App.Api;
using App.Api;

namespace App
{
    public class SdkworkAppClient
    {
        private readonly HttpClient _httpClient;

        public WorkspacesApi Workspaces { get; }
        public VoiceSpeakerApi VoiceSpeaker { get; }
        public VideoApi Video { get; }
        public UserApi User { get; }
        public ToolApi Tool { get; }
        public TenantApi Tenant { get; }
        public SocialApi Social { get; }
        public SkillApi Skill { get; }
        public ShopsApi Shops { get; }
        public ShareApi Share { get; }
        public SettingsApi Settings { get; }
        public AiApi Ai { get; }
        public ProjectsApi Projects { get; }
        public ProductsApi Products { get; }
        public PartnerApi Partner { get; }
        public NotificationApi Notification { get; }
        public NotesApi Notes { get; }
        public NewsApi News { get; }
        public MusicApi Music { get; }
        public KnowledgeDocumentsApi KnowledgeDocuments { get; }
        public InvoiceApi Invoice { get; }
        public ImageApi Image { get; }
        public StyleApi Style { get; }
        public FileSystemApi FileSystem { get; }
        public FeedbackApi Feedback { get; }
        public FavoriteApi Favorite { get; }
        public DriveApi Drive { get; }
        public DocumentsApi Documents { get; }
        public DashboardApi Dashboard { get; }
        public CollectionApi Collection { get; }
        public ChatApi Chat { get; }
        public CharacterApi Character { get; }
        public CategoryApi Category { get; }
        public CartApi Cart { get; }
        public AssetsApi Assets { get; }
        public AppApi App { get; }
        public AnnouncementApi Announcement { get; }
        public AgentApi Agent { get; }
        public AdvertApi Advert { get; }
        public WalletApi Wallet { get; }
        public VoteApi Vote { get; }
        public VipApi Vip { get; }
        public UploadApi Upload { get; }
        public SearchApi Search { get; }
        public RtcApi Rtc { get; }
        public PaymentsApi Payments { get; }
        public OrganizationApi Organization { get; }
        public OrdersApi Orders { get; }
        public ModelApi Model { get; }
        public HistoryApi History { get; }
        public SoundEffectApi SoundEffect { get; }
        public GenerationApi Generation { get; }
        public AudioApi Audio { get; }
        public FeedApi Feed { get; }
        public CurrencyApi Currency { get; }
        public CouponsApi Coupons { get; }
        public CommentsApi Comments { get; }
        public AuthApi Auth { get; }
        public AuditApi Audit { get; }
        public AnalyticsApi Analytics { get; }
        public AgentMemoryApi AgentMemory { get; }
        public ActivityApi Activity { get; }
        public AccountApi Account { get; }
        public AbApi Ab { get; }
        public SkuApi Sku { get; }

        public SdkworkAppClient(string baseUrl)
        {
            _httpClient = new HttpClient(baseUrl);
            Workspaces = new WorkspacesApi(_httpClient);
            VoiceSpeaker = new VoiceSpeakerApi(_httpClient);
            Video = new VideoApi(_httpClient);
            User = new UserApi(_httpClient);
            Tool = new ToolApi(_httpClient);
            Tenant = new TenantApi(_httpClient);
            Social = new SocialApi(_httpClient);
            Skill = new SkillApi(_httpClient);
            Shops = new ShopsApi(_httpClient);
            Share = new ShareApi(_httpClient);
            Settings = new SettingsApi(_httpClient);
            Ai = new AiApi(_httpClient);
            Projects = new ProjectsApi(_httpClient);
            Products = new ProductsApi(_httpClient);
            Partner = new PartnerApi(_httpClient);
            Notification = new NotificationApi(_httpClient);
            Notes = new NotesApi(_httpClient);
            News = new NewsApi(_httpClient);
            Music = new MusicApi(_httpClient);
            KnowledgeDocuments = new KnowledgeDocumentsApi(_httpClient);
            Invoice = new InvoiceApi(_httpClient);
            Image = new ImageApi(_httpClient);
            Style = new StyleApi(_httpClient);
            FileSystem = new FileSystemApi(_httpClient);
            Feedback = new FeedbackApi(_httpClient);
            Favorite = new FavoriteApi(_httpClient);
            Drive = new DriveApi(_httpClient);
            Documents = new DocumentsApi(_httpClient);
            Dashboard = new DashboardApi(_httpClient);
            Collection = new CollectionApi(_httpClient);
            Chat = new ChatApi(_httpClient);
            Character = new CharacterApi(_httpClient);
            Category = new CategoryApi(_httpClient);
            Cart = new CartApi(_httpClient);
            Assets = new AssetsApi(_httpClient);
            App = new AppApi(_httpClient);
            Announcement = new AnnouncementApi(_httpClient);
            Agent = new AgentApi(_httpClient);
            Advert = new AdvertApi(_httpClient);
            Wallet = new WalletApi(_httpClient);
            Vote = new VoteApi(_httpClient);
            Vip = new VipApi(_httpClient);
            Upload = new UploadApi(_httpClient);
            Search = new SearchApi(_httpClient);
            Rtc = new RtcApi(_httpClient);
            Payments = new PaymentsApi(_httpClient);
            Organization = new OrganizationApi(_httpClient);
            Orders = new OrdersApi(_httpClient);
            Model = new ModelApi(_httpClient);
            History = new HistoryApi(_httpClient);
            SoundEffect = new SoundEffectApi(_httpClient);
            Generation = new GenerationApi(_httpClient);
            Audio = new AudioApi(_httpClient);
            Feed = new FeedApi(_httpClient);
            Currency = new CurrencyApi(_httpClient);
            Coupons = new CouponsApi(_httpClient);
            Comments = new CommentsApi(_httpClient);
            Auth = new AuthApi(_httpClient);
            Audit = new AuditApi(_httpClient);
            Analytics = new AnalyticsApi(_httpClient);
            AgentMemory = new AgentMemoryApi(_httpClient);
            Activity = new ActivityApi(_httpClient);
            Account = new AccountApi(_httpClient);
            Ab = new AbApi(_httpClient);
            Sku = new SkuApi(_httpClient);
        }

        public SdkworkAppClient(SdkConfig config)
        {
            _httpClient = new HttpClient(config);
            Workspaces = new WorkspacesApi(_httpClient);
            VoiceSpeaker = new VoiceSpeakerApi(_httpClient);
            Video = new VideoApi(_httpClient);
            User = new UserApi(_httpClient);
            Tool = new ToolApi(_httpClient);
            Tenant = new TenantApi(_httpClient);
            Social = new SocialApi(_httpClient);
            Skill = new SkillApi(_httpClient);
            Shops = new ShopsApi(_httpClient);
            Share = new ShareApi(_httpClient);
            Settings = new SettingsApi(_httpClient);
            Ai = new AiApi(_httpClient);
            Projects = new ProjectsApi(_httpClient);
            Products = new ProductsApi(_httpClient);
            Partner = new PartnerApi(_httpClient);
            Notification = new NotificationApi(_httpClient);
            Notes = new NotesApi(_httpClient);
            News = new NewsApi(_httpClient);
            Music = new MusicApi(_httpClient);
            KnowledgeDocuments = new KnowledgeDocumentsApi(_httpClient);
            Invoice = new InvoiceApi(_httpClient);
            Image = new ImageApi(_httpClient);
            Style = new StyleApi(_httpClient);
            FileSystem = new FileSystemApi(_httpClient);
            Feedback = new FeedbackApi(_httpClient);
            Favorite = new FavoriteApi(_httpClient);
            Drive = new DriveApi(_httpClient);
            Documents = new DocumentsApi(_httpClient);
            Dashboard = new DashboardApi(_httpClient);
            Collection = new CollectionApi(_httpClient);
            Chat = new ChatApi(_httpClient);
            Character = new CharacterApi(_httpClient);
            Category = new CategoryApi(_httpClient);
            Cart = new CartApi(_httpClient);
            Assets = new AssetsApi(_httpClient);
            App = new AppApi(_httpClient);
            Announcement = new AnnouncementApi(_httpClient);
            Agent = new AgentApi(_httpClient);
            Advert = new AdvertApi(_httpClient);
            Wallet = new WalletApi(_httpClient);
            Vote = new VoteApi(_httpClient);
            Vip = new VipApi(_httpClient);
            Upload = new UploadApi(_httpClient);
            Search = new SearchApi(_httpClient);
            Rtc = new RtcApi(_httpClient);
            Payments = new PaymentsApi(_httpClient);
            Organization = new OrganizationApi(_httpClient);
            Orders = new OrdersApi(_httpClient);
            Model = new ModelApi(_httpClient);
            History = new HistoryApi(_httpClient);
            SoundEffect = new SoundEffectApi(_httpClient);
            Generation = new GenerationApi(_httpClient);
            Audio = new AudioApi(_httpClient);
            Feed = new FeedApi(_httpClient);
            Currency = new CurrencyApi(_httpClient);
            Coupons = new CouponsApi(_httpClient);
            Comments = new CommentsApi(_httpClient);
            Auth = new AuthApi(_httpClient);
            Audit = new AuditApi(_httpClient);
            Analytics = new AnalyticsApi(_httpClient);
            AgentMemory = new AgentMemoryApi(_httpClient);
            Activity = new ActivityApi(_httpClient);
            Account = new AccountApi(_httpClient);
            Ab = new AbApi(_httpClient);
            Sku = new SkuApi(_httpClient);
        }

        public SdkworkAppClient SetApiKey(string apiKey)
        {
            _httpClient.SetApiKey(apiKey);
            return this;
        }

        public SdkworkAppClient SetAuthToken(string token)
        {
            _httpClient.SetAuthToken(token);
            return this;
        }

        public SdkworkAppClient SetAccessToken(string token)
        {
            _httpClient.SetAccessToken(token);
            return this;
        }

        public SdkworkAppClient SetHeader(string key, string value)
        {
            _httpClient.SetHeader(key, value);
            return this;
        }
    }
}
