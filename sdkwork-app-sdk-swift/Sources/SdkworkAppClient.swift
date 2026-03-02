import Foundation
import SDKworkCommon

public class SdkworkAppClient {
    private let httpClient: HttpClient
    public let workspaces: WorkspacesApi
    public let voiceSpeakers: VoiceSpeakersApi
    public let video: VideoApi
    public let settings: SettingsApi
    public let profile: ProfileApi
    public let password: PasswordApi
    public let address: AddressApi
    public let tenant: TenantApi
    public let social: SocialApi
    public let shops: ShopsApi
    public let share: ShareApi
    public let ai: AiApi
    public let projects: ProjectsApi
    public let partner: PartnerApi
    public let notification: NotificationApi
    public let app: AppApi
    public let news: NewsApi
    public let music: MusicApi
    public let invoice: InvoiceApi
    public let image: ImageApi
    public let style: StyleApi
    public let fileSystem: FileSystemApi
    public let feedback: FeedbackApi
    public let favorite: FavoriteApi
    public let drive: DriveApi
    public let appDocuments: AppDocumentsApi
    public let dashboard: DashboardApi
    public let collection: CollectionApi
    public let chat: ChatApi
    public let character: CharacterApi
    public let category: CategoryApi
    public let cart: CartApi
    public let assets: AssetsApi
    public let announcement: AnnouncementApi
    public let advert: AdvertApi
    public let vote: VoteApi
    public let vip: VipApi
    public let deactivate: DeactivateApi
    public let bind: BindApi
    public let avatar: AvatarApi
    public let upload: UploadApi
    public let search: SearchApi
    public let payments: PaymentsApi
    public let organization: OrganizationApi
    public let disable: DisableApi
    public let activate: ActivateApi
    public let position: PositionApi
    public let department: DepartmentApi
    public let orders: OrdersApi
    public let models: ModelsApi
    public let history: HistoryApi
    public let voiceSpeaker: VoiceSpeakerApi
    public let soundEffect: SoundEffectApi
    public let audio: AudioApi
    public let feed: FeedApi
    public let currency: CurrencyApi
    public let coupons: CouponsApi
    public let comments: CommentsApi
    public let sms: SmsApi
    public let register: RegisterApi
    public let refresh: RefreshApi
    public let qr: QrApi
    public let phone: PhoneApi
    public let oauth: OauthApi
    public let logout: LogoutApi
    public let login: LoginApi
    public let audit: AuditApi
    public let analytics: AnalyticsApi
    public let activity: ActivityApi
    public let account: AccountApi
    public let ab: AbApi
    public let sku: SkuApi
    public let products: ProductsApi
    public let positions: PositionsApi
    public let members: MembersApi
    public let departments: DepartmentsApi
    public let children: ChildrenApi
    public let statistics: StatisticsApi
    public let member: MemberApi
    public let list: ListApi
    public let code: CodeApi

    public init(baseURL: String) {
        self.httpClient = HttpClient(baseURL: baseURL)
        self.workspaces = WorkspacesApi(client: httpClient)
        self.voiceSpeakers = VoiceSpeakersApi(client: httpClient)
        self.video = VideoApi(client: httpClient)
        self.settings = SettingsApi(client: httpClient)
        self.profile = ProfileApi(client: httpClient)
        self.password = PasswordApi(client: httpClient)
        self.address = AddressApi(client: httpClient)
        self.tenant = TenantApi(client: httpClient)
        self.social = SocialApi(client: httpClient)
        self.shops = ShopsApi(client: httpClient)
        self.share = ShareApi(client: httpClient)
        self.ai = AiApi(client: httpClient)
        self.projects = ProjectsApi(client: httpClient)
        self.partner = PartnerApi(client: httpClient)
        self.notification = NotificationApi(client: httpClient)
        self.app = AppApi(client: httpClient)
        self.news = NewsApi(client: httpClient)
        self.music = MusicApi(client: httpClient)
        self.invoice = InvoiceApi(client: httpClient)
        self.image = ImageApi(client: httpClient)
        self.style = StyleApi(client: httpClient)
        self.fileSystem = FileSystemApi(client: httpClient)
        self.feedback = FeedbackApi(client: httpClient)
        self.favorite = FavoriteApi(client: httpClient)
        self.drive = DriveApi(client: httpClient)
        self.appDocuments = AppDocumentsApi(client: httpClient)
        self.dashboard = DashboardApi(client: httpClient)
        self.collection = CollectionApi(client: httpClient)
        self.chat = ChatApi(client: httpClient)
        self.character = CharacterApi(client: httpClient)
        self.category = CategoryApi(client: httpClient)
        self.cart = CartApi(client: httpClient)
        self.assets = AssetsApi(client: httpClient)
        self.announcement = AnnouncementApi(client: httpClient)
        self.advert = AdvertApi(client: httpClient)
        self.vote = VoteApi(client: httpClient)
        self.vip = VipApi(client: httpClient)
        self.deactivate = DeactivateApi(client: httpClient)
        self.bind = BindApi(client: httpClient)
        self.avatar = AvatarApi(client: httpClient)
        self.upload = UploadApi(client: httpClient)
        self.search = SearchApi(client: httpClient)
        self.payments = PaymentsApi(client: httpClient)
        self.organization = OrganizationApi(client: httpClient)
        self.disable = DisableApi(client: httpClient)
        self.activate = ActivateApi(client: httpClient)
        self.position = PositionApi(client: httpClient)
        self.department = DepartmentApi(client: httpClient)
        self.orders = OrdersApi(client: httpClient)
        self.models = ModelsApi(client: httpClient)
        self.history = HistoryApi(client: httpClient)
        self.voiceSpeaker = VoiceSpeakerApi(client: httpClient)
        self.soundEffect = SoundEffectApi(client: httpClient)
        self.audio = AudioApi(client: httpClient)
        self.feed = FeedApi(client: httpClient)
        self.currency = CurrencyApi(client: httpClient)
        self.coupons = CouponsApi(client: httpClient)
        self.comments = CommentsApi(client: httpClient)
        self.sms = SmsApi(client: httpClient)
        self.register = RegisterApi(client: httpClient)
        self.refresh = RefreshApi(client: httpClient)
        self.qr = QrApi(client: httpClient)
        self.phone = PhoneApi(client: httpClient)
        self.oauth = OauthApi(client: httpClient)
        self.logout = LogoutApi(client: httpClient)
        self.login = LoginApi(client: httpClient)
        self.audit = AuditApi(client: httpClient)
        self.analytics = AnalyticsApi(client: httpClient)
        self.activity = ActivityApi(client: httpClient)
        self.account = AccountApi(client: httpClient)
        self.ab = AbApi(client: httpClient)
        self.sku = SkuApi(client: httpClient)
        self.products = ProductsApi(client: httpClient)
        self.positions = PositionsApi(client: httpClient)
        self.members = MembersApi(client: httpClient)
        self.departments = DepartmentsApi(client: httpClient)
        self.children = ChildrenApi(client: httpClient)
        self.statistics = StatisticsApi(client: httpClient)
        self.member = MemberApi(client: httpClient)
        self.list = ListApi(client: httpClient)
        self.code = CodeApi(client: httpClient)
    }

    public init(config: SdkConfig) {
        self.httpClient = HttpClient(config: config)
        self.workspaces = WorkspacesApi(client: httpClient)
        self.voiceSpeakers = VoiceSpeakersApi(client: httpClient)
        self.video = VideoApi(client: httpClient)
        self.settings = SettingsApi(client: httpClient)
        self.profile = ProfileApi(client: httpClient)
        self.password = PasswordApi(client: httpClient)
        self.address = AddressApi(client: httpClient)
        self.tenant = TenantApi(client: httpClient)
        self.social = SocialApi(client: httpClient)
        self.shops = ShopsApi(client: httpClient)
        self.share = ShareApi(client: httpClient)
        self.ai = AiApi(client: httpClient)
        self.projects = ProjectsApi(client: httpClient)
        self.partner = PartnerApi(client: httpClient)
        self.notification = NotificationApi(client: httpClient)
        self.app = AppApi(client: httpClient)
        self.news = NewsApi(client: httpClient)
        self.music = MusicApi(client: httpClient)
        self.invoice = InvoiceApi(client: httpClient)
        self.image = ImageApi(client: httpClient)
        self.style = StyleApi(client: httpClient)
        self.fileSystem = FileSystemApi(client: httpClient)
        self.feedback = FeedbackApi(client: httpClient)
        self.favorite = FavoriteApi(client: httpClient)
        self.drive = DriveApi(client: httpClient)
        self.appDocuments = AppDocumentsApi(client: httpClient)
        self.dashboard = DashboardApi(client: httpClient)
        self.collection = CollectionApi(client: httpClient)
        self.chat = ChatApi(client: httpClient)
        self.character = CharacterApi(client: httpClient)
        self.category = CategoryApi(client: httpClient)
        self.cart = CartApi(client: httpClient)
        self.assets = AssetsApi(client: httpClient)
        self.announcement = AnnouncementApi(client: httpClient)
        self.advert = AdvertApi(client: httpClient)
        self.vote = VoteApi(client: httpClient)
        self.vip = VipApi(client: httpClient)
        self.deactivate = DeactivateApi(client: httpClient)
        self.bind = BindApi(client: httpClient)
        self.avatar = AvatarApi(client: httpClient)
        self.upload = UploadApi(client: httpClient)
        self.search = SearchApi(client: httpClient)
        self.payments = PaymentsApi(client: httpClient)
        self.organization = OrganizationApi(client: httpClient)
        self.disable = DisableApi(client: httpClient)
        self.activate = ActivateApi(client: httpClient)
        self.position = PositionApi(client: httpClient)
        self.department = DepartmentApi(client: httpClient)
        self.orders = OrdersApi(client: httpClient)
        self.models = ModelsApi(client: httpClient)
        self.history = HistoryApi(client: httpClient)
        self.voiceSpeaker = VoiceSpeakerApi(client: httpClient)
        self.soundEffect = SoundEffectApi(client: httpClient)
        self.audio = AudioApi(client: httpClient)
        self.feed = FeedApi(client: httpClient)
        self.currency = CurrencyApi(client: httpClient)
        self.coupons = CouponsApi(client: httpClient)
        self.comments = CommentsApi(client: httpClient)
        self.sms = SmsApi(client: httpClient)
        self.register = RegisterApi(client: httpClient)
        self.refresh = RefreshApi(client: httpClient)
        self.qr = QrApi(client: httpClient)
        self.phone = PhoneApi(client: httpClient)
        self.oauth = OauthApi(client: httpClient)
        self.logout = LogoutApi(client: httpClient)
        self.login = LoginApi(client: httpClient)
        self.audit = AuditApi(client: httpClient)
        self.analytics = AnalyticsApi(client: httpClient)
        self.activity = ActivityApi(client: httpClient)
        self.account = AccountApi(client: httpClient)
        self.ab = AbApi(client: httpClient)
        self.sku = SkuApi(client: httpClient)
        self.products = ProductsApi(client: httpClient)
        self.positions = PositionsApi(client: httpClient)
        self.members = MembersApi(client: httpClient)
        self.departments = DepartmentsApi(client: httpClient)
        self.children = ChildrenApi(client: httpClient)
        self.statistics = StatisticsApi(client: httpClient)
        self.member = MemberApi(client: httpClient)
        self.list = ListApi(client: httpClient)
        self.code = CodeApi(client: httpClient)
    }

    public func setApiKey(_ apiKey: String) -> SdkworkAppClient {
        httpClient.setApiKey(apiKey)
        return self
    }

    public func setAuthToken(_ token: String) -> SdkworkAppClient {
        httpClient.setAuthToken(token)
        return self
    }

    public func setAccessToken(_ token: String) -> SdkworkAppClient {
        httpClient.setAccessToken(token)
        return self
    }

    public func setHeader(_ key: String, value: String) -> SdkworkAppClient {
        httpClient.setHeader(key, value: value)
        return self
    }
}
