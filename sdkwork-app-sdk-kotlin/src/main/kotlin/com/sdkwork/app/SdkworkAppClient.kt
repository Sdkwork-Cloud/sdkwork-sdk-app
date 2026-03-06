package com.sdkwork.app

import com.sdkwork.common.core.SdkConfig
import com.sdkwork.app.http.HttpClient
import com.sdkwork.app.api.WorkspacesApi
import com.sdkwork.app.api.VoiceSpeakerApi
import com.sdkwork.app.api.VideoApi
import com.sdkwork.app.api.UserApi
import com.sdkwork.app.api.ToolApi
import com.sdkwork.app.api.TenantApi
import com.sdkwork.app.api.SocialApi
import com.sdkwork.app.api.SkillApi
import com.sdkwork.app.api.ShopsApi
import com.sdkwork.app.api.ShareApi
import com.sdkwork.app.api.SettingsApi
import com.sdkwork.app.api.AiApi
import com.sdkwork.app.api.ProjectsApi
import com.sdkwork.app.api.ProductsApi
import com.sdkwork.app.api.PartnerApi
import com.sdkwork.app.api.NotificationApi
import com.sdkwork.app.api.NotesApi
import com.sdkwork.app.api.NewsApi
import com.sdkwork.app.api.MusicApi
import com.sdkwork.app.api.KnowledgeDocumentsApi
import com.sdkwork.app.api.InvoiceApi
import com.sdkwork.app.api.ImageApi
import com.sdkwork.app.api.StyleApi
import com.sdkwork.app.api.FileSystemApi
import com.sdkwork.app.api.FeedbackApi
import com.sdkwork.app.api.FavoriteApi
import com.sdkwork.app.api.DriveApi
import com.sdkwork.app.api.DocumentsApi
import com.sdkwork.app.api.DashboardApi
import com.sdkwork.app.api.CollectionApi
import com.sdkwork.app.api.ChatApi
import com.sdkwork.app.api.CharacterApi
import com.sdkwork.app.api.CategoryApi
import com.sdkwork.app.api.CartApi
import com.sdkwork.app.api.AssetsApi
import com.sdkwork.app.api.AppApi
import com.sdkwork.app.api.AnnouncementApi
import com.sdkwork.app.api.AgentApi
import com.sdkwork.app.api.AdvertApi
import com.sdkwork.app.api.WalletApi
import com.sdkwork.app.api.VoteApi
import com.sdkwork.app.api.VipApi
import com.sdkwork.app.api.UploadApi
import com.sdkwork.app.api.SearchApi
import com.sdkwork.app.api.RtcApi
import com.sdkwork.app.api.PaymentsApi
import com.sdkwork.app.api.OrganizationApi
import com.sdkwork.app.api.OrdersApi
import com.sdkwork.app.api.ModelApi
import com.sdkwork.app.api.HistoryApi
import com.sdkwork.app.api.SoundEffectApi
import com.sdkwork.app.api.GenerationApi
import com.sdkwork.app.api.AudioApi
import com.sdkwork.app.api.FeedApi
import com.sdkwork.app.api.CurrencyApi
import com.sdkwork.app.api.CouponsApi
import com.sdkwork.app.api.CommentsApi
import com.sdkwork.app.api.AuthApi
import com.sdkwork.app.api.AuditApi
import com.sdkwork.app.api.AnalyticsApi
import com.sdkwork.app.api.AgentMemoryApi
import com.sdkwork.app.api.ActivityApi
import com.sdkwork.app.api.AccountApi
import com.sdkwork.app.api.AbApi
import com.sdkwork.app.api.SkuApi

class SdkworkAppClient {
    private val httpClient: HttpClient

    lateinit var workspaces: WorkspacesApi
    lateinit var voiceSpeaker: VoiceSpeakerApi
    lateinit var video: VideoApi
    lateinit var user: UserApi
    lateinit var tool: ToolApi
    lateinit var tenant: TenantApi
    lateinit var social: SocialApi
    lateinit var skill: SkillApi
    lateinit var shops: ShopsApi
    lateinit var share: ShareApi
    lateinit var settings: SettingsApi
    lateinit var ai: AiApi
    lateinit var projects: ProjectsApi
    lateinit var products: ProductsApi
    lateinit var partner: PartnerApi
    lateinit var notification: NotificationApi
    lateinit var notes: NotesApi
    lateinit var news: NewsApi
    lateinit var music: MusicApi
    lateinit var knowledgeDocuments: KnowledgeDocumentsApi
    lateinit var invoice: InvoiceApi
    lateinit var image: ImageApi
    lateinit var style: StyleApi
    lateinit var fileSystem: FileSystemApi
    lateinit var feedback: FeedbackApi
    lateinit var favorite: FavoriteApi
    lateinit var drive: DriveApi
    lateinit var documents: DocumentsApi
    lateinit var dashboard: DashboardApi
    lateinit var collection: CollectionApi
    lateinit var chat: ChatApi
    lateinit var character: CharacterApi
    lateinit var category: CategoryApi
    lateinit var cart: CartApi
    lateinit var assets: AssetsApi
    lateinit var app: AppApi
    lateinit var announcement: AnnouncementApi
    lateinit var agent: AgentApi
    lateinit var advert: AdvertApi
    lateinit var wallet: WalletApi
    lateinit var vote: VoteApi
    lateinit var vip: VipApi
    lateinit var upload: UploadApi
    lateinit var search: SearchApi
    lateinit var rtc: RtcApi
    lateinit var payments: PaymentsApi
    lateinit var organization: OrganizationApi
    lateinit var orders: OrdersApi
    lateinit var model: ModelApi
    lateinit var history: HistoryApi
    lateinit var soundEffect: SoundEffectApi
    lateinit var generation: GenerationApi
    lateinit var audio: AudioApi
    lateinit var feed: FeedApi
    lateinit var currency: CurrencyApi
    lateinit var coupons: CouponsApi
    lateinit var comments: CommentsApi
    lateinit var auth: AuthApi
    lateinit var audit: AuditApi
    lateinit var analytics: AnalyticsApi
    lateinit var agentMemory: AgentMemoryApi
    lateinit var activity: ActivityApi
    lateinit var account: AccountApi
    lateinit var ab: AbApi
    lateinit var sku: SkuApi

    constructor(baseUrl: String) {
        this.httpClient = HttpClient(baseUrl)
        workspaces = WorkspacesApi(httpClient)
        voiceSpeaker = VoiceSpeakerApi(httpClient)
        video = VideoApi(httpClient)
        user = UserApi(httpClient)
        tool = ToolApi(httpClient)
        tenant = TenantApi(httpClient)
        social = SocialApi(httpClient)
        skill = SkillApi(httpClient)
        shops = ShopsApi(httpClient)
        share = ShareApi(httpClient)
        settings = SettingsApi(httpClient)
        ai = AiApi(httpClient)
        projects = ProjectsApi(httpClient)
        products = ProductsApi(httpClient)
        partner = PartnerApi(httpClient)
        notification = NotificationApi(httpClient)
        notes = NotesApi(httpClient)
        news = NewsApi(httpClient)
        music = MusicApi(httpClient)
        knowledgeDocuments = KnowledgeDocumentsApi(httpClient)
        invoice = InvoiceApi(httpClient)
        image = ImageApi(httpClient)
        style = StyleApi(httpClient)
        fileSystem = FileSystemApi(httpClient)
        feedback = FeedbackApi(httpClient)
        favorite = FavoriteApi(httpClient)
        drive = DriveApi(httpClient)
        documents = DocumentsApi(httpClient)
        dashboard = DashboardApi(httpClient)
        collection = CollectionApi(httpClient)
        chat = ChatApi(httpClient)
        character = CharacterApi(httpClient)
        category = CategoryApi(httpClient)
        cart = CartApi(httpClient)
        assets = AssetsApi(httpClient)
        app = AppApi(httpClient)
        announcement = AnnouncementApi(httpClient)
        agent = AgentApi(httpClient)
        advert = AdvertApi(httpClient)
        wallet = WalletApi(httpClient)
        vote = VoteApi(httpClient)
        vip = VipApi(httpClient)
        upload = UploadApi(httpClient)
        search = SearchApi(httpClient)
        rtc = RtcApi(httpClient)
        payments = PaymentsApi(httpClient)
        organization = OrganizationApi(httpClient)
        orders = OrdersApi(httpClient)
        model = ModelApi(httpClient)
        history = HistoryApi(httpClient)
        soundEffect = SoundEffectApi(httpClient)
        generation = GenerationApi(httpClient)
        audio = AudioApi(httpClient)
        feed = FeedApi(httpClient)
        currency = CurrencyApi(httpClient)
        coupons = CouponsApi(httpClient)
        comments = CommentsApi(httpClient)
        auth = AuthApi(httpClient)
        audit = AuditApi(httpClient)
        analytics = AnalyticsApi(httpClient)
        agentMemory = AgentMemoryApi(httpClient)
        activity = ActivityApi(httpClient)
        account = AccountApi(httpClient)
        ab = AbApi(httpClient)
        sku = SkuApi(httpClient)
    }

    constructor(config: SdkConfig) {
        this.httpClient = HttpClient(config)
        workspaces = WorkspacesApi(httpClient)
        voiceSpeaker = VoiceSpeakerApi(httpClient)
        video = VideoApi(httpClient)
        user = UserApi(httpClient)
        tool = ToolApi(httpClient)
        tenant = TenantApi(httpClient)
        social = SocialApi(httpClient)
        skill = SkillApi(httpClient)
        shops = ShopsApi(httpClient)
        share = ShareApi(httpClient)
        settings = SettingsApi(httpClient)
        ai = AiApi(httpClient)
        projects = ProjectsApi(httpClient)
        products = ProductsApi(httpClient)
        partner = PartnerApi(httpClient)
        notification = NotificationApi(httpClient)
        notes = NotesApi(httpClient)
        news = NewsApi(httpClient)
        music = MusicApi(httpClient)
        knowledgeDocuments = KnowledgeDocumentsApi(httpClient)
        invoice = InvoiceApi(httpClient)
        image = ImageApi(httpClient)
        style = StyleApi(httpClient)
        fileSystem = FileSystemApi(httpClient)
        feedback = FeedbackApi(httpClient)
        favorite = FavoriteApi(httpClient)
        drive = DriveApi(httpClient)
        documents = DocumentsApi(httpClient)
        dashboard = DashboardApi(httpClient)
        collection = CollectionApi(httpClient)
        chat = ChatApi(httpClient)
        character = CharacterApi(httpClient)
        category = CategoryApi(httpClient)
        cart = CartApi(httpClient)
        assets = AssetsApi(httpClient)
        app = AppApi(httpClient)
        announcement = AnnouncementApi(httpClient)
        agent = AgentApi(httpClient)
        advert = AdvertApi(httpClient)
        wallet = WalletApi(httpClient)
        vote = VoteApi(httpClient)
        vip = VipApi(httpClient)
        upload = UploadApi(httpClient)
        search = SearchApi(httpClient)
        rtc = RtcApi(httpClient)
        payments = PaymentsApi(httpClient)
        organization = OrganizationApi(httpClient)
        orders = OrdersApi(httpClient)
        model = ModelApi(httpClient)
        history = HistoryApi(httpClient)
        soundEffect = SoundEffectApi(httpClient)
        generation = GenerationApi(httpClient)
        audio = AudioApi(httpClient)
        feed = FeedApi(httpClient)
        currency = CurrencyApi(httpClient)
        coupons = CouponsApi(httpClient)
        comments = CommentsApi(httpClient)
        auth = AuthApi(httpClient)
        audit = AuditApi(httpClient)
        analytics = AnalyticsApi(httpClient)
        agentMemory = AgentMemoryApi(httpClient)
        activity = ActivityApi(httpClient)
        account = AccountApi(httpClient)
        ab = AbApi(httpClient)
        sku = SkuApi(httpClient)
    }

    fun setApiKey(apiKey: String): SdkworkAppClient {
        httpClient.setApiKey(apiKey)
        return this
    }

    fun setAuthToken(token: String): SdkworkAppClient {
        httpClient.setAuthToken(token)
        return this
    }

    fun setAccessToken(token: String): SdkworkAppClient {
        httpClient.setAccessToken(token)
        return this
    }

    fun setHeader(key: String, value: String): SdkworkAppClient {
        httpClient.setHeader(key, value)
        return this
    }
}
