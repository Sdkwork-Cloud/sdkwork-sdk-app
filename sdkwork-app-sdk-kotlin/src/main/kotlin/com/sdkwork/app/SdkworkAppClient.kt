package com.sdkwork.app

import com.sdkwork.common.core.SdkConfig
import com.sdkwork.app.http.HttpClient
import com.sdkwork.app.api.WorkspacesApi
import com.sdkwork.app.api.VoiceSpeakersApi
import com.sdkwork.app.api.VideoApi
import com.sdkwork.app.api.SettingsApi
import com.sdkwork.app.api.ProfileApi
import com.sdkwork.app.api.PasswordApi
import com.sdkwork.app.api.AddressApi
import com.sdkwork.app.api.TenantApi
import com.sdkwork.app.api.SocialApi
import com.sdkwork.app.api.ShopsApi
import com.sdkwork.app.api.ShareApi
import com.sdkwork.app.api.AiApi
import com.sdkwork.app.api.ProjectsApi
import com.sdkwork.app.api.PartnerApi
import com.sdkwork.app.api.NotificationApi
import com.sdkwork.app.api.AppApi
import com.sdkwork.app.api.NewsApi
import com.sdkwork.app.api.MusicApi
import com.sdkwork.app.api.InvoiceApi
import com.sdkwork.app.api.ImageApi
import com.sdkwork.app.api.StyleApi
import com.sdkwork.app.api.FileSystemApi
import com.sdkwork.app.api.FeedbackApi
import com.sdkwork.app.api.FavoriteApi
import com.sdkwork.app.api.DriveApi
import com.sdkwork.app.api.AppDocumentsApi
import com.sdkwork.app.api.DashboardApi
import com.sdkwork.app.api.CollectionApi
import com.sdkwork.app.api.ChatApi
import com.sdkwork.app.api.CharacterApi
import com.sdkwork.app.api.CategoryApi
import com.sdkwork.app.api.CartApi
import com.sdkwork.app.api.AssetsApi
import com.sdkwork.app.api.AnnouncementApi
import com.sdkwork.app.api.AdvertApi
import com.sdkwork.app.api.VoteApi
import com.sdkwork.app.api.VipApi
import com.sdkwork.app.api.DeactivateApi
import com.sdkwork.app.api.BindApi
import com.sdkwork.app.api.AvatarApi
import com.sdkwork.app.api.UploadApi
import com.sdkwork.app.api.SearchApi
import com.sdkwork.app.api.PaymentsApi
import com.sdkwork.app.api.OrganizationApi
import com.sdkwork.app.api.DisableApi
import com.sdkwork.app.api.ActivateApi
import com.sdkwork.app.api.PositionApi
import com.sdkwork.app.api.DepartmentApi
import com.sdkwork.app.api.OrdersApi
import com.sdkwork.app.api.ModelsApi
import com.sdkwork.app.api.HistoryApi
import com.sdkwork.app.api.VoiceSpeakerApi
import com.sdkwork.app.api.SoundEffectApi
import com.sdkwork.app.api.AudioApi
import com.sdkwork.app.api.FeedApi
import com.sdkwork.app.api.CurrencyApi
import com.sdkwork.app.api.CouponsApi
import com.sdkwork.app.api.CommentsApi
import com.sdkwork.app.api.SmsApi
import com.sdkwork.app.api.RegisterApi
import com.sdkwork.app.api.RefreshApi
import com.sdkwork.app.api.QrApi
import com.sdkwork.app.api.PhoneApi
import com.sdkwork.app.api.OauthApi
import com.sdkwork.app.api.LogoutApi
import com.sdkwork.app.api.LoginApi
import com.sdkwork.app.api.AuditApi
import com.sdkwork.app.api.AnalyticsApi
import com.sdkwork.app.api.ActivityApi
import com.sdkwork.app.api.AccountApi
import com.sdkwork.app.api.AbApi
import com.sdkwork.app.api.SkuApi
import com.sdkwork.app.api.ProductsApi
import com.sdkwork.app.api.PositionsApi
import com.sdkwork.app.api.MembersApi
import com.sdkwork.app.api.DepartmentsApi
import com.sdkwork.app.api.ChildrenApi
import com.sdkwork.app.api.StatisticsApi
import com.sdkwork.app.api.MemberApi
import com.sdkwork.app.api.ListApi
import com.sdkwork.app.api.CodeApi
import com.sdkwork.app.api.AuthApi
import com.sdkwork.app.api.GenerationApi

class SdkworkAppClient {
    private val httpClient: HttpClient

    lateinit var workspaces: WorkspacesApi
    lateinit var voiceSpeakers: VoiceSpeakersApi
    lateinit var video: VideoApi
    lateinit var settings: SettingsApi
    lateinit var profile: ProfileApi
    lateinit var password: PasswordApi
    lateinit var address: AddressApi
    lateinit var tenant: TenantApi
    lateinit var social: SocialApi
    lateinit var shops: ShopsApi
    lateinit var share: ShareApi
    lateinit var ai: AiApi
    lateinit var projects: ProjectsApi
    lateinit var partner: PartnerApi
    lateinit var notification: NotificationApi
    lateinit var app: AppApi
    lateinit var news: NewsApi
    lateinit var music: MusicApi
    lateinit var invoice: InvoiceApi
    lateinit var image: ImageApi
    lateinit var style: StyleApi
    lateinit var fileSystem: FileSystemApi
    lateinit var feedback: FeedbackApi
    lateinit var favorite: FavoriteApi
    lateinit var drive: DriveApi
    lateinit var appDocuments: AppDocumentsApi
    lateinit var dashboard: DashboardApi
    lateinit var collection: CollectionApi
    lateinit var chat: ChatApi
    lateinit var character: CharacterApi
    lateinit var category: CategoryApi
    lateinit var cart: CartApi
    lateinit var assets: AssetsApi
    lateinit var announcement: AnnouncementApi
    lateinit var advert: AdvertApi
    lateinit var vote: VoteApi
    lateinit var vip: VipApi
    lateinit var deactivate: DeactivateApi
    lateinit var bind: BindApi
    lateinit var avatar: AvatarApi
    lateinit var upload: UploadApi
    lateinit var search: SearchApi
    lateinit var payments: PaymentsApi
    lateinit var organization: OrganizationApi
    lateinit var disable: DisableApi
    lateinit var activate: ActivateApi
    lateinit var position: PositionApi
    lateinit var department: DepartmentApi
    lateinit var orders: OrdersApi
    lateinit var models: ModelsApi
    lateinit var history: HistoryApi
    lateinit var voiceSpeaker: VoiceSpeakerApi
    lateinit var soundEffect: SoundEffectApi
    lateinit var audio: AudioApi
    lateinit var feed: FeedApi
    lateinit var currency: CurrencyApi
    lateinit var coupons: CouponsApi
    lateinit var comments: CommentsApi
    lateinit var sms: SmsApi
    lateinit var register: RegisterApi
    lateinit var refresh: RefreshApi
    lateinit var qr: QrApi
    lateinit var phone: PhoneApi
    lateinit var oauth: OauthApi
    lateinit var logout: LogoutApi
    lateinit var login: LoginApi
    lateinit var audit: AuditApi
    lateinit var analytics: AnalyticsApi
    lateinit var activity: ActivityApi
    lateinit var account: AccountApi
    lateinit var ab: AbApi
    lateinit var sku: SkuApi
    lateinit var products: ProductsApi
    lateinit var positions: PositionsApi
    lateinit var members: MembersApi
    lateinit var departments: DepartmentsApi
    lateinit var children: ChildrenApi
    lateinit var statistics: StatisticsApi
    lateinit var member: MemberApi
    lateinit var list: ListApi
    lateinit var code: CodeApi
    lateinit var auth: AuthApi
    lateinit var generation: GenerationApi

    constructor(baseUrl: String) {
        this.httpClient = HttpClient(baseUrl)
        workspaces = WorkspacesApi(httpClient)
        voiceSpeakers = VoiceSpeakersApi(httpClient)
        video = VideoApi(httpClient)
        settings = SettingsApi(httpClient)
        profile = ProfileApi(httpClient)
        password = PasswordApi(httpClient)
        address = AddressApi(httpClient)
        tenant = TenantApi(httpClient)
        social = SocialApi(httpClient)
        shops = ShopsApi(httpClient)
        share = ShareApi(httpClient)
        ai = AiApi(httpClient)
        projects = ProjectsApi(httpClient)
        partner = PartnerApi(httpClient)
        notification = NotificationApi(httpClient)
        app = AppApi(httpClient)
        news = NewsApi(httpClient)
        music = MusicApi(httpClient)
        invoice = InvoiceApi(httpClient)
        image = ImageApi(httpClient)
        style = StyleApi(httpClient)
        fileSystem = FileSystemApi(httpClient)
        feedback = FeedbackApi(httpClient)
        favorite = FavoriteApi(httpClient)
        drive = DriveApi(httpClient)
        appDocuments = AppDocumentsApi(httpClient)
        dashboard = DashboardApi(httpClient)
        collection = CollectionApi(httpClient)
        chat = ChatApi(httpClient)
        character = CharacterApi(httpClient)
        category = CategoryApi(httpClient)
        cart = CartApi(httpClient)
        assets = AssetsApi(httpClient)
        announcement = AnnouncementApi(httpClient)
        advert = AdvertApi(httpClient)
        vote = VoteApi(httpClient)
        vip = VipApi(httpClient)
        deactivate = DeactivateApi(httpClient)
        bind = BindApi(httpClient)
        avatar = AvatarApi(httpClient)
        upload = UploadApi(httpClient)
        search = SearchApi(httpClient)
        payments = PaymentsApi(httpClient)
        organization = OrganizationApi(httpClient)
        disable = DisableApi(httpClient)
        activate = ActivateApi(httpClient)
        position = PositionApi(httpClient)
        department = DepartmentApi(httpClient)
        orders = OrdersApi(httpClient)
        models = ModelsApi(httpClient)
        history = HistoryApi(httpClient)
        voiceSpeaker = VoiceSpeakerApi(httpClient)
        soundEffect = SoundEffectApi(httpClient)
        audio = AudioApi(httpClient)
        feed = FeedApi(httpClient)
        currency = CurrencyApi(httpClient)
        coupons = CouponsApi(httpClient)
        comments = CommentsApi(httpClient)
        sms = SmsApi(httpClient)
        register = RegisterApi(httpClient)
        refresh = RefreshApi(httpClient)
        qr = QrApi(httpClient)
        phone = PhoneApi(httpClient)
        oauth = OauthApi(httpClient)
        logout = LogoutApi(httpClient)
        login = LoginApi(httpClient)
        audit = AuditApi(httpClient)
        analytics = AnalyticsApi(httpClient)
        activity = ActivityApi(httpClient)
        account = AccountApi(httpClient)
        ab = AbApi(httpClient)
        sku = SkuApi(httpClient)
        products = ProductsApi(httpClient)
        positions = PositionsApi(httpClient)
        members = MembersApi(httpClient)
        departments = DepartmentsApi(httpClient)
        children = ChildrenApi(httpClient)
        statistics = StatisticsApi(httpClient)
        member = MemberApi(httpClient)
        list = ListApi(httpClient)
        code = CodeApi(httpClient)
        auth = AuthApi(httpClient)
        generation = GenerationApi(httpClient)
    }

    constructor(config: SdkConfig) {
        this.httpClient = HttpClient(config)
        workspaces = WorkspacesApi(httpClient)
        voiceSpeakers = VoiceSpeakersApi(httpClient)
        video = VideoApi(httpClient)
        settings = SettingsApi(httpClient)
        profile = ProfileApi(httpClient)
        password = PasswordApi(httpClient)
        address = AddressApi(httpClient)
        tenant = TenantApi(httpClient)
        social = SocialApi(httpClient)
        shops = ShopsApi(httpClient)
        share = ShareApi(httpClient)
        ai = AiApi(httpClient)
        projects = ProjectsApi(httpClient)
        partner = PartnerApi(httpClient)
        notification = NotificationApi(httpClient)
        app = AppApi(httpClient)
        news = NewsApi(httpClient)
        music = MusicApi(httpClient)
        invoice = InvoiceApi(httpClient)
        image = ImageApi(httpClient)
        style = StyleApi(httpClient)
        fileSystem = FileSystemApi(httpClient)
        feedback = FeedbackApi(httpClient)
        favorite = FavoriteApi(httpClient)
        drive = DriveApi(httpClient)
        appDocuments = AppDocumentsApi(httpClient)
        dashboard = DashboardApi(httpClient)
        collection = CollectionApi(httpClient)
        chat = ChatApi(httpClient)
        character = CharacterApi(httpClient)
        category = CategoryApi(httpClient)
        cart = CartApi(httpClient)
        assets = AssetsApi(httpClient)
        announcement = AnnouncementApi(httpClient)
        advert = AdvertApi(httpClient)
        vote = VoteApi(httpClient)
        vip = VipApi(httpClient)
        deactivate = DeactivateApi(httpClient)
        bind = BindApi(httpClient)
        avatar = AvatarApi(httpClient)
        upload = UploadApi(httpClient)
        search = SearchApi(httpClient)
        payments = PaymentsApi(httpClient)
        organization = OrganizationApi(httpClient)
        disable = DisableApi(httpClient)
        activate = ActivateApi(httpClient)
        position = PositionApi(httpClient)
        department = DepartmentApi(httpClient)
        orders = OrdersApi(httpClient)
        models = ModelsApi(httpClient)
        history = HistoryApi(httpClient)
        voiceSpeaker = VoiceSpeakerApi(httpClient)
        soundEffect = SoundEffectApi(httpClient)
        audio = AudioApi(httpClient)
        feed = FeedApi(httpClient)
        currency = CurrencyApi(httpClient)
        coupons = CouponsApi(httpClient)
        comments = CommentsApi(httpClient)
        sms = SmsApi(httpClient)
        register = RegisterApi(httpClient)
        refresh = RefreshApi(httpClient)
        qr = QrApi(httpClient)
        phone = PhoneApi(httpClient)
        oauth = OauthApi(httpClient)
        logout = LogoutApi(httpClient)
        login = LoginApi(httpClient)
        audit = AuditApi(httpClient)
        analytics = AnalyticsApi(httpClient)
        activity = ActivityApi(httpClient)
        account = AccountApi(httpClient)
        ab = AbApi(httpClient)
        sku = SkuApi(httpClient)
        products = ProductsApi(httpClient)
        positions = PositionsApi(httpClient)
        members = MembersApi(httpClient)
        departments = DepartmentsApi(httpClient)
        children = ChildrenApi(httpClient)
        statistics = StatisticsApi(httpClient)
        member = MemberApi(httpClient)
        list = ListApi(httpClient)
        code = CodeApi(httpClient)
        auth = AuthApi(httpClient)
        generation = GenerationApi(httpClient)
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
