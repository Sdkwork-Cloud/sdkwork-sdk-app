package com.sdkwork.app;

import com.sdkwork.common.core.Types;
import com.sdkwork.app.http.HttpClient;
import com.sdkwork.app.api.WorkspacesApi;
import com.sdkwork.app.api.VoiceSpeakerApi;
import com.sdkwork.app.api.VideoApi;
import com.sdkwork.app.api.UserApi;
import com.sdkwork.app.api.ToolApi;
import com.sdkwork.app.api.TenantApi;
import com.sdkwork.app.api.SocialApi;
import com.sdkwork.app.api.SkillApi;
import com.sdkwork.app.api.ShopsApi;
import com.sdkwork.app.api.ShareApi;
import com.sdkwork.app.api.SettingsApi;
import com.sdkwork.app.api.AiApi;
import com.sdkwork.app.api.ProjectsApi;
import com.sdkwork.app.api.ProductsApi;
import com.sdkwork.app.api.PartnerApi;
import com.sdkwork.app.api.NotificationApi;
import com.sdkwork.app.api.NotesApi;
import com.sdkwork.app.api.NewsApi;
import com.sdkwork.app.api.MusicApi;
import com.sdkwork.app.api.KnowledgeDocumentsApi;
import com.sdkwork.app.api.InvoiceApi;
import com.sdkwork.app.api.ImageApi;
import com.sdkwork.app.api.StyleApi;
import com.sdkwork.app.api.FileSystemApi;
import com.sdkwork.app.api.FeedbackApi;
import com.sdkwork.app.api.FavoriteApi;
import com.sdkwork.app.api.DriveApi;
import com.sdkwork.app.api.DocumentsApi;
import com.sdkwork.app.api.DashboardApi;
import com.sdkwork.app.api.CollectionApi;
import com.sdkwork.app.api.ChatApi;
import com.sdkwork.app.api.CharacterApi;
import com.sdkwork.app.api.CategoryApi;
import com.sdkwork.app.api.CartApi;
import com.sdkwork.app.api.AssetsApi;
import com.sdkwork.app.api.AppApi;
import com.sdkwork.app.api.AnnouncementApi;
import com.sdkwork.app.api.AgentApi;
import com.sdkwork.app.api.AdvertApi;
import com.sdkwork.app.api.WalletApi;
import com.sdkwork.app.api.VoteApi;
import com.sdkwork.app.api.VipApi;
import com.sdkwork.app.api.UploadApi;
import com.sdkwork.app.api.SearchApi;
import com.sdkwork.app.api.RtcApi;
import com.sdkwork.app.api.PaymentsApi;
import com.sdkwork.app.api.OrganizationApi;
import com.sdkwork.app.api.OrdersApi;
import com.sdkwork.app.api.ModelApi;
import com.sdkwork.app.api.HistoryApi;
import com.sdkwork.app.api.SoundEffectApi;
import com.sdkwork.app.api.GenerationApi;
import com.sdkwork.app.api.AudioApi;
import com.sdkwork.app.api.FeedApi;
import com.sdkwork.app.api.CurrencyApi;
import com.sdkwork.app.api.CouponsApi;
import com.sdkwork.app.api.CommentsApi;
import com.sdkwork.app.api.AuthApi;
import com.sdkwork.app.api.AuditApi;
import com.sdkwork.app.api.AnalyticsApi;
import com.sdkwork.app.api.AgentMemoryApi;
import com.sdkwork.app.api.ActivityApi;
import com.sdkwork.app.api.AccountApi;
import com.sdkwork.app.api.AbApi;
import com.sdkwork.app.api.SkuApi;

public class SdkworkAppClient {
    private final HttpClient httpClient;
    private WorkspacesApi workspaces;
    private VoiceSpeakerApi voiceSpeaker;
    private VideoApi video;
    private UserApi user;
    private ToolApi tool;
    private TenantApi tenant;
    private SocialApi social;
    private SkillApi skill;
    private ShopsApi shops;
    private ShareApi share;
    private SettingsApi settings;
    private AiApi ai;
    private ProjectsApi projects;
    private ProductsApi products;
    private PartnerApi partner;
    private NotificationApi notification;
    private NotesApi notes;
    private NewsApi news;
    private MusicApi music;
    private KnowledgeDocumentsApi knowledgeDocuments;
    private InvoiceApi invoice;
    private ImageApi image;
    private StyleApi style;
    private FileSystemApi fileSystem;
    private FeedbackApi feedback;
    private FavoriteApi favorite;
    private DriveApi drive;
    private DocumentsApi documents;
    private DashboardApi dashboard;
    private CollectionApi collection;
    private ChatApi chat;
    private CharacterApi character;
    private CategoryApi category;
    private CartApi cart;
    private AssetsApi assets;
    private AppApi app;
    private AnnouncementApi announcement;
    private AgentApi agent;
    private AdvertApi advert;
    private WalletApi wallet;
    private VoteApi vote;
    private VipApi vip;
    private UploadApi upload;
    private SearchApi search;
    private RtcApi rtc;
    private PaymentsApi payments;
    private OrganizationApi organization;
    private OrdersApi orders;
    private ModelApi model;
    private HistoryApi history;
    private SoundEffectApi soundEffect;
    private GenerationApi generation;
    private AudioApi audio;
    private FeedApi feed;
    private CurrencyApi currency;
    private CouponsApi coupons;
    private CommentsApi comments;
    private AuthApi auth;
    private AuditApi audit;
    private AnalyticsApi analytics;
    private AgentMemoryApi agentMemory;
    private ActivityApi activity;
    private AccountApi account;
    private AbApi ab;
    private SkuApi sku;

    public SdkworkAppClient(String baseUrl) {
        this.httpClient = new HttpClient(baseUrl);
        this.workspaces = new WorkspacesApi(httpClient);
        this.voiceSpeaker = new VoiceSpeakerApi(httpClient);
        this.video = new VideoApi(httpClient);
        this.user = new UserApi(httpClient);
        this.tool = new ToolApi(httpClient);
        this.tenant = new TenantApi(httpClient);
        this.social = new SocialApi(httpClient);
        this.skill = new SkillApi(httpClient);
        this.shops = new ShopsApi(httpClient);
        this.share = new ShareApi(httpClient);
        this.settings = new SettingsApi(httpClient);
        this.ai = new AiApi(httpClient);
        this.projects = new ProjectsApi(httpClient);
        this.products = new ProductsApi(httpClient);
        this.partner = new PartnerApi(httpClient);
        this.notification = new NotificationApi(httpClient);
        this.notes = new NotesApi(httpClient);
        this.news = new NewsApi(httpClient);
        this.music = new MusicApi(httpClient);
        this.knowledgeDocuments = new KnowledgeDocumentsApi(httpClient);
        this.invoice = new InvoiceApi(httpClient);
        this.image = new ImageApi(httpClient);
        this.style = new StyleApi(httpClient);
        this.fileSystem = new FileSystemApi(httpClient);
        this.feedback = new FeedbackApi(httpClient);
        this.favorite = new FavoriteApi(httpClient);
        this.drive = new DriveApi(httpClient);
        this.documents = new DocumentsApi(httpClient);
        this.dashboard = new DashboardApi(httpClient);
        this.collection = new CollectionApi(httpClient);
        this.chat = new ChatApi(httpClient);
        this.character = new CharacterApi(httpClient);
        this.category = new CategoryApi(httpClient);
        this.cart = new CartApi(httpClient);
        this.assets = new AssetsApi(httpClient);
        this.app = new AppApi(httpClient);
        this.announcement = new AnnouncementApi(httpClient);
        this.agent = new AgentApi(httpClient);
        this.advert = new AdvertApi(httpClient);
        this.wallet = new WalletApi(httpClient);
        this.vote = new VoteApi(httpClient);
        this.vip = new VipApi(httpClient);
        this.upload = new UploadApi(httpClient);
        this.search = new SearchApi(httpClient);
        this.rtc = new RtcApi(httpClient);
        this.payments = new PaymentsApi(httpClient);
        this.organization = new OrganizationApi(httpClient);
        this.orders = new OrdersApi(httpClient);
        this.model = new ModelApi(httpClient);
        this.history = new HistoryApi(httpClient);
        this.soundEffect = new SoundEffectApi(httpClient);
        this.generation = new GenerationApi(httpClient);
        this.audio = new AudioApi(httpClient);
        this.feed = new FeedApi(httpClient);
        this.currency = new CurrencyApi(httpClient);
        this.coupons = new CouponsApi(httpClient);
        this.comments = new CommentsApi(httpClient);
        this.auth = new AuthApi(httpClient);
        this.audit = new AuditApi(httpClient);
        this.analytics = new AnalyticsApi(httpClient);
        this.agentMemory = new AgentMemoryApi(httpClient);
        this.activity = new ActivityApi(httpClient);
        this.account = new AccountApi(httpClient);
        this.ab = new AbApi(httpClient);
        this.sku = new SkuApi(httpClient);
    }

    public SdkworkAppClient(Types.SdkConfig config) {
        this.httpClient = new HttpClient(config);
        this.workspaces = new WorkspacesApi(httpClient);
        this.voiceSpeaker = new VoiceSpeakerApi(httpClient);
        this.video = new VideoApi(httpClient);
        this.user = new UserApi(httpClient);
        this.tool = new ToolApi(httpClient);
        this.tenant = new TenantApi(httpClient);
        this.social = new SocialApi(httpClient);
        this.skill = new SkillApi(httpClient);
        this.shops = new ShopsApi(httpClient);
        this.share = new ShareApi(httpClient);
        this.settings = new SettingsApi(httpClient);
        this.ai = new AiApi(httpClient);
        this.projects = new ProjectsApi(httpClient);
        this.products = new ProductsApi(httpClient);
        this.partner = new PartnerApi(httpClient);
        this.notification = new NotificationApi(httpClient);
        this.notes = new NotesApi(httpClient);
        this.news = new NewsApi(httpClient);
        this.music = new MusicApi(httpClient);
        this.knowledgeDocuments = new KnowledgeDocumentsApi(httpClient);
        this.invoice = new InvoiceApi(httpClient);
        this.image = new ImageApi(httpClient);
        this.style = new StyleApi(httpClient);
        this.fileSystem = new FileSystemApi(httpClient);
        this.feedback = new FeedbackApi(httpClient);
        this.favorite = new FavoriteApi(httpClient);
        this.drive = new DriveApi(httpClient);
        this.documents = new DocumentsApi(httpClient);
        this.dashboard = new DashboardApi(httpClient);
        this.collection = new CollectionApi(httpClient);
        this.chat = new ChatApi(httpClient);
        this.character = new CharacterApi(httpClient);
        this.category = new CategoryApi(httpClient);
        this.cart = new CartApi(httpClient);
        this.assets = new AssetsApi(httpClient);
        this.app = new AppApi(httpClient);
        this.announcement = new AnnouncementApi(httpClient);
        this.agent = new AgentApi(httpClient);
        this.advert = new AdvertApi(httpClient);
        this.wallet = new WalletApi(httpClient);
        this.vote = new VoteApi(httpClient);
        this.vip = new VipApi(httpClient);
        this.upload = new UploadApi(httpClient);
        this.search = new SearchApi(httpClient);
        this.rtc = new RtcApi(httpClient);
        this.payments = new PaymentsApi(httpClient);
        this.organization = new OrganizationApi(httpClient);
        this.orders = new OrdersApi(httpClient);
        this.model = new ModelApi(httpClient);
        this.history = new HistoryApi(httpClient);
        this.soundEffect = new SoundEffectApi(httpClient);
        this.generation = new GenerationApi(httpClient);
        this.audio = new AudioApi(httpClient);
        this.feed = new FeedApi(httpClient);
        this.currency = new CurrencyApi(httpClient);
        this.coupons = new CouponsApi(httpClient);
        this.comments = new CommentsApi(httpClient);
        this.auth = new AuthApi(httpClient);
        this.audit = new AuditApi(httpClient);
        this.analytics = new AnalyticsApi(httpClient);
        this.agentMemory = new AgentMemoryApi(httpClient);
        this.activity = new ActivityApi(httpClient);
        this.account = new AccountApi(httpClient);
        this.ab = new AbApi(httpClient);
        this.sku = new SkuApi(httpClient);
    }

    public WorkspacesApi getWorkspaces() {
        return this.workspaces;
    }

    public VoiceSpeakerApi getVoiceSpeaker() {
        return this.voiceSpeaker;
    }

    public VideoApi getVideo() {
        return this.video;
    }

    public UserApi getUser() {
        return this.user;
    }

    public ToolApi getTool() {
        return this.tool;
    }

    public TenantApi getTenant() {
        return this.tenant;
    }

    public SocialApi getSocial() {
        return this.social;
    }

    public SkillApi getSkill() {
        return this.skill;
    }

    public ShopsApi getShops() {
        return this.shops;
    }

    public ShareApi getShare() {
        return this.share;
    }

    public SettingsApi getSettings() {
        return this.settings;
    }

    public AiApi getAi() {
        return this.ai;
    }

    public ProjectsApi getProjects() {
        return this.projects;
    }

    public ProductsApi getProducts() {
        return this.products;
    }

    public PartnerApi getPartner() {
        return this.partner;
    }

    public NotificationApi getNotification() {
        return this.notification;
    }

    public NotesApi getNotes() {
        return this.notes;
    }

    public NewsApi getNews() {
        return this.news;
    }

    public MusicApi getMusic() {
        return this.music;
    }

    public KnowledgeDocumentsApi getKnowledgeDocuments() {
        return this.knowledgeDocuments;
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

    public DocumentsApi getDocuments() {
        return this.documents;
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

    public AppApi getApp() {
        return this.app;
    }

    public AnnouncementApi getAnnouncement() {
        return this.announcement;
    }

    public AgentApi getAgent() {
        return this.agent;
    }

    public AdvertApi getAdvert() {
        return this.advert;
    }

    public WalletApi getWallet() {
        return this.wallet;
    }

    public VoteApi getVote() {
        return this.vote;
    }

    public VipApi getVip() {
        return this.vip;
    }

    public UploadApi getUpload() {
        return this.upload;
    }

    public SearchApi getSearch() {
        return this.search;
    }

    public RtcApi getRtc() {
        return this.rtc;
    }

    public PaymentsApi getPayments() {
        return this.payments;
    }

    public OrganizationApi getOrganization() {
        return this.organization;
    }

    public OrdersApi getOrders() {
        return this.orders;
    }

    public ModelApi getModel() {
        return this.model;
    }

    public HistoryApi getHistory() {
        return this.history;
    }

    public SoundEffectApi getSoundEffect() {
        return this.soundEffect;
    }

    public GenerationApi getGeneration() {
        return this.generation;
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

    public AuthApi getAuth() {
        return this.auth;
    }

    public AuditApi getAudit() {
        return this.audit;
    }

    public AnalyticsApi getAnalytics() {
        return this.analytics;
    }

    public AgentMemoryApi getAgentMemory() {
        return this.agentMemory;
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
