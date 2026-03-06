import Foundation
import SDKworkCommon

public class SdkworkAppClient {
    private let httpClient: HttpClient
    public let workspaces: WorkspacesApi
    public let voiceSpeaker: VoiceSpeakerApi
    public let video: VideoApi
    public let user: UserApi
    public let tool: ToolApi
    public let tenant: TenantApi
    public let social: SocialApi
    public let skill: SkillApi
    public let shops: ShopsApi
    public let share: ShareApi
    public let settings: SettingsApi
    public let ai: AiApi
    public let projects: ProjectsApi
    public let products: ProductsApi
    public let partner: PartnerApi
    public let notification: NotificationApi
    public let notes: NotesApi
    public let news: NewsApi
    public let music: MusicApi
    public let knowledgeDocuments: KnowledgeDocumentsApi
    public let invoice: InvoiceApi
    public let image: ImageApi
    public let style: StyleApi
    public let fileSystem: FileSystemApi
    public let feedback: FeedbackApi
    public let favorite: FavoriteApi
    public let drive: DriveApi
    public let documents: DocumentsApi
    public let dashboard: DashboardApi
    public let collection: CollectionApi
    public let chat: ChatApi
    public let character: CharacterApi
    public let category: CategoryApi
    public let cart: CartApi
    public let assets: AssetsApi
    public let app: AppApi
    public let announcement: AnnouncementApi
    public let agent: AgentApi
    public let advert: AdvertApi
    public let wallet: WalletApi
    public let vote: VoteApi
    public let vip: VipApi
    public let upload: UploadApi
    public let search: SearchApi
    public let rtc: RtcApi
    public let payments: PaymentsApi
    public let organization: OrganizationApi
    public let orders: OrdersApi
    public let model: ModelApi
    public let history: HistoryApi
    public let soundEffect: SoundEffectApi
    public let generation: GenerationApi
    public let audio: AudioApi
    public let feed: FeedApi
    public let currency: CurrencyApi
    public let coupons: CouponsApi
    public let comments: CommentsApi
    public let auth: AuthApi
    public let audit: AuditApi
    public let analytics: AnalyticsApi
    public let agentMemory: AgentMemoryApi
    public let activity: ActivityApi
    public let account: AccountApi
    public let ab: AbApi
    public let sku: SkuApi

    public init(baseURL: String) {
        self.httpClient = HttpClient(baseURL: baseURL)
        self.workspaces = WorkspacesApi(client: httpClient)
        self.voiceSpeaker = VoiceSpeakerApi(client: httpClient)
        self.video = VideoApi(client: httpClient)
        self.user = UserApi(client: httpClient)
        self.tool = ToolApi(client: httpClient)
        self.tenant = TenantApi(client: httpClient)
        self.social = SocialApi(client: httpClient)
        self.skill = SkillApi(client: httpClient)
        self.shops = ShopsApi(client: httpClient)
        self.share = ShareApi(client: httpClient)
        self.settings = SettingsApi(client: httpClient)
        self.ai = AiApi(client: httpClient)
        self.projects = ProjectsApi(client: httpClient)
        self.products = ProductsApi(client: httpClient)
        self.partner = PartnerApi(client: httpClient)
        self.notification = NotificationApi(client: httpClient)
        self.notes = NotesApi(client: httpClient)
        self.news = NewsApi(client: httpClient)
        self.music = MusicApi(client: httpClient)
        self.knowledgeDocuments = KnowledgeDocumentsApi(client: httpClient)
        self.invoice = InvoiceApi(client: httpClient)
        self.image = ImageApi(client: httpClient)
        self.style = StyleApi(client: httpClient)
        self.fileSystem = FileSystemApi(client: httpClient)
        self.feedback = FeedbackApi(client: httpClient)
        self.favorite = FavoriteApi(client: httpClient)
        self.drive = DriveApi(client: httpClient)
        self.documents = DocumentsApi(client: httpClient)
        self.dashboard = DashboardApi(client: httpClient)
        self.collection = CollectionApi(client: httpClient)
        self.chat = ChatApi(client: httpClient)
        self.character = CharacterApi(client: httpClient)
        self.category = CategoryApi(client: httpClient)
        self.cart = CartApi(client: httpClient)
        self.assets = AssetsApi(client: httpClient)
        self.app = AppApi(client: httpClient)
        self.announcement = AnnouncementApi(client: httpClient)
        self.agent = AgentApi(client: httpClient)
        self.advert = AdvertApi(client: httpClient)
        self.wallet = WalletApi(client: httpClient)
        self.vote = VoteApi(client: httpClient)
        self.vip = VipApi(client: httpClient)
        self.upload = UploadApi(client: httpClient)
        self.search = SearchApi(client: httpClient)
        self.rtc = RtcApi(client: httpClient)
        self.payments = PaymentsApi(client: httpClient)
        self.organization = OrganizationApi(client: httpClient)
        self.orders = OrdersApi(client: httpClient)
        self.model = ModelApi(client: httpClient)
        self.history = HistoryApi(client: httpClient)
        self.soundEffect = SoundEffectApi(client: httpClient)
        self.generation = GenerationApi(client: httpClient)
        self.audio = AudioApi(client: httpClient)
        self.feed = FeedApi(client: httpClient)
        self.currency = CurrencyApi(client: httpClient)
        self.coupons = CouponsApi(client: httpClient)
        self.comments = CommentsApi(client: httpClient)
        self.auth = AuthApi(client: httpClient)
        self.audit = AuditApi(client: httpClient)
        self.analytics = AnalyticsApi(client: httpClient)
        self.agentMemory = AgentMemoryApi(client: httpClient)
        self.activity = ActivityApi(client: httpClient)
        self.account = AccountApi(client: httpClient)
        self.ab = AbApi(client: httpClient)
        self.sku = SkuApi(client: httpClient)
    }

    public init(config: SdkConfig) {
        self.httpClient = HttpClient(config: config)
        self.workspaces = WorkspacesApi(client: httpClient)
        self.voiceSpeaker = VoiceSpeakerApi(client: httpClient)
        self.video = VideoApi(client: httpClient)
        self.user = UserApi(client: httpClient)
        self.tool = ToolApi(client: httpClient)
        self.tenant = TenantApi(client: httpClient)
        self.social = SocialApi(client: httpClient)
        self.skill = SkillApi(client: httpClient)
        self.shops = ShopsApi(client: httpClient)
        self.share = ShareApi(client: httpClient)
        self.settings = SettingsApi(client: httpClient)
        self.ai = AiApi(client: httpClient)
        self.projects = ProjectsApi(client: httpClient)
        self.products = ProductsApi(client: httpClient)
        self.partner = PartnerApi(client: httpClient)
        self.notification = NotificationApi(client: httpClient)
        self.notes = NotesApi(client: httpClient)
        self.news = NewsApi(client: httpClient)
        self.music = MusicApi(client: httpClient)
        self.knowledgeDocuments = KnowledgeDocumentsApi(client: httpClient)
        self.invoice = InvoiceApi(client: httpClient)
        self.image = ImageApi(client: httpClient)
        self.style = StyleApi(client: httpClient)
        self.fileSystem = FileSystemApi(client: httpClient)
        self.feedback = FeedbackApi(client: httpClient)
        self.favorite = FavoriteApi(client: httpClient)
        self.drive = DriveApi(client: httpClient)
        self.documents = DocumentsApi(client: httpClient)
        self.dashboard = DashboardApi(client: httpClient)
        self.collection = CollectionApi(client: httpClient)
        self.chat = ChatApi(client: httpClient)
        self.character = CharacterApi(client: httpClient)
        self.category = CategoryApi(client: httpClient)
        self.cart = CartApi(client: httpClient)
        self.assets = AssetsApi(client: httpClient)
        self.app = AppApi(client: httpClient)
        self.announcement = AnnouncementApi(client: httpClient)
        self.agent = AgentApi(client: httpClient)
        self.advert = AdvertApi(client: httpClient)
        self.wallet = WalletApi(client: httpClient)
        self.vote = VoteApi(client: httpClient)
        self.vip = VipApi(client: httpClient)
        self.upload = UploadApi(client: httpClient)
        self.search = SearchApi(client: httpClient)
        self.rtc = RtcApi(client: httpClient)
        self.payments = PaymentsApi(client: httpClient)
        self.organization = OrganizationApi(client: httpClient)
        self.orders = OrdersApi(client: httpClient)
        self.model = ModelApi(client: httpClient)
        self.history = HistoryApi(client: httpClient)
        self.soundEffect = SoundEffectApi(client: httpClient)
        self.generation = GenerationApi(client: httpClient)
        self.audio = AudioApi(client: httpClient)
        self.feed = FeedApi(client: httpClient)
        self.currency = CurrencyApi(client: httpClient)
        self.coupons = CouponsApi(client: httpClient)
        self.comments = CommentsApi(client: httpClient)
        self.auth = AuthApi(client: httpClient)
        self.audit = AuditApi(client: httpClient)
        self.analytics = AnalyticsApi(client: httpClient)
        self.agentMemory = AgentMemoryApi(client: httpClient)
        self.activity = ActivityApi(client: httpClient)
        self.account = AccountApi(client: httpClient)
        self.ab = AbApi(client: httpClient)
        self.sku = SkuApi(client: httpClient)
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
