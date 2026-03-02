import 'package:sdkwork_common_flutter/sdkwork_common_flutter.dart';
import 'src/http/client.dart';
import '../api/workspaces.dart';
import '../api/voice_speakers.dart';
import '../api/video.dart';
import '../api/settings.dart';
import '../api/profile.dart';
import '../api/password.dart';
import '../api/address.dart';
import '../api/tenant.dart';
import '../api/social.dart';
import '../api/shops.dart';
import '../api/share.dart';
import '../api/ai.dart';
import '../api/projects.dart';
import '../api/partner.dart';
import '../api/notification.dart';
import '../api/app.dart';
import '../api/news.dart';
import '../api/music.dart';
import '../api/invoice.dart';
import '../api/image.dart';
import '../api/style.dart';
import '../api/file_system.dart';
import '../api/feedback.dart';
import '../api/favorite.dart';
import '../api/drive.dart';
import '../api/app_documents.dart';
import '../api/dashboard.dart';
import '../api/collection.dart';
import '../api/chat.dart';
import '../api/character.dart';
import '../api/category.dart';
import '../api/cart.dart';
import '../api/assets.dart';
import '../api/announcement.dart';
import '../api/advert.dart';
import '../api/vote.dart';
import '../api/vip.dart';
import '../api/deactivate.dart';
import '../api/bind.dart';
import '../api/avatar.dart';
import '../api/upload.dart';
import '../api/search.dart';
import '../api/payments.dart';
import '../api/organization.dart';
import '../api/disable.dart';
import '../api/activate.dart';
import '../api/position.dart';
import '../api/department.dart';
import '../api/orders.dart';
import '../api/models.dart';
import '../api/history.dart';
import '../api/voice_speaker.dart';
import '../api/sound_effect.dart';
import '../api/audio.dart';
import '../api/feed.dart';
import '../api/currency.dart';
import '../api/coupons.dart';
import '../api/comments.dart';
import '../api/sms.dart';
import '../api/register.dart';
import '../api/refresh.dart';
import '../api/qr.dart';
import '../api/phone.dart';
import '../api/oauth.dart';
import '../api/logout.dart';
import '../api/login.dart';
import '../api/audit.dart';
import '../api/analytics.dart';
import '../api/activity.dart';
import '../api/account.dart';
import '../api/ab.dart';
import '../api/sku.dart';
import '../api/products.dart';
import '../api/positions.dart';
import '../api/members.dart';
import '../api/departments.dart';
import '../api/children.dart';
import '../api/statistics.dart';
import '../api/member.dart';
import '../api/list.dart';
import '../api/code.dart';
import '../api/auth.dart';
import '../api/generation.dart';

class SdkworkAppClient {
  final HttpClient _httpClient;

  late final WorkspacesApi workspaces;
  late final VoiceSpeakersApi voiceSpeakers;
  late final VideoApi video;
  late final SettingsApi settings;
  late final ProfileApi profile;
  late final PasswordApi password;
  late final AddressApi address;
  late final TenantApi tenant;
  late final SocialApi social;
  late final ShopsApi shops;
  late final ShareApi share;
  late final AiApi ai;
  late final ProjectsApi projects;
  late final PartnerApi partner;
  late final NotificationApi notification;
  late final AppApi app;
  late final NewsApi news;
  late final MusicApi music;
  late final InvoiceApi invoice;
  late final ImageApi image;
  late final StyleApi style;
  late final FileSystemApi fileSystem;
  late final FeedbackApi feedback;
  late final FavoriteApi favorite;
  late final DriveApi drive;
  late final AppDocumentsApi appDocuments;
  late final DashboardApi dashboard;
  late final CollectionApi collection;
  late final ChatApi chat;
  late final CharacterApi character;
  late final CategoryApi category;
  late final CartApi cart;
  late final AssetsApi assets;
  late final AnnouncementApi announcement;
  late final AdvertApi advert;
  late final VoteApi vote;
  late final VipApi vip;
  late final DeactivateApi deactivate;
  late final BindApi bind;
  late final AvatarApi avatar;
  late final UploadApi upload;
  late final SearchApi search;
  late final PaymentsApi payments;
  late final OrganizationApi organization;
  late final DisableApi disable;
  late final ActivateApi activate;
  late final PositionApi position;
  late final DepartmentApi department;
  late final OrdersApi orders;
  late final ModelsApi models;
  late final HistoryApi history;
  late final VoiceSpeakerApi voiceSpeaker;
  late final SoundEffectApi soundEffect;
  late final AudioApi audio;
  late final FeedApi feed;
  late final CurrencyApi currency;
  late final CouponsApi coupons;
  late final CommentsApi comments;
  late final SmsApi sms;
  late final RegisterApi register;
  late final RefreshApi refresh;
  late final QrApi qr;
  late final PhoneApi phone;
  late final OauthApi oauth;
  late final LogoutApi logout;
  late final LoginApi login;
  late final AuditApi audit;
  late final AnalyticsApi analytics;
  late final ActivityApi activity;
  late final AccountApi account;
  late final AbApi ab;
  late final SkuApi sku;
  late final ProductsApi products;
  late final PositionsApi positions;
  late final MembersApi members;
  late final DepartmentsApi departments;
  late final ChildrenApi children;
  late final StatisticsApi statistics;
  late final MemberApi member;
  late final ListApi list;
  late final CodeApi code;
  late final AuthApi auth;
  late final GenerationApi generation;

  SdkworkAppClient({
    required SdkConfig config,
  }) : _httpClient = HttpClient(config: config) {
    workspaces = WorkspacesApi(_httpClient);
    voiceSpeakers = VoiceSpeakersApi(_httpClient);
    video = VideoApi(_httpClient);
    settings = SettingsApi(_httpClient);
    profile = ProfileApi(_httpClient);
    password = PasswordApi(_httpClient);
    address = AddressApi(_httpClient);
    tenant = TenantApi(_httpClient);
    social = SocialApi(_httpClient);
    shops = ShopsApi(_httpClient);
    share = ShareApi(_httpClient);
    ai = AiApi(_httpClient);
    projects = ProjectsApi(_httpClient);
    partner = PartnerApi(_httpClient);
    notification = NotificationApi(_httpClient);
    app = AppApi(_httpClient);
    news = NewsApi(_httpClient);
    music = MusicApi(_httpClient);
    invoice = InvoiceApi(_httpClient);
    image = ImageApi(_httpClient);
    style = StyleApi(_httpClient);
    fileSystem = FileSystemApi(_httpClient);
    feedback = FeedbackApi(_httpClient);
    favorite = FavoriteApi(_httpClient);
    drive = DriveApi(_httpClient);
    appDocuments = AppDocumentsApi(_httpClient);
    dashboard = DashboardApi(_httpClient);
    collection = CollectionApi(_httpClient);
    chat = ChatApi(_httpClient);
    character = CharacterApi(_httpClient);
    category = CategoryApi(_httpClient);
    cart = CartApi(_httpClient);
    assets = AssetsApi(_httpClient);
    announcement = AnnouncementApi(_httpClient);
    advert = AdvertApi(_httpClient);
    vote = VoteApi(_httpClient);
    vip = VipApi(_httpClient);
    deactivate = DeactivateApi(_httpClient);
    bind = BindApi(_httpClient);
    avatar = AvatarApi(_httpClient);
    upload = UploadApi(_httpClient);
    search = SearchApi(_httpClient);
    payments = PaymentsApi(_httpClient);
    organization = OrganizationApi(_httpClient);
    disable = DisableApi(_httpClient);
    activate = ActivateApi(_httpClient);
    position = PositionApi(_httpClient);
    department = DepartmentApi(_httpClient);
    orders = OrdersApi(_httpClient);
    models = ModelsApi(_httpClient);
    history = HistoryApi(_httpClient);
    voiceSpeaker = VoiceSpeakerApi(_httpClient);
    soundEffect = SoundEffectApi(_httpClient);
    audio = AudioApi(_httpClient);
    feed = FeedApi(_httpClient);
    currency = CurrencyApi(_httpClient);
    coupons = CouponsApi(_httpClient);
    comments = CommentsApi(_httpClient);
    sms = SmsApi(_httpClient);
    register = RegisterApi(_httpClient);
    refresh = RefreshApi(_httpClient);
    qr = QrApi(_httpClient);
    phone = PhoneApi(_httpClient);
    oauth = OauthApi(_httpClient);
    logout = LogoutApi(_httpClient);
    login = LoginApi(_httpClient);
    audit = AuditApi(_httpClient);
    analytics = AnalyticsApi(_httpClient);
    activity = ActivityApi(_httpClient);
    account = AccountApi(_httpClient);
    ab = AbApi(_httpClient);
    sku = SkuApi(_httpClient);
    products = ProductsApi(_httpClient);
    positions = PositionsApi(_httpClient);
    members = MembersApi(_httpClient);
    departments = DepartmentsApi(_httpClient);
    children = ChildrenApi(_httpClient);
    statistics = StatisticsApi(_httpClient);
    member = MemberApi(_httpClient);
    list = ListApi(_httpClient);
    code = CodeApi(_httpClient);
    auth = AuthApi(_httpClient);
    generation = GenerationApi(_httpClient);
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
