import { HttpClient, createHttpClient } from './http/client';
import type { SdkworkAppConfig } from './types/common';
import type { AuthTokenManager } from '@sdkwork/sdk-common';

import { WorkspacesApi, createWorkspacesApi } from './api/workspaces';
import { VoiceSpeakersApi, createVoiceSpeakersApi } from './api/voice-speakers';
import { VideoApi, createVideoApi } from './api/video';
import { SettingsApi, createSettingsApi } from './api/settings';
import { ProfileApi, createProfileApi } from './api/profile';
import { PasswordApi, createPasswordApi } from './api/password';
import { AddressApi, createAddressApi } from './api/address';
import { TenantApi, createTenantApi } from './api/tenant';
import { SocialApi, createSocialApi } from './api/social';
import { ShopsApi, createShopsApi } from './api/shops';
import { ShareApi, createShareApi } from './api/share';
import { AiApi, createAiApi } from './api/ai';
import { ProjectsApi, createProjectsApi } from './api/projects';
import { PartnerApi, createPartnerApi } from './api/partner';
import { NotificationApi, createNotificationApi } from './api/notification';
import { AppApi, createAppApi } from './api/app';
import { NewsApi, createNewsApi } from './api/news';
import { MusicApi, createMusicApi } from './api/music';
import { InvoiceApi, createInvoiceApi } from './api/invoice';
import { ImageApi, createImageApi } from './api/image';
import { StyleApi, createStyleApi } from './api/style';
import { FileSystemApi, createFileSystemApi } from './api/file-system';
import { FeedbackApi, createFeedbackApi } from './api/feedback';
import { FavoriteApi, createFavoriteApi } from './api/favorite';
import { DriveApi, createDriveApi } from './api/drive';
import { AppDocumentsApi, createAppDocumentsApi } from './api/app-documents';
import { DashboardApi, createDashboardApi } from './api/dashboard';
import { CollectionApi, createCollectionApi } from './api/collection';
import { ChatApi, createChatApi } from './api/chat';
import { CharacterApi, createCharacterApi } from './api/character';
import { CategoryApi, createCategoryApi } from './api/category';
import { CartApi, createCartApi } from './api/cart';
import { AssetsApi, createAssetsApi } from './api/assets';
import { AnnouncementApi, createAnnouncementApi } from './api/announcement';
import { AdvertApi, createAdvertApi } from './api/advert';
import { VoteApi, createVoteApi } from './api/vote';
import { VipApi, createVipApi } from './api/vip';
import { DeactivateApi, createDeactivateApi } from './api/deactivate';
import { BindApi, createBindApi } from './api/bind';
import { AvatarApi, createAvatarApi } from './api/avatar';
import { UploadApi, createUploadApi } from './api/upload';
import { SearchApi, createSearchApi } from './api/search';
import { PaymentsApi, createPaymentsApi } from './api/payments';
import { OrganizationApi, createOrganizationApi } from './api/organization';
import { DisableApi, createDisableApi } from './api/disable';
import { ActivateApi, createActivateApi } from './api/activate';
import { PositionApi, createPositionApi } from './api/position';
import { DepartmentApi, createDepartmentApi } from './api/department';
import { OrdersApi, createOrdersApi } from './api/orders';
import { ModelsApi, createModelsApi } from './api/models';
import { HistoryApi, createHistoryApi } from './api/history';
import { VoiceSpeakerApi, createVoiceSpeakerApi } from './api/voice-speaker';
import { SoundEffectApi, createSoundEffectApi } from './api/sound-effect';
import { AudioApi, createAudioApi } from './api/audio';
import { FeedApi, createFeedApi } from './api/feed';
import { CurrencyApi, createCurrencyApi } from './api/currency';
import { CouponsApi, createCouponsApi } from './api/coupons';
import { CommentsApi, createCommentsApi } from './api/comments';
import { SmsApi, createSmsApi } from './api/sms';
import { RegisterApi, createRegisterApi } from './api/register';
import { RefreshApi, createRefreshApi } from './api/refresh';
import { QrApi, createQrApi } from './api/qr';
import { PhoneApi, createPhoneApi } from './api/phone';
import { OauthApi, createOauthApi } from './api/oauth';
import { LogoutApi, createLogoutApi } from './api/logout';
import { LoginApi, createLoginApi } from './api/login';
import { AuditApi, createAuditApi } from './api/audit';
import { AnalyticsApi, createAnalyticsApi } from './api/analytics';
import { ActivityApi, createActivityApi } from './api/activity';
import { AccountApi, createAccountApi } from './api/account';
import { AbApi, createAbApi } from './api/ab';
import { SkuApi, createSkuApi } from './api/sku';
import { ProductsApi, createProductsApi } from './api/products';
import { PositionsApi, createPositionsApi } from './api/positions';
import { MembersApi, createMembersApi } from './api/members';
import { DepartmentsApi, createDepartmentsApi } from './api/departments';
import { ChildrenApi, createChildrenApi } from './api/children';
import { StatisticsApi, createStatisticsApi } from './api/statistics';
import { MemberApi, createMemberApi } from './api/member';
import { ListApi, createListApi } from './api/list';
import { CodeApi, createCodeApi } from './api/code';
import { AuthApi, createAuthApi } from './api/auth';
import { GenerationApi, createGenerationApi } from './api/generation';

export class SdkworkAppClient {
  private httpClient: HttpClient;

  public readonly workspaces: WorkspacesApi;
  public readonly voiceSpeakers: VoiceSpeakersApi;
  public readonly video: VideoApi;
  public readonly settings: SettingsApi;
  public readonly profile: ProfileApi;
  public readonly password: PasswordApi;
  public readonly address: AddressApi;
  public readonly tenant: TenantApi;
  public readonly social: SocialApi;
  public readonly shops: ShopsApi;
  public readonly share: ShareApi;
  public readonly ai: AiApi;
  public readonly projects: ProjectsApi;
  public readonly partner: PartnerApi;
  public readonly notification: NotificationApi;
  public readonly app: AppApi;
  public readonly news: NewsApi;
  public readonly music: MusicApi;
  public readonly invoice: InvoiceApi;
  public readonly image: ImageApi;
  public readonly style: StyleApi;
  public readonly fileSystem: FileSystemApi;
  public readonly feedback: FeedbackApi;
  public readonly favorite: FavoriteApi;
  public readonly drive: DriveApi;
  public readonly appDocuments: AppDocumentsApi;
  public readonly dashboard: DashboardApi;
  public readonly collection: CollectionApi;
  public readonly chat: ChatApi;
  public readonly character: CharacterApi;
  public readonly category: CategoryApi;
  public readonly cart: CartApi;
  public readonly assets: AssetsApi;
  public readonly announcement: AnnouncementApi;
  public readonly advert: AdvertApi;
  public readonly vote: VoteApi;
  public readonly vip: VipApi;
  public readonly deactivate: DeactivateApi;
  public readonly bind: BindApi;
  public readonly avatar: AvatarApi;
  public readonly upload: UploadApi;
  public readonly search: SearchApi;
  public readonly payments: PaymentsApi;
  public readonly organization: OrganizationApi;
  public readonly disable: DisableApi;
  public readonly activate: ActivateApi;
  public readonly position: PositionApi;
  public readonly department: DepartmentApi;
  public readonly orders: OrdersApi;
  public readonly models: ModelsApi;
  public readonly history: HistoryApi;
  public readonly voiceSpeaker: VoiceSpeakerApi;
  public readonly soundEffect: SoundEffectApi;
  public readonly audio: AudioApi;
  public readonly feed: FeedApi;
  public readonly currency: CurrencyApi;
  public readonly coupons: CouponsApi;
  public readonly comments: CommentsApi;
  public readonly sms: SmsApi;
  public readonly register: RegisterApi;
  public readonly refresh: RefreshApi;
  public readonly qr: QrApi;
  public readonly phone: PhoneApi;
  public readonly oauth: OauthApi;
  public readonly logout: LogoutApi;
  public readonly login: LoginApi;
  public readonly audit: AuditApi;
  public readonly analytics: AnalyticsApi;
  public readonly activity: ActivityApi;
  public readonly account: AccountApi;
  public readonly ab: AbApi;
  public readonly sku: SkuApi;
  public readonly products: ProductsApi;
  public readonly positions: PositionsApi;
  public readonly members: MembersApi;
  public readonly departments: DepartmentsApi;
  public readonly children: ChildrenApi;
  public readonly statistics: StatisticsApi;
  public readonly member: MemberApi;
  public readonly list: ListApi;
  public readonly code: CodeApi;
  public readonly auth: AuthApi;
  public readonly generation: GenerationApi;

  constructor(config: SdkworkAppConfig) {
    this.httpClient = createHttpClient(config);
    this.workspaces = createWorkspacesApi(this.httpClient);

    this.voiceSpeakers = createVoiceSpeakersApi(this.httpClient);

    this.video = createVideoApi(this.httpClient);

    this.settings = createSettingsApi(this.httpClient);

    this.profile = createProfileApi(this.httpClient);

    this.password = createPasswordApi(this.httpClient);

    this.address = createAddressApi(this.httpClient);

    this.tenant = createTenantApi(this.httpClient);

    this.social = createSocialApi(this.httpClient);

    this.shops = createShopsApi(this.httpClient);

    this.share = createShareApi(this.httpClient);

    this.ai = createAiApi(this.httpClient);

    this.projects = createProjectsApi(this.httpClient);

    this.partner = createPartnerApi(this.httpClient);

    this.notification = createNotificationApi(this.httpClient);

    this.app = createAppApi(this.httpClient);

    this.news = createNewsApi(this.httpClient);

    this.music = createMusicApi(this.httpClient);

    this.invoice = createInvoiceApi(this.httpClient);

    this.image = createImageApi(this.httpClient);

    this.style = createStyleApi(this.httpClient);

    this.fileSystem = createFileSystemApi(this.httpClient);

    this.feedback = createFeedbackApi(this.httpClient);

    this.favorite = createFavoriteApi(this.httpClient);

    this.drive = createDriveApi(this.httpClient);

    this.appDocuments = createAppDocumentsApi(this.httpClient);

    this.dashboard = createDashboardApi(this.httpClient);

    this.collection = createCollectionApi(this.httpClient);

    this.chat = createChatApi(this.httpClient);

    this.character = createCharacterApi(this.httpClient);

    this.category = createCategoryApi(this.httpClient);

    this.cart = createCartApi(this.httpClient);

    this.assets = createAssetsApi(this.httpClient);

    this.announcement = createAnnouncementApi(this.httpClient);

    this.advert = createAdvertApi(this.httpClient);

    this.vote = createVoteApi(this.httpClient);

    this.vip = createVipApi(this.httpClient);

    this.deactivate = createDeactivateApi(this.httpClient);

    this.bind = createBindApi(this.httpClient);

    this.avatar = createAvatarApi(this.httpClient);

    this.upload = createUploadApi(this.httpClient);

    this.search = createSearchApi(this.httpClient);

    this.payments = createPaymentsApi(this.httpClient);

    this.organization = createOrganizationApi(this.httpClient);

    this.disable = createDisableApi(this.httpClient);

    this.activate = createActivateApi(this.httpClient);

    this.position = createPositionApi(this.httpClient);

    this.department = createDepartmentApi(this.httpClient);

    this.orders = createOrdersApi(this.httpClient);

    this.models = createModelsApi(this.httpClient);

    this.history = createHistoryApi(this.httpClient);

    this.voiceSpeaker = createVoiceSpeakerApi(this.httpClient);

    this.soundEffect = createSoundEffectApi(this.httpClient);

    this.audio = createAudioApi(this.httpClient);

    this.feed = createFeedApi(this.httpClient);

    this.currency = createCurrencyApi(this.httpClient);

    this.coupons = createCouponsApi(this.httpClient);

    this.comments = createCommentsApi(this.httpClient);

    this.sms = createSmsApi(this.httpClient);

    this.register = createRegisterApi(this.httpClient);

    this.refresh = createRefreshApi(this.httpClient);

    this.qr = createQrApi(this.httpClient);

    this.phone = createPhoneApi(this.httpClient);

    this.oauth = createOauthApi(this.httpClient);

    this.logout = createLogoutApi(this.httpClient);

    this.login = createLoginApi(this.httpClient);

    this.audit = createAuditApi(this.httpClient);

    this.analytics = createAnalyticsApi(this.httpClient);

    this.activity = createActivityApi(this.httpClient);

    this.account = createAccountApi(this.httpClient);

    this.ab = createAbApi(this.httpClient);

    this.sku = createSkuApi(this.httpClient);

    this.products = createProductsApi(this.httpClient);

    this.positions = createPositionsApi(this.httpClient);

    this.members = createMembersApi(this.httpClient);

    this.departments = createDepartmentsApi(this.httpClient);

    this.children = createChildrenApi(this.httpClient);

    this.statistics = createStatisticsApi(this.httpClient);

    this.member = createMemberApi(this.httpClient);

    this.list = createListApi(this.httpClient);

    this.code = createCodeApi(this.httpClient);

    this.auth = createAuthApi(this.httpClient);

    this.generation = createGenerationApi(this.httpClient);
  }

  setApiKey(apiKey: string): this {
    this.httpClient.setApiKey(apiKey);
    return this;
  }

  setAuthToken(token: string): this {
    this.httpClient.setAuthToken(token);
    return this;
  }

  setAccessToken(token: string): this {
    this.httpClient.setAccessToken(token);
    return this;
  }

  setTokenManager(manager: AuthTokenManager): this {
    this.httpClient.setTokenManager(manager);
    return this;
  }

  get http(): HttpClient {
    return this.httpClient;
  }
}

export function createClient(config: SdkworkAppConfig): SdkworkAppClient {
  return new SdkworkAppClient(config);
}

export default SdkworkAppClient;
