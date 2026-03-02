package com.sdkwork.app;

import com.sdkwork.common.core.Types;
import com.sdkwork.app.http.HttpClient;
import com.sdkwork.app.api.WorkspacesApi;
import com.sdkwork.app.api.VoiceSpeakersApi;
import com.sdkwork.app.api.VideoApi;
import com.sdkwork.app.api.SettingsApi;
import com.sdkwork.app.api.ProfileApi;
import com.sdkwork.app.api.PasswordApi;
import com.sdkwork.app.api.AddressApi;
import com.sdkwork.app.api.TenantApi;
import com.sdkwork.app.api.SocialApi;
import com.sdkwork.app.api.ShopsApi;
import com.sdkwork.app.api.ShareApi;
import com.sdkwork.app.api.AiApi;
import com.sdkwork.app.api.ProjectsApi;
import com.sdkwork.app.api.PartnerApi;
import com.sdkwork.app.api.NotificationApi;
import com.sdkwork.app.api.AppApi;
import com.sdkwork.app.api.NewsApi;
import com.sdkwork.app.api.MusicApi;
import com.sdkwork.app.api.InvoiceApi;
import com.sdkwork.app.api.ImageApi;
import com.sdkwork.app.api.StyleApi;
import com.sdkwork.app.api.FileSystemApi;
import com.sdkwork.app.api.FeedbackApi;
import com.sdkwork.app.api.FavoriteApi;
import com.sdkwork.app.api.DriveApi;
import com.sdkwork.app.api.AppDocumentsApi;
import com.sdkwork.app.api.DashboardApi;
import com.sdkwork.app.api.CollectionApi;
import com.sdkwork.app.api.ChatApi;
import com.sdkwork.app.api.CharacterApi;
import com.sdkwork.app.api.CategoryApi;
import com.sdkwork.app.api.CartApi;
import com.sdkwork.app.api.AssetsApi;
import com.sdkwork.app.api.AnnouncementApi;
import com.sdkwork.app.api.AdvertApi;
import com.sdkwork.app.api.VoteApi;
import com.sdkwork.app.api.VipApi;
import com.sdkwork.app.api.DeactivateApi;
import com.sdkwork.app.api.BindApi;
import com.sdkwork.app.api.AvatarApi;
import com.sdkwork.app.api.UploadApi;
import com.sdkwork.app.api.SearchApi;
import com.sdkwork.app.api.PaymentsApi;
import com.sdkwork.app.api.OrganizationApi;
import com.sdkwork.app.api.DisableApi;
import com.sdkwork.app.api.ActivateApi;
import com.sdkwork.app.api.PositionApi;
import com.sdkwork.app.api.DepartmentApi;
import com.sdkwork.app.api.OrdersApi;
import com.sdkwork.app.api.ModelsApi;
import com.sdkwork.app.api.HistoryApi;
import com.sdkwork.app.api.VoiceSpeakerApi;
import com.sdkwork.app.api.SoundEffectApi;
import com.sdkwork.app.api.AudioApi;
import com.sdkwork.app.api.FeedApi;
import com.sdkwork.app.api.CurrencyApi;
import com.sdkwork.app.api.CouponsApi;
import com.sdkwork.app.api.CommentsApi;
import com.sdkwork.app.api.SmsApi;
import com.sdkwork.app.api.RegisterApi;
import com.sdkwork.app.api.RefreshApi;
import com.sdkwork.app.api.QrApi;
import com.sdkwork.app.api.PhoneApi;
import com.sdkwork.app.api.OauthApi;
import com.sdkwork.app.api.LogoutApi;
import com.sdkwork.app.api.LoginApi;
import com.sdkwork.app.api.AuditApi;
import com.sdkwork.app.api.AnalyticsApi;
import com.sdkwork.app.api.ActivityApi;
import com.sdkwork.app.api.AccountApi;
import com.sdkwork.app.api.AbApi;
import com.sdkwork.app.api.SkuApi;
import com.sdkwork.app.api.ProductsApi;
import com.sdkwork.app.api.PositionsApi;
import com.sdkwork.app.api.MembersApi;
import com.sdkwork.app.api.DepartmentsApi;
import com.sdkwork.app.api.ChildrenApi;
import com.sdkwork.app.api.StatisticsApi;
import com.sdkwork.app.api.MemberApi;
import com.sdkwork.app.api.ListApi;
import com.sdkwork.app.api.CodeApi;

public class SdkworkAppClient {
    private final HttpClient httpClient;
    private WorkspacesApi workspaces;
    private VoiceSpeakersApi voiceSpeakers;
    private VideoApi video;
    private SettingsApi settings;
    private ProfileApi profile;
    private PasswordApi password;
    private AddressApi address;
    private TenantApi tenant;
    private SocialApi social;
    private ShopsApi shops;
    private ShareApi share;
    private AiApi ai;
    private ProjectsApi projects;
    private PartnerApi partner;
    private NotificationApi notification;
    private AppApi app;
    private NewsApi news;
    private MusicApi music;
    private InvoiceApi invoice;
    private ImageApi image;
    private StyleApi style;
    private FileSystemApi fileSystem;
    private FeedbackApi feedback;
    private FavoriteApi favorite;
    private DriveApi drive;
    private AppDocumentsApi appDocuments;
    private DashboardApi dashboard;
    private CollectionApi collection;
    private ChatApi chat;
    private CharacterApi character;
    private CategoryApi category;
    private CartApi cart;
    private AssetsApi assets;
    private AnnouncementApi announcement;
    private AdvertApi advert;
    private VoteApi vote;
    private VipApi vip;
    private DeactivateApi deactivate;
    private BindApi bind;
    private AvatarApi avatar;
    private UploadApi upload;
    private SearchApi search;
    private PaymentsApi payments;
    private OrganizationApi organization;
    private DisableApi disable;
    private ActivateApi activate;
    private PositionApi position;
    private DepartmentApi department;
    private OrdersApi orders;
    private ModelsApi models;
    private HistoryApi history;
    private VoiceSpeakerApi voiceSpeaker;
    private SoundEffectApi soundEffect;
    private AudioApi audio;
    private FeedApi feed;
    private CurrencyApi currency;
    private CouponsApi coupons;
    private CommentsApi comments;
    private SmsApi sms;
    private RegisterApi register;
    private RefreshApi refresh;
    private QrApi qr;
    private PhoneApi phone;
    private OauthApi oauth;
    private LogoutApi logout;
    private LoginApi login;
    private AuditApi audit;
    private AnalyticsApi analytics;
    private ActivityApi activity;
    private AccountApi account;
    private AbApi ab;
    private SkuApi sku;
    private ProductsApi products;
    private PositionsApi positions;
    private MembersApi members;
    private DepartmentsApi departments;
    private ChildrenApi children;
    private StatisticsApi statistics;
    private MemberApi member;
    private ListApi list;
    private CodeApi code;

    public SdkworkAppClient(String baseUrl) {
        this.httpClient = new HttpClient(baseUrl);
        this.workspaces = new WorkspacesApi(httpClient);
        this.voiceSpeakers = new VoiceSpeakersApi(httpClient);
        this.video = new VideoApi(httpClient);
        this.settings = new SettingsApi(httpClient);
        this.profile = new ProfileApi(httpClient);
        this.password = new PasswordApi(httpClient);
        this.address = new AddressApi(httpClient);
        this.tenant = new TenantApi(httpClient);
        this.social = new SocialApi(httpClient);
        this.shops = new ShopsApi(httpClient);
        this.share = new ShareApi(httpClient);
        this.ai = new AiApi(httpClient);
        this.projects = new ProjectsApi(httpClient);
        this.partner = new PartnerApi(httpClient);
        this.notification = new NotificationApi(httpClient);
        this.app = new AppApi(httpClient);
        this.news = new NewsApi(httpClient);
        this.music = new MusicApi(httpClient);
        this.invoice = new InvoiceApi(httpClient);
        this.image = new ImageApi(httpClient);
        this.style = new StyleApi(httpClient);
        this.fileSystem = new FileSystemApi(httpClient);
        this.feedback = new FeedbackApi(httpClient);
        this.favorite = new FavoriteApi(httpClient);
        this.drive = new DriveApi(httpClient);
        this.appDocuments = new AppDocumentsApi(httpClient);
        this.dashboard = new DashboardApi(httpClient);
        this.collection = new CollectionApi(httpClient);
        this.chat = new ChatApi(httpClient);
        this.character = new CharacterApi(httpClient);
        this.category = new CategoryApi(httpClient);
        this.cart = new CartApi(httpClient);
        this.assets = new AssetsApi(httpClient);
        this.announcement = new AnnouncementApi(httpClient);
        this.advert = new AdvertApi(httpClient);
        this.vote = new VoteApi(httpClient);
        this.vip = new VipApi(httpClient);
        this.deactivate = new DeactivateApi(httpClient);
        this.bind = new BindApi(httpClient);
        this.avatar = new AvatarApi(httpClient);
        this.upload = new UploadApi(httpClient);
        this.search = new SearchApi(httpClient);
        this.payments = new PaymentsApi(httpClient);
        this.organization = new OrganizationApi(httpClient);
        this.disable = new DisableApi(httpClient);
        this.activate = new ActivateApi(httpClient);
        this.position = new PositionApi(httpClient);
        this.department = new DepartmentApi(httpClient);
        this.orders = new OrdersApi(httpClient);
        this.models = new ModelsApi(httpClient);
        this.history = new HistoryApi(httpClient);
        this.voiceSpeaker = new VoiceSpeakerApi(httpClient);
        this.soundEffect = new SoundEffectApi(httpClient);
        this.audio = new AudioApi(httpClient);
        this.feed = new FeedApi(httpClient);
        this.currency = new CurrencyApi(httpClient);
        this.coupons = new CouponsApi(httpClient);
        this.comments = new CommentsApi(httpClient);
        this.sms = new SmsApi(httpClient);
        this.register = new RegisterApi(httpClient);
        this.refresh = new RefreshApi(httpClient);
        this.qr = new QrApi(httpClient);
        this.phone = new PhoneApi(httpClient);
        this.oauth = new OauthApi(httpClient);
        this.logout = new LogoutApi(httpClient);
        this.login = new LoginApi(httpClient);
        this.audit = new AuditApi(httpClient);
        this.analytics = new AnalyticsApi(httpClient);
        this.activity = new ActivityApi(httpClient);
        this.account = new AccountApi(httpClient);
        this.ab = new AbApi(httpClient);
        this.sku = new SkuApi(httpClient);
        this.products = new ProductsApi(httpClient);
        this.positions = new PositionsApi(httpClient);
        this.members = new MembersApi(httpClient);
        this.departments = new DepartmentsApi(httpClient);
        this.children = new ChildrenApi(httpClient);
        this.statistics = new StatisticsApi(httpClient);
        this.member = new MemberApi(httpClient);
        this.list = new ListApi(httpClient);
        this.code = new CodeApi(httpClient);
    }

    public SdkworkAppClient(Types.SdkConfig config) {
        this.httpClient = new HttpClient(config);
        this.workspaces = new WorkspacesApi(httpClient);
        this.voiceSpeakers = new VoiceSpeakersApi(httpClient);
        this.video = new VideoApi(httpClient);
        this.settings = new SettingsApi(httpClient);
        this.profile = new ProfileApi(httpClient);
        this.password = new PasswordApi(httpClient);
        this.address = new AddressApi(httpClient);
        this.tenant = new TenantApi(httpClient);
        this.social = new SocialApi(httpClient);
        this.shops = new ShopsApi(httpClient);
        this.share = new ShareApi(httpClient);
        this.ai = new AiApi(httpClient);
        this.projects = new ProjectsApi(httpClient);
        this.partner = new PartnerApi(httpClient);
        this.notification = new NotificationApi(httpClient);
        this.app = new AppApi(httpClient);
        this.news = new NewsApi(httpClient);
        this.music = new MusicApi(httpClient);
        this.invoice = new InvoiceApi(httpClient);
        this.image = new ImageApi(httpClient);
        this.style = new StyleApi(httpClient);
        this.fileSystem = new FileSystemApi(httpClient);
        this.feedback = new FeedbackApi(httpClient);
        this.favorite = new FavoriteApi(httpClient);
        this.drive = new DriveApi(httpClient);
        this.appDocuments = new AppDocumentsApi(httpClient);
        this.dashboard = new DashboardApi(httpClient);
        this.collection = new CollectionApi(httpClient);
        this.chat = new ChatApi(httpClient);
        this.character = new CharacterApi(httpClient);
        this.category = new CategoryApi(httpClient);
        this.cart = new CartApi(httpClient);
        this.assets = new AssetsApi(httpClient);
        this.announcement = new AnnouncementApi(httpClient);
        this.advert = new AdvertApi(httpClient);
        this.vote = new VoteApi(httpClient);
        this.vip = new VipApi(httpClient);
        this.deactivate = new DeactivateApi(httpClient);
        this.bind = new BindApi(httpClient);
        this.avatar = new AvatarApi(httpClient);
        this.upload = new UploadApi(httpClient);
        this.search = new SearchApi(httpClient);
        this.payments = new PaymentsApi(httpClient);
        this.organization = new OrganizationApi(httpClient);
        this.disable = new DisableApi(httpClient);
        this.activate = new ActivateApi(httpClient);
        this.position = new PositionApi(httpClient);
        this.department = new DepartmentApi(httpClient);
        this.orders = new OrdersApi(httpClient);
        this.models = new ModelsApi(httpClient);
        this.history = new HistoryApi(httpClient);
        this.voiceSpeaker = new VoiceSpeakerApi(httpClient);
        this.soundEffect = new SoundEffectApi(httpClient);
        this.audio = new AudioApi(httpClient);
        this.feed = new FeedApi(httpClient);
        this.currency = new CurrencyApi(httpClient);
        this.coupons = new CouponsApi(httpClient);
        this.comments = new CommentsApi(httpClient);
        this.sms = new SmsApi(httpClient);
        this.register = new RegisterApi(httpClient);
        this.refresh = new RefreshApi(httpClient);
        this.qr = new QrApi(httpClient);
        this.phone = new PhoneApi(httpClient);
        this.oauth = new OauthApi(httpClient);
        this.logout = new LogoutApi(httpClient);
        this.login = new LoginApi(httpClient);
        this.audit = new AuditApi(httpClient);
        this.analytics = new AnalyticsApi(httpClient);
        this.activity = new ActivityApi(httpClient);
        this.account = new AccountApi(httpClient);
        this.ab = new AbApi(httpClient);
        this.sku = new SkuApi(httpClient);
        this.products = new ProductsApi(httpClient);
        this.positions = new PositionsApi(httpClient);
        this.members = new MembersApi(httpClient);
        this.departments = new DepartmentsApi(httpClient);
        this.children = new ChildrenApi(httpClient);
        this.statistics = new StatisticsApi(httpClient);
        this.member = new MemberApi(httpClient);
        this.list = new ListApi(httpClient);
        this.code = new CodeApi(httpClient);
    }

    public WorkspacesApi getWorkspaces() {
        return this.workspaces;
    }

    public VoiceSpeakersApi getVoiceSpeakers() {
        return this.voiceSpeakers;
    }

    public VideoApi getVideo() {
        return this.video;
    }

    public SettingsApi getSettings() {
        return this.settings;
    }

    public ProfileApi getProfile() {
        return this.profile;
    }

    public PasswordApi getPassword() {
        return this.password;
    }

    public AddressApi getAddress() {
        return this.address;
    }

    public TenantApi getTenant() {
        return this.tenant;
    }

    public SocialApi getSocial() {
        return this.social;
    }

    public ShopsApi getShops() {
        return this.shops;
    }

    public ShareApi getShare() {
        return this.share;
    }

    public AiApi getAi() {
        return this.ai;
    }

    public ProjectsApi getProjects() {
        return this.projects;
    }

    public PartnerApi getPartner() {
        return this.partner;
    }

    public NotificationApi getNotification() {
        return this.notification;
    }

    public AppApi getApp() {
        return this.app;
    }

    public NewsApi getNews() {
        return this.news;
    }

    public MusicApi getMusic() {
        return this.music;
    }

    public InvoiceApi getInvoice() {
        return this.invoice;
    }

    public ImageApi getImage() {
        return this.image;
    }

    public StyleApi getStyle() {
        return this.style;
    }

    public FileSystemApi getFileSystem() {
        return this.fileSystem;
    }

    public FeedbackApi getFeedback() {
        return this.feedback;
    }

    public FavoriteApi getFavorite() {
        return this.favorite;
    }

    public DriveApi getDrive() {
        return this.drive;
    }

    public AppDocumentsApi getAppDocuments() {
        return this.appDocuments;
    }

    public DashboardApi getDashboard() {
        return this.dashboard;
    }

    public CollectionApi getCollection() {
        return this.collection;
    }

    public ChatApi getChat() {
        return this.chat;
    }

    public CharacterApi getCharacter() {
        return this.character;
    }

    public CategoryApi getCategory() {
        return this.category;
    }

    public CartApi getCart() {
        return this.cart;
    }

    public AssetsApi getAssets() {
        return this.assets;
    }

    public AnnouncementApi getAnnouncement() {
        return this.announcement;
    }

    public AdvertApi getAdvert() {
        return this.advert;
    }

    public VoteApi getVote() {
        return this.vote;
    }

    public VipApi getVip() {
        return this.vip;
    }

    public DeactivateApi getDeactivate() {
        return this.deactivate;
    }

    public BindApi getBind() {
        return this.bind;
    }

    public AvatarApi getAvatar() {
        return this.avatar;
    }

    public UploadApi getUpload() {
        return this.upload;
    }

    public SearchApi getSearch() {
        return this.search;
    }

    public PaymentsApi getPayments() {
        return this.payments;
    }

    public OrganizationApi getOrganization() {
        return this.organization;
    }

    public DisableApi getDisable() {
        return this.disable;
    }

    public ActivateApi getActivate() {
        return this.activate;
    }

    public PositionApi getPosition() {
        return this.position;
    }

    public DepartmentApi getDepartment() {
        return this.department;
    }

    public OrdersApi getOrders() {
        return this.orders;
    }

    public ModelsApi getModels() {
        return this.models;
    }

    public HistoryApi getHistory() {
        return this.history;
    }

    public VoiceSpeakerApi getVoiceSpeaker() {
        return this.voiceSpeaker;
    }

    public SoundEffectApi getSoundEffect() {
        return this.soundEffect;
    }

    public AudioApi getAudio() {
        return this.audio;
    }

    public FeedApi getFeed() {
        return this.feed;
    }

    public CurrencyApi getCurrency() {
        return this.currency;
    }

    public CouponsApi getCoupons() {
        return this.coupons;
    }

    public CommentsApi getComments() {
        return this.comments;
    }

    public SmsApi getSms() {
        return this.sms;
    }

    public RegisterApi getRegister() {
        return this.register;
    }

    public RefreshApi getRefresh() {
        return this.refresh;
    }

    public QrApi getQr() {
        return this.qr;
    }

    public PhoneApi getPhone() {
        return this.phone;
    }

    public OauthApi getOauth() {
        return this.oauth;
    }

    public LogoutApi getLogout() {
        return this.logout;
    }

    public LoginApi getLogin() {
        return this.login;
    }

    public AuditApi getAudit() {
        return this.audit;
    }

    public AnalyticsApi getAnalytics() {
        return this.analytics;
    }

    public ActivityApi getActivity() {
        return this.activity;
    }

    public AccountApi getAccount() {
        return this.account;
    }

    public AbApi getAb() {
        return this.ab;
    }

    public SkuApi getSku() {
        return this.sku;
    }

    public ProductsApi getProducts() {
        return this.products;
    }

    public PositionsApi getPositions() {
        return this.positions;
    }

    public MembersApi getMembers() {
        return this.members;
    }

    public DepartmentsApi getDepartments() {
        return this.departments;
    }

    public ChildrenApi getChildren() {
        return this.children;
    }

    public StatisticsApi getStatistics() {
        return this.statistics;
    }

    public MemberApi getMember() {
        return this.member;
    }

    public ListApi getList() {
        return this.list;
    }

    public CodeApi getCode() {
        return this.code;
    }

    public SdkworkAppClient setApiKey(String apiKey) {
        httpClient.setApiKey(apiKey);
        return this;
    }

    public SdkworkAppClient setAuthToken(String token) {
        httpClient.setAuthToken(token);
        return this;
    }

    public SdkworkAppClient setAccessToken(String token) {
        httpClient.setAccessToken(token);
        return this;
    }

    public SdkworkAppClient setHeader(String key, String value) {
        httpClient.setHeader(key, value);
        return this;
    }

    public HttpClient getHttpClient() {
        return httpClient;
    }
}
