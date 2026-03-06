import 'package:sdkwork_common_flutter/sdkwork_common_flutter.dart';
import 'src/http/client.dart';
import '../api/workspaces.dart';
import '../api/voice_speaker.dart';
import '../api/video.dart';
import '../api/user.dart';
import '../api/tool.dart';
import '../api/tenant.dart';
import '../api/social.dart';
import '../api/skill.dart';
import '../api/shops.dart';
import '../api/share.dart';
import '../api/settings.dart';
import '../api/ai.dart';
import '../api/projects.dart';
import '../api/products.dart';
import '../api/partner.dart';
import '../api/notification.dart';
import '../api/notes.dart';
import '../api/news.dart';
import '../api/music.dart';
import '../api/knowledge_documents.dart';
import '../api/invoice.dart';
import '../api/image.dart';
import '../api/style.dart';
import '../api/file_system.dart';
import '../api/feedback.dart';
import '../api/favorite.dart';
import '../api/drive.dart';
import '../api/documents.dart';
import '../api/dashboard.dart';
import '../api/collection.dart';
import '../api/chat.dart';
import '../api/character.dart';
import '../api/category.dart';
import '../api/cart.dart';
import '../api/assets.dart';
import '../api/app.dart';
import '../api/announcement.dart';
import '../api/agent.dart';
import '../api/advert.dart';
import '../api/wallet.dart';
import '../api/vote.dart';
import '../api/vip.dart';
import '../api/upload.dart';
import '../api/search.dart';
import '../api/rtc.dart';
import '../api/payments.dart';
import '../api/organization.dart';
import '../api/orders.dart';
import '../api/model.dart';
import '../api/history.dart';
import '../api/sound_effect.dart';
import '../api/generation.dart';
import '../api/audio.dart';
import '../api/feed.dart';
import '../api/currency.dart';
import '../api/coupons.dart';
import '../api/comments.dart';
import '../api/auth.dart';
import '../api/audit.dart';
import '../api/analytics.dart';
import '../api/agent_memory.dart';
import '../api/activity.dart';
import '../api/account.dart';
import '../api/ab.dart';
import '../api/sku.dart';

class SdkworkAppClient {
  final HttpClient _httpClient;

  late final WorkspacesApi workspaces;
  late final VoiceSpeakerApi voiceSpeaker;
  late final VideoApi video;
  late final UserApi user;
  late final ToolApi tool;
  late final TenantApi tenant;
  late final SocialApi social;
  late final SkillApi skill;
  late final ShopsApi shops;
  late final ShareApi share;
  late final SettingsApi settings;
  late final AiApi ai;
  late final ProjectsApi projects;
  late final ProductsApi products;
  late final PartnerApi partner;
  late final NotificationApi notification;
  late final NotesApi notes;
  late final NewsApi news;
  late final MusicApi music;
  late final KnowledgeDocumentsApi knowledgeDocuments;
  late final InvoiceApi invoice;
  late final ImageApi image;
  late final StyleApi style;
  late final FileSystemApi fileSystem;
  late final FeedbackApi feedback;
  late final FavoriteApi favorite;
  late final DriveApi drive;
  late final DocumentsApi documents;
  late final DashboardApi dashboard;
  late final CollectionApi collection;
  late final ChatApi chat;
  late final CharacterApi character;
  late final CategoryApi category;
  late final CartApi cart;
  late final AssetsApi assets;
  late final AppApi app;
  late final AnnouncementApi announcement;
  late final AgentApi agent;
  late final AdvertApi advert;
  late final WalletApi wallet;
  late final VoteApi vote;
  late final VipApi vip;
  late final UploadApi upload;
  late final SearchApi search;
  late final RtcApi rtc;
  late final PaymentsApi payments;
  late final OrganizationApi organization;
  late final OrdersApi orders;
  late final ModelApi model;
  late final HistoryApi history;
  late final SoundEffectApi soundEffect;
  late final GenerationApi generation;
  late final AudioApi audio;
  late final FeedApi feed;
  late final CurrencyApi currency;
  late final CouponsApi coupons;
  late final CommentsApi comments;
  late final AuthApi auth;
  late final AuditApi audit;
  late final AnalyticsApi analytics;
  late final AgentMemoryApi agentMemory;
  late final ActivityApi activity;
  late final AccountApi account;
  late final AbApi ab;
  late final SkuApi sku;

  SdkworkAppClient({
    required SdkConfig config,
  }) : _httpClient = HttpClient(config: config) {
    workspaces = WorkspacesApi(_httpClient);
    voiceSpeaker = VoiceSpeakerApi(_httpClient);
    video = VideoApi(_httpClient);
    user = UserApi(_httpClient);
    tool = ToolApi(_httpClient);
    tenant = TenantApi(_httpClient);
    social = SocialApi(_httpClient);
    skill = SkillApi(_httpClient);
    shops = ShopsApi(_httpClient);
    share = ShareApi(_httpClient);
    settings = SettingsApi(_httpClient);
    ai = AiApi(_httpClient);
    projects = ProjectsApi(_httpClient);
    products = ProductsApi(_httpClient);
    partner = PartnerApi(_httpClient);
    notification = NotificationApi(_httpClient);
    notes = NotesApi(_httpClient);
    news = NewsApi(_httpClient);
    music = MusicApi(_httpClient);
    knowledgeDocuments = KnowledgeDocumentsApi(_httpClient);
    invoice = InvoiceApi(_httpClient);
    image = ImageApi(_httpClient);
    style = StyleApi(_httpClient);
    fileSystem = FileSystemApi(_httpClient);
    feedback = FeedbackApi(_httpClient);
    favorite = FavoriteApi(_httpClient);
    drive = DriveApi(_httpClient);
    documents = DocumentsApi(_httpClient);
    dashboard = DashboardApi(_httpClient);
    collection = CollectionApi(_httpClient);
    chat = ChatApi(_httpClient);
    character = CharacterApi(_httpClient);
    category = CategoryApi(_httpClient);
    cart = CartApi(_httpClient);
    assets = AssetsApi(_httpClient);
    app = AppApi(_httpClient);
    announcement = AnnouncementApi(_httpClient);
    agent = AgentApi(_httpClient);
    advert = AdvertApi(_httpClient);
    wallet = WalletApi(_httpClient);
    vote = VoteApi(_httpClient);
    vip = VipApi(_httpClient);
    upload = UploadApi(_httpClient);
    search = SearchApi(_httpClient);
    rtc = RtcApi(_httpClient);
    payments = PaymentsApi(_httpClient);
    organization = OrganizationApi(_httpClient);
    orders = OrdersApi(_httpClient);
    model = ModelApi(_httpClient);
    history = HistoryApi(_httpClient);
    soundEffect = SoundEffectApi(_httpClient);
    generation = GenerationApi(_httpClient);
    audio = AudioApi(_httpClient);
    feed = FeedApi(_httpClient);
    currency = CurrencyApi(_httpClient);
    coupons = CouponsApi(_httpClient);
    comments = CommentsApi(_httpClient);
    auth = AuthApi(_httpClient);
    audit = AuditApi(_httpClient);
    analytics = AnalyticsApi(_httpClient);
    agentMemory = AgentMemoryApi(_httpClient);
    activity = ActivityApi(_httpClient);
    account = AccountApi(_httpClient);
    ab = AbApi(_httpClient);
    sku = SkuApi(_httpClient);
  }

  factory SdkworkAppClient.withBaseUrl({
    required String baseUrl,
    String? apiKey,
    String? authToken,
    String? accessToken,
    String apiKeyHeader = 'Authorization',
    bool apiKeyAsBearer = true,
    Map<String, String>? headers,
    int timeout = 30000,
  }) {
    return SdkworkAppClient(
      config: SdkConfig(
        baseUrl: baseUrl,
        timeout: timeout,
        headers: headers ?? const {},
        apiKey: apiKey,
        apiKeyHeader: apiKeyHeader,
        apiKeyAsBearer: apiKeyAsBearer,
        authToken: authToken,
        accessToken: accessToken,
      ),
    );
  }

  void setApiKey(String apiKey) {
    _httpClient.setApiKey(apiKey);
  }

  void setAuthToken(String token) {
    _httpClient.setAuthToken(token);
  }

  void setAccessToken(String token) {
    _httpClient.setAccessToken(token);
  }

  void setHeader(String key, String value) {
    _httpClient.setHeader(key, value);
  }
}
