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
        public VoiceSpeakersApi VoiceSpeakers { get; }
        public VideoApi Video { get; }
        public SettingsApi Settings { get; }
        public ProfileApi Profile { get; }
        public PasswordApi Password { get; }
        public AddressApi Address { get; }
        public TenantApi Tenant { get; }
        public SocialApi Social { get; }
        public ShopsApi Shops { get; }
        public ShareApi Share { get; }
        public AiApi Ai { get; }
        public ProjectsApi Projects { get; }
        public PartnerApi Partner { get; }
        public NotificationApi Notification { get; }
        public AppApi App { get; }
        public NewsApi News { get; }
        public MusicApi Music { get; }
        public InvoiceApi Invoice { get; }
        public ImageApi Image { get; }
        public StyleApi Style { get; }
        public FileSystemApi FileSystem { get; }
        public FeedbackApi Feedback { get; }
        public FavoriteApi Favorite { get; }
        public DriveApi Drive { get; }
        public AppDocumentsApi AppDocuments { get; }
        public DashboardApi Dashboard { get; }
        public CollectionApi Collection { get; }
        public ChatApi Chat { get; }
        public CharacterApi Character { get; }
        public CategoryApi Category { get; }
        public CartApi Cart { get; }
        public AssetsApi Assets { get; }
        public AnnouncementApi Announcement { get; }
        public AdvertApi Advert { get; }
        public VoteApi Vote { get; }
        public VipApi Vip { get; }
        public DeactivateApi Deactivate { get; }
        public BindApi Bind { get; }
        public AvatarApi Avatar { get; }
        public UploadApi Upload { get; }
        public SearchApi Search { get; }
        public PaymentsApi Payments { get; }
        public OrganizationApi Organization { get; }
        public DisableApi Disable { get; }
        public ActivateApi Activate { get; }
        public PositionApi Position { get; }
        public DepartmentApi Department { get; }
        public OrdersApi Orders { get; }
        public ModelsApi Models { get; }
        public HistoryApi History { get; }
        public VoiceSpeakerApi VoiceSpeaker { get; }
        public SoundEffectApi SoundEffect { get; }
        public AudioApi Audio { get; }
        public FeedApi Feed { get; }
        public CurrencyApi Currency { get; }
        public CouponsApi Coupons { get; }
        public CommentsApi Comments { get; }
        public SmsApi Sms { get; }
        public RegisterApi Register { get; }
        public RefreshApi Refresh { get; }
        public QrApi Qr { get; }
        public PhoneApi Phone { get; }
        public OauthApi Oauth { get; }
        public LogoutApi Logout { get; }
        public LoginApi Login { get; }
        public AuditApi Audit { get; }
        public AnalyticsApi Analytics { get; }
        public ActivityApi Activity { get; }
        public AccountApi Account { get; }
        public AbApi Ab { get; }
        public SkuApi Sku { get; }
        public ProductsApi Products { get; }
        public PositionsApi Positions { get; }
        public MembersApi Members { get; }
        public DepartmentsApi Departments { get; }
        public ChildrenApi Children { get; }
        public StatisticsApi Statistics { get; }
        public MemberApi Member { get; }
        public ListApi List { get; }
        public CodeApi Code { get; }

        public SdkworkAppClient(string baseUrl)
        {
            _httpClient = new HttpClient(baseUrl);
            Workspaces = new WorkspacesApi(_httpClient);
            VoiceSpeakers = new VoiceSpeakersApi(_httpClient);
            Video = new VideoApi(_httpClient);
            Settings = new SettingsApi(_httpClient);
            Profile = new ProfileApi(_httpClient);
            Password = new PasswordApi(_httpClient);
            Address = new AddressApi(_httpClient);
            Tenant = new TenantApi(_httpClient);
            Social = new SocialApi(_httpClient);
            Shops = new ShopsApi(_httpClient);
            Share = new ShareApi(_httpClient);
            Ai = new AiApi(_httpClient);
            Projects = new ProjectsApi(_httpClient);
            Partner = new PartnerApi(_httpClient);
            Notification = new NotificationApi(_httpClient);
            App = new AppApi(_httpClient);
            News = new NewsApi(_httpClient);
            Music = new MusicApi(_httpClient);
            Invoice = new InvoiceApi(_httpClient);
            Image = new ImageApi(_httpClient);
            Style = new StyleApi(_httpClient);
            FileSystem = new FileSystemApi(_httpClient);
            Feedback = new FeedbackApi(_httpClient);
            Favorite = new FavoriteApi(_httpClient);
            Drive = new DriveApi(_httpClient);
            AppDocuments = new AppDocumentsApi(_httpClient);
            Dashboard = new DashboardApi(_httpClient);
            Collection = new CollectionApi(_httpClient);
            Chat = new ChatApi(_httpClient);
            Character = new CharacterApi(_httpClient);
            Category = new CategoryApi(_httpClient);
            Cart = new CartApi(_httpClient);
            Assets = new AssetsApi(_httpClient);
            Announcement = new AnnouncementApi(_httpClient);
            Advert = new AdvertApi(_httpClient);
            Vote = new VoteApi(_httpClient);
            Vip = new VipApi(_httpClient);
            Deactivate = new DeactivateApi(_httpClient);
            Bind = new BindApi(_httpClient);
            Avatar = new AvatarApi(_httpClient);
            Upload = new UploadApi(_httpClient);
            Search = new SearchApi(_httpClient);
            Payments = new PaymentsApi(_httpClient);
            Organization = new OrganizationApi(_httpClient);
            Disable = new DisableApi(_httpClient);
            Activate = new ActivateApi(_httpClient);
            Position = new PositionApi(_httpClient);
            Department = new DepartmentApi(_httpClient);
            Orders = new OrdersApi(_httpClient);
            Models = new ModelsApi(_httpClient);
            History = new HistoryApi(_httpClient);
            VoiceSpeaker = new VoiceSpeakerApi(_httpClient);
            SoundEffect = new SoundEffectApi(_httpClient);
            Audio = new AudioApi(_httpClient);
            Feed = new FeedApi(_httpClient);
            Currency = new CurrencyApi(_httpClient);
            Coupons = new CouponsApi(_httpClient);
            Comments = new CommentsApi(_httpClient);
            Sms = new SmsApi(_httpClient);
            Register = new RegisterApi(_httpClient);
            Refresh = new RefreshApi(_httpClient);
            Qr = new QrApi(_httpClient);
            Phone = new PhoneApi(_httpClient);
            Oauth = new OauthApi(_httpClient);
            Logout = new LogoutApi(_httpClient);
            Login = new LoginApi(_httpClient);
            Audit = new AuditApi(_httpClient);
            Analytics = new AnalyticsApi(_httpClient);
            Activity = new ActivityApi(_httpClient);
            Account = new AccountApi(_httpClient);
            Ab = new AbApi(_httpClient);
            Sku = new SkuApi(_httpClient);
            Products = new ProductsApi(_httpClient);
            Positions = new PositionsApi(_httpClient);
            Members = new MembersApi(_httpClient);
            Departments = new DepartmentsApi(_httpClient);
            Children = new ChildrenApi(_httpClient);
            Statistics = new StatisticsApi(_httpClient);
            Member = new MemberApi(_httpClient);
            List = new ListApi(_httpClient);
            Code = new CodeApi(_httpClient);
        }

        public SdkworkAppClient(SdkConfig config)
        {
            _httpClient = new HttpClient(config);
            Workspaces = new WorkspacesApi(_httpClient);
            VoiceSpeakers = new VoiceSpeakersApi(_httpClient);
            Video = new VideoApi(_httpClient);
            Settings = new SettingsApi(_httpClient);
            Profile = new ProfileApi(_httpClient);
            Password = new PasswordApi(_httpClient);
            Address = new AddressApi(_httpClient);
            Tenant = new TenantApi(_httpClient);
            Social = new SocialApi(_httpClient);
            Shops = new ShopsApi(_httpClient);
            Share = new ShareApi(_httpClient);
            Ai = new AiApi(_httpClient);
            Projects = new ProjectsApi(_httpClient);
            Partner = new PartnerApi(_httpClient);
            Notification = new NotificationApi(_httpClient);
            App = new AppApi(_httpClient);
            News = new NewsApi(_httpClient);
            Music = new MusicApi(_httpClient);
            Invoice = new InvoiceApi(_httpClient);
            Image = new ImageApi(_httpClient);
            Style = new StyleApi(_httpClient);
            FileSystem = new FileSystemApi(_httpClient);
            Feedback = new FeedbackApi(_httpClient);
            Favorite = new FavoriteApi(_httpClient);
            Drive = new DriveApi(_httpClient);
            AppDocuments = new AppDocumentsApi(_httpClient);
            Dashboard = new DashboardApi(_httpClient);
            Collection = new CollectionApi(_httpClient);
            Chat = new ChatApi(_httpClient);
            Character = new CharacterApi(_httpClient);
            Category = new CategoryApi(_httpClient);
            Cart = new CartApi(_httpClient);
            Assets = new AssetsApi(_httpClient);
            Announcement = new AnnouncementApi(_httpClient);
            Advert = new AdvertApi(_httpClient);
            Vote = new VoteApi(_httpClient);
            Vip = new VipApi(_httpClient);
            Deactivate = new DeactivateApi(_httpClient);
            Bind = new BindApi(_httpClient);
            Avatar = new AvatarApi(_httpClient);
            Upload = new UploadApi(_httpClient);
            Search = new SearchApi(_httpClient);
            Payments = new PaymentsApi(_httpClient);
            Organization = new OrganizationApi(_httpClient);
            Disable = new DisableApi(_httpClient);
            Activate = new ActivateApi(_httpClient);
            Position = new PositionApi(_httpClient);
            Department = new DepartmentApi(_httpClient);
            Orders = new OrdersApi(_httpClient);
            Models = new ModelsApi(_httpClient);
            History = new HistoryApi(_httpClient);
            VoiceSpeaker = new VoiceSpeakerApi(_httpClient);
            SoundEffect = new SoundEffectApi(_httpClient);
            Audio = new AudioApi(_httpClient);
            Feed = new FeedApi(_httpClient);
            Currency = new CurrencyApi(_httpClient);
            Coupons = new CouponsApi(_httpClient);
            Comments = new CommentsApi(_httpClient);
            Sms = new SmsApi(_httpClient);
            Register = new RegisterApi(_httpClient);
            Refresh = new RefreshApi(_httpClient);
            Qr = new QrApi(_httpClient);
            Phone = new PhoneApi(_httpClient);
            Oauth = new OauthApi(_httpClient);
            Logout = new LogoutApi(_httpClient);
            Login = new LoginApi(_httpClient);
            Audit = new AuditApi(_httpClient);
            Analytics = new AnalyticsApi(_httpClient);
            Activity = new ActivityApi(_httpClient);
            Account = new AccountApi(_httpClient);
            Ab = new AbApi(_httpClient);
            Sku = new SkuApi(_httpClient);
            Products = new ProductsApi(_httpClient);
            Positions = new PositionsApi(_httpClient);
            Members = new MembersApi(_httpClient);
            Departments = new DepartmentsApi(_httpClient);
            Children = new ChildrenApi(_httpClient);
            Statistics = new StatisticsApi(_httpClient);
            Member = new MemberApi(_httpClient);
            List = new ListApi(_httpClient);
            Code = new CodeApi(_httpClient);
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
